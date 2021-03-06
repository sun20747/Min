package net.minecraft.world.level.block.state.properties;

import net.minecraft.util.INamable;

public enum BlockPropertyDoubleBlockHalf implements INamable {

    UPPER, LOWER;

    private BlockPropertyDoubleBlockHalf() {}

    public String toString() {
        return this.getSerializedName();
    }

    @Override
    public String getSerializedName() {
        return this == BlockPropertyDoubleBlockHalf.UPPER ? "upper" : "lower";
    }
}
