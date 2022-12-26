package com.puppetmarion.plus17_18.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ROSE_GOLD =
            new ForgeTier(2, 550, 6.8f, 2.5f, 16, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get()));
}
