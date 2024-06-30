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
        addDrop(ModBlocks.ASTRAL_PLANKS);
        addDrop(ModBlocks.ASTRAL_STAIRS);
        addDrop(ModBlocks.ASTRAL_BUTTON);
        addDrop(ModBlocks.ASTRAL_PRESSURE_PLATE);
        addDrop(ModBlocks.ASTRAL_FENCE);
        addDrop(ModBlocks.ASTRAL_FENCE_GATE);
        addDrop(ModBlocks.ASTRAL_WALL);
        addDrop(ModBlocks.ASTRAL_TRAPDOOR);

        addDrop(ModBlocks.ASTRAL_DOOR, doorDrops(ModBlocks.ASTRAL_DOOR));
        addDrop(ModBlocks.ASTRAL_SLAB, slabDrops(ModBlocks.ASTRAL_SLAB));

        addDrop(ModBlocks.MOONGITE_BLOCK, oreDrops(ModBlocks.MOONGITE_BLOCK, ModItems.MOONGITE));
    }
}
