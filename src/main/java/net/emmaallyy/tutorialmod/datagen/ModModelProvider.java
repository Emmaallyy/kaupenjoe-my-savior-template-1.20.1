package net.emmaallyy.tutorialmod.datagen;

import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.emmaallyy.tutorialmod.item.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOONGITE_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCREAM_SAND);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CREWMATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOONGITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENERGYFRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARBATOSSOUL, Models.GENERATED);
        itemModelGenerator.register(ModItems.METALDETECTOR, Models.GENERATED);
    }
}
