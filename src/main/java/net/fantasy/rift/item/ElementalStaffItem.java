package net.fantasy.rift.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ElementalStaffItem extends Item {
    public ElementalStaffItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!world.isClient) {
            Vec3d look = user.getRotationVec(1.0F);
            FireballEntity bolt = new FireballEntity(world, user, look.x, look.y, look.z, 2);
            bolt.setPosition(user.getX() + look.x * 1.5, user.getEyeY() + look.y * 1.5, user.getZ() + look.z * 1.5);
            world.spawnEntity(bolt);

            stack.damage(1, user, (p) -> p.sendToolBreakStatus(hand));
        }

        world.playSound(user, user.getBlockPos(), SoundEvents.ENTITY_ILLUSIONER_CAST_SPELL, SoundCategory.PLAYERS, 1.0f, 1.0f);

        for (int i = 0; i < 12; i++) {
            world.addParticle(
                ParticleTypes.PORTAL,
                user.getX() + (world.random.nextDouble() - 0.5),
                user.getY() + 1.0,
                user.getZ() + (world.random.nextDouble() - 0.5),
                (world.random.nextDouble() - 0.5) * 2,
                (world.random.nextDouble() - 0.5) * 2,
                (world.random.nextDouble() - 0.5) * 2
            );
        }

        user.getItemCooldownManager().set(this, 30);
        return TypedActionResult.success(stack, world.isClient());
    }
}
