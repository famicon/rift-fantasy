package net.fantasy.rift.world;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.s2c.play.TitleTextS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class CutsceneHelper {
    public static void triggerRiftCutscene(ServerPlayerEntity player, String titleText) {
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 120, 255, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 40, 0, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 200, 0, false, false));
        player.networkHandler.sendPacket(new TitleTextS2CPacket(Text.literal("§6" + titleText)));
    }
}
