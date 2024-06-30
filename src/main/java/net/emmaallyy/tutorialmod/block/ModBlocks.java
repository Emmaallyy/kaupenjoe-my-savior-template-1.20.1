package net.emmaallyy.tutorialmod.block;

import net.emmaallyy.tutorialmod.KaupenjoeMySavior;
import net.emmaallyy.tutorialmod.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
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
    public static final Block ASTRAL_PLANKS = registerBlock("astral_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));


    public static final Block ASTRAL_STAIRS = registerBlock("astral_stairs",
            new StairsBlock(ModBlocks.ASTRAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_STAIRS)));
    public static final Block ASTRAL_SLAB = registerBlock("astral_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB)));

    public static final Block ASTRAL_BUTTON = registerBlock("astral_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON), BlockSetType.SPRUCE, 10, true));
    public static final Block ASTRAL_PRESSURE_PLATE = registerBlock("astral_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE), BlockSetType.SPRUCE));

    public static final Block ASTRAL_FENCE = registerBlock("astral_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE)));
    public static final Block ASTRAL_FENCE_GATE = registerBlock("astral_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE), WoodType.SPRUCE));
    public static final Block ASTRAL_WALL = registerBlock("astral_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE)));

    public static final Block ASTRAL_DOOR = registerBlock("astral_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final Block ASTRAL_TRAPDOOR = registerBlock("astral_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));


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
