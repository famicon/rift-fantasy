package net.fantasy.rift.world;

import net.fantasy.rift.RiftFantasyMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class RiftDimension {
    public static final RegistryKey<World> RIFT_WORLD_KEY = RegistryKey.of(
        RegistryKeys.WORLD, new Identifier(RiftFantasyMod.MOD_ID, "the_rift")
    );
    public static final RegistryKey<DimensionType> RIFT_DIMENSION_TYPE = RegistryKey.of(
        RegistryKeys.DIMENSION_TYPE, new Identifier(RiftFantasyMod.MOD_ID, "the_rift_type")
    );

    public static void registerDimension() {
        // Dimension registered
    }
}
