package net.emmaallyy.tutorialmod.item.custom;

import net.emmaallyy.tutorialmod.KaupenjoeMySavior;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class WhoopieCushion extends Item {
    public WhoopieCushion(Settings settings)
    {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        user.playSound(KaupenjoeMySavior.FARTING, 1,1);
        return ActionResult.SUCCESS;
    }
}
