package net.emmaallyy.tutorialmod.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ENERGYFRUIT = new FoodComponent.Builder().hunger(4).saturationModifier(3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f)
            .build();
}
