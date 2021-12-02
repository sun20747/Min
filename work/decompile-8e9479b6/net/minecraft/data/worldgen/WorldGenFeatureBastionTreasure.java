package net.minecraft.data.worldgen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.MinecraftKey;
import net.minecraft.world.level.levelgen.feature.structures.WorldGenFeatureDefinedStructurePoolStructure;
import net.minecraft.world.level.levelgen.feature.structures.WorldGenFeatureDefinedStructurePoolTemplate;

public class WorldGenFeatureBastionTreasure {

    public WorldGenFeatureBastionTreasure() {}

    public static void bootstrap() {}

    static {
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/bases"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/bases/lava_basin", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/stairs"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/stairs/lower_stairs", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/bases/centers"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/bases/centers/center_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/bases/centers/center_1", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/bases/centers/center_2", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/bases/centers/center_3", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/brains"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/brains/center_brain", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/walls"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/lava_wall", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/entrance_wall", ProcessorLists.HIGH_WALL), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/walls/outer"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/outer/top_corner", ProcessorLists.HIGH_WALL), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/outer/mid_corner", ProcessorLists.HIGH_WALL), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/outer/bottom_corner", ProcessorLists.HIGH_WALL), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/outer/outer_wall", ProcessorLists.HIGH_WALL), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/outer/medium_outer_wall", ProcessorLists.HIGH_WALL), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/outer/tall_outer_wall", ProcessorLists.HIGH_WALL), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/walls/bottom"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/bottom/wall_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/bottom/wall_1", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/bottom/wall_2", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/bottom/wall_3", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/walls/mid"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/mid/wall_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/mid/wall_1", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/mid/wall_2", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/walls/top"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/top/main_entrance", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/top/wall_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/walls/top/wall_1", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/connectors"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/connectors/center_to_wall_middle", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/connectors/center_to_wall_top", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/connectors/center_to_wall_top_entrance", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/entrances"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/entrances/entrance_0", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/ramparts"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/ramparts/mid_wall_main", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/ramparts/mid_wall_side", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/ramparts/bottom_wall_0", ProcessorLists.BOTTOM_RAMPART), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/ramparts/top_wall", ProcessorLists.HIGH_RAMPART), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/ramparts/lava_basin_side", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/ramparts/lava_basin_main", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/corners/bottom"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/bottom/corner_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/bottom/corner_1", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/corners/edges"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/edges/bottom", ProcessorLists.HIGH_WALL), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/edges/middle", ProcessorLists.HIGH_WALL), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/edges/top", ProcessorLists.HIGH_WALL), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/corners/middle"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/middle/corner_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/middle/corner_1", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/corners/top"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/top/corner_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/corners/top/corner_1", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/extensions/large_pool"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/empty", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/empty", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/fire_room", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/large_bridge_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/large_bridge_1", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/large_bridge_2", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/large_bridge_3", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/roofed_bridge", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/empty", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/extensions/small_pool"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/empty", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/fire_room", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/empty", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/small_bridge_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/small_bridge_1", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/small_bridge_2", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/small_bridge_3", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/extensions/houses"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/house_0", ProcessorLists.TREASURE_ROOMS), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/extensions/house_1", ProcessorLists.TREASURE_ROOMS), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.register(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("bastion/treasure/roofs"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/roofs/wall_roof", ProcessorLists.ROOF), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/roofs/corner_roof", ProcessorLists.ROOF), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.single("bastion/treasure/roofs/center_roof", ProcessorLists.ROOF), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
    }
}
