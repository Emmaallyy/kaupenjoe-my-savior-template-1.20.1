package net.emmaallyy.tutorialmod;

import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.emmaallyy.tutorialmod.entity.effect.TruePredatorStatusEffect;
import net.emmaallyy.tutorialmod.item.custom.ModItems;
import net.emmaallyy.tutorialmod.item.custom.ModItemsGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaupenjoeMySavior implements ModInitializer {
	public static final String MOD_ID = "kaupenjoemysavior";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final StatusEffect TP = new TruePredatorStatusEffect();
	public static final Identifier FART = new Identifier("kaupenjoemysavior:fart");
	public static SoundEvent FARTING = SoundEvent.of(FART);


	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Registry.register(Registries.STATUS_EFFECT,new Identifier("kaupenjoemysavior","tp"), TP);
		Registry.register(Registries.SOUND_EVENT, KaupenjoeMySavior.FART, FARTING);


		FuelRegistry.INSTANCE.add(ModItems.ENERGYFRUIT, 2400);

	}
}