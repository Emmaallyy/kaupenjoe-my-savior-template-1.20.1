package net.emmaallyy.tutorialmod;

import net.emmaallyy.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaupenjoeMySavior implements ModInitializer {
	public static final String MOD_ID = "kaupenjoemysavior";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}