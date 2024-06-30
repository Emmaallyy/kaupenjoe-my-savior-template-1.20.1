package net.emmaallyy.tutorialmod.item.custom;

import net.emmaallyy.tutorialmod.KaupenjoeMySavior;
import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item CREWMATE = registerItem("moongus", new Item(new FabricItemSettings()));
    public static final Item MOONGITE = registerItem("moongite", new Item(new FabricItemSettings()));
    public static final Item BARBATOSSOUL = registerItem("barbatos_soul", new BarbatosSoul(new FabricItemSettings()));
    public static final Item ENERGYFRUIT = registerItem("energy_fruit", new Item(new FabricItemSettings().food(ModFoodComponents.ENERGYFRUIT)));

    public static final Item METALDETECTOR = registerItem("meetingbutton",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(CREWMATE);
        entries.add(MOONGITE);
        entries.add(BARBATOSSOUL);
    }
    private static void addItemsToBlocksItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(ModBlocks.SCREAM_SAND);
        entries.add(ModBlocks.ASTRAL_PLANKS);
        entries.add(ModBlocks.ASTRAL_STAIRS);
        entries.add(ModBlocks.ASTRAL_SLAB);
        entries.add(ModBlocks.ASTRAL_BUTTON);
        entries.add(ModBlocks.ASTRAL_PRESSURE_PLATE);
        entries.add(ModBlocks.ASTRAL_FENCE);
        entries.add(ModBlocks.ASTRAL_FENCE_GATE);
        entries.add(ModBlocks.ASTRAL_WALL);
        entries.add(ModBlocks.ASTRAL_DOOR);
        entries.add(ModBlocks.ASTRAL_TRAPDOOR);
    }
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(ENERGYFRUIT);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(KaupenjoeMySavior.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        KaupenjoeMySavior.LOGGER.info("Registering Mod Items for " + KaupenjoeMySavior.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBlocksItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }


}
