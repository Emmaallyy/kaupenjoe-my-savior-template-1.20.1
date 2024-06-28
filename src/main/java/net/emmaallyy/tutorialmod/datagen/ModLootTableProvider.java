package net.emmaallyy.tutorialmod.datagen;

import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.emmaallyy.tutorialmod.item.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SCREAM_SAND);
        addDrop(ModBlocks.MOONGITE_BLOCK, oreDrops(ModBlocks.MOONGITE_BLOCK, ModItems.MOONGITE));
    }
}
