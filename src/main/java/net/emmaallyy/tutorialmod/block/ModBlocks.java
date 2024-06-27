package net.emmaallyy.tutorialmod.block;

import net.emmaallyy.tutorialmod.KaupenjoeMySavior;
import net.emmaallyy.tutorialmod.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block MOONGITE_BLOCK = registerBlock("moongite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(3f), UniformIntProvider.create(2, 5)));
    public static final Block SCREAM_SAND = registerBlock("scream_sand",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND).strength(1f), UniformIntProvider.create(2, 5)));


    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KaupenjoeMySavior.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(KaupenjoeMySavior.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks()
    {
        KaupenjoeMySavior.LOGGER.info("Registering Modblocks for " + KaupenjoeMySavior.MOD_ID);
    }
}
