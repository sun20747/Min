package net.minecraft.data.structures;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.data.DebugReportGenerator;
import net.minecraft.data.DebugReportProvider;
import net.minecraft.data.HashCache;
import net.minecraft.nbt.GameProfileSerializer;
import net.minecraft.nbt.NBTCompressedStreamTools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebugReportNBT implements DebugReportProvider {

    private static final Logger LOGGER = LogManager.getLogger();
    private final DebugReportGenerator generator;

    public DebugReportNBT(DebugReportGenerator debugreportgenerator) {
        this.generator = debugreportgenerator;
    }

    @Override
    public void run(HashCache hashcache) throws IOException {
        Path path = this.generator.getOutputFolder();
        Iterator iterator = this.generator.getInputFolders().iterator();

        while (iterator.hasNext()) {
            Path path1 = (Path) iterator.next();

            Files.walk(path1).filter((path2) -> {
                return path2.toString().endsWith(".nbt");
            }).forEach((path2) -> {
                convertStructure(path2, this.getName(path1, path2), path);
            });
        }

    }

    @Override
    public String getName() {
        return "NBT to SNBT";
    }

    private String getName(Path path, Path path1) {
        String s = path.relativize(path1).toString().replaceAll("\\\\", "/");

        return s.substring(0, s.length() - ".nbt".length());
    }

    @Nullable
    public static Path convertStructure(Path path, String s, Path path1) {
        try {
            writeSnbt(path1.resolve(s + ".snbt"), GameProfileSerializer.structureToSnbt(NBTCompressedStreamTools.readCompressed(Files.newInputStream(path))));
            DebugReportNBT.LOGGER.info("Converted {} from NBT to SNBT", s);
            return path1.resolve(s + ".snbt");
        } catch (IOException ioexception) {
            DebugReportNBT.LOGGER.error("Couldn't convert {} from NBT to SNBT at {}", s, path, ioexception);
            return null;
        }
    }

    public static void writeSnbt(Path path, String s) throws IOException {
        Files.createDirectories(path.getParent());
        BufferedWriter bufferedwriter = Files.newBufferedWriter(path);

        try {
            bufferedwriter.write(s);
            bufferedwriter.write(10);
        } catch (Throwable throwable) {
            if (bufferedwriter != null) {
                try {
                    bufferedwriter.close();
                } catch (Throwable throwable1) {
                    throwable.addSuppressed(throwable1);
                }
            }

            throw throwable;
        }

        if (bufferedwriter != null) {
            bufferedwriter.close();
        }

    }
}
