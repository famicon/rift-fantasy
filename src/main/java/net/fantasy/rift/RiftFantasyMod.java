package net.fantasy.rift;

import net.fabricmc.api.ModInitializer;
import net.fantasy.rift.item.ElementalStaffItem;
import net.fantasy.rift.item.RiftForgedBladeItem;
import net.fantasy.rift.quest.Questlines;
import net.fantasy.rift.world.RiftDimension;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RiftFantasyMod implements ModInitializer {
    public static final String MOD_ID = "riftfantasymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item RIFT_FORGED_BLADE = new RiftForgedBladeItem(
        ToolMaterials.NETHERITE, 4, -2.4f, new Item.Settings().fireproof()
    );
    public static final Item ELEMENTAL_STAFF = new ElementalStaffItem(
        new Item.Settings().maxDamage(650)
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Starting The Rift Mod initialization...");
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rift_forged_blade"), RIFT_FORGED_BLADE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "elemental_staff"), ELEMENTAL_STAFF);
        
        RiftDimension.registerDimension();
        Questlines.initializeQuestlines();
    }
}
