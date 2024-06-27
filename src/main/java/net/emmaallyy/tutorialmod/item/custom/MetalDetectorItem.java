package net.emmaallyy.tutorialmod.item.custom;

import net.emmaallyy.tutorialmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;
            outerLoop:
            for(int x = -1; x <= 1; x++) {
                for(int z = -1; z <= 1; z++) {
                    for (int i = 64; i >= positionClicked.getY() - 128; i--) {
                        BlockState state = context.getWorld().getBlockState(positionClicked.add(x, i, z));

                        if (isValuableBlock(state)) {
                            outputValuableCoordinates(positionClicked.add(x, i, z), player, state.getBlock());
                            foundBlock = true;

                            break outerLoop;
                        }
                    }
                }
            }




            if (!foundBlock)
            {
                player.sendMessage(Text.literal("No Valuables Found"));
            }
        }
        context.getStack().damage(1,context.getPlayer(), playerEntity ->
                playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + block.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"), false);
    }

    private boolean isValuableBlock(BlockState state) {
        return state.isIn(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.kaupenjoemysavior.metaldetector.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
