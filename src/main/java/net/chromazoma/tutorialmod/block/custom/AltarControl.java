package net.chromazoma.tutorialmod.block.custom;

import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.item.Item;

import javax.swing.*;
import java.util.function.Predicate;


public class AltarControl extends Block{

    public AltarControl(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
           ItemStack itemStack = player.getStackInHand(hand);

        if (hand == Hand.MAIN_HAND && player.isHolding(Items.DIAMOND)){
            itemStack.decrement(1);

            player.addExperience(1000000);
        }
        return ActionResult.SUCCESS;
    }

}

