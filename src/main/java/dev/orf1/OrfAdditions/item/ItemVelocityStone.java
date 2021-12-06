package dev.orf1.OrfAdditions.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;

import java.util.Objects;

public class ItemVelocityStone extends Item {
    public ItemVelocityStone(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        World world = context.getWorld();

        if(!world.isRemote) {
            PlayerEntity playerEntity = Objects.requireNonNull(context.getPlayer());
            playerEntity.setMotion(playerEntity.getMotion().scale(2));
            playerEntity.velocityChanged=true;
        }

        return super.onItemUseFirst(stack, context);
    }
}