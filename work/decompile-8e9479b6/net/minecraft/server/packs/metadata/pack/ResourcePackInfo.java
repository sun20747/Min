package net.minecraft.server.packs.metadata.pack;

import net.minecraft.network.chat.IChatBaseComponent;

public class ResourcePackInfo {

    public static final ResourcePackInfoDeserializer SERIALIZER = new ResourcePackInfoDeserializer();
    private final IChatBaseComponent description;
    private final int packFormat;

    public ResourcePackInfo(IChatBaseComponent ichatbasecomponent, int i) {
        this.description = ichatbasecomponent;
        this.packFormat = i;
    }

    public IChatBaseComponent getDescription() {
        return this.description;
    }

    public int getPackFormat() {
        return this.packFormat;
    }
}
