package net.emmaallyy.tutorialmod.item;

import net.emmaallyy.tutorialmod.KaupenjoeMySavior;
import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.emmaallyy.tutorialmod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
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

    public static final Item METALDETECTOR = registerItem("meetingbutton",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(CREWMATE);
        entries.add(MOONGITE);
    }
    private static void addItemsToBlocksItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(ModBlocks.SCREAM_SAND);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(KaupenjoeMySavior.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        KaupenjoeMySavior.LOGGER.info("Registering Mod Items for " + KaupenjoeMySavior.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBlocksItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }


}
