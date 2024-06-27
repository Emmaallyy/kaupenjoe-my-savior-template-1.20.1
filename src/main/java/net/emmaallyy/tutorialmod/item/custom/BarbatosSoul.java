package net.emmaallyy.tutorialmod.item.custom;

import net.emmaallyy.tutorialmod.KaupenjoeMySavior;
import net.emmaallyy.tutorialmod.entity.effect.TruePredatorStatusEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class BarbatosSoul extends Item {
    public BarbatosSoul(Settings settings)
    {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if (!world.isClient() && entity instanceof PlayerEntity player) {
            if (!player.hasStatusEffect(KaupenjoeMySavior.TP)) {
                SatusEffectAdd(world, entity);
            }

        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
    private void SatusEffectAdd(World world, Entity entity)
    {
        if (!world.isClient() && entity instanceof PlayerEntity player)
        {
            player.addStatusEffect(new StatusEffectInstance(KaupenjoeMySavior.TP, 100, 0));
        }
    }
}
