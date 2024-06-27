package net.emmaallyy.tutorialmod;

import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.emmaallyy.tutorialmod.item.custom.ModItems;
import net.emmaallyy.tutorialmod.item.custom.ModItemsGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaupenjoeMySavior implements ModInitializer {
	public static final String MOD_ID = "kaupenjoemysavior";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.ENERGYFRUIT, 2400);

	}
}