package net.emmaallyy.tutorialmod.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class TruePredatorStatusEffect extends StatusEffect {
    public TruePredatorStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 16711680);
        super.addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2F, EntityAttributeModifier.Operation.MULTIPLY_TOTAL
        );
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getHealth() < entity.getMaxHealth())
        {
            entity.heal(1f);
        }

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 50 >> amplifier;
        return i > 0 ? duration % i == 0 : true;
    }
}

