package net.emmaallyy.tutorialmod.datagen;

import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.emmaallyy.tutorialmod.item.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> MOONGUS_SMELTABLES = List.of(ModItems.MOONGITE,
            ModBlocks.MOONGITE_BLOCK);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, MOONGUS_SMELTABLES, RecipeCategory.MISC, ModItems.CREWMATE, 0.7f,200, "moongus");
        offerBlasting(exporter, MOONGUS_SMELTABLES, RecipeCategory.MISC, ModItems.CREWMATE, 0.7f,100, "moongus");
    }
}
