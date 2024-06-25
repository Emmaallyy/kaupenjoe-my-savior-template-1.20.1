package net.emmaallyy.tutorialmod.item;

import net.emmaallyy.tutorialmod.KaupenjoeMySavior;
import net.emmaallyy.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemsGroups {
    public static final ItemGroup MOONGUS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KaupenjoeMySavior.MOD_ID, "moongus"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.moongus"))
                    .icon(() -> new ItemStack(ModItems.CREWMATE)).entries((displayContext, entries) -> {
                    entries.add(ModItems.CREWMATE);
                    entries.add(ModItems.MOONGITE);
                    entries.add(ModBlocks.MOONGITE_BLOCK);
                    }).build());


    public static void registerItemGroups()
    {
        KaupenjoeMySavior.LOGGER.info("Registering Item Groups for " +KaupenjoeMySavior.MOD_ID);
    }
}
