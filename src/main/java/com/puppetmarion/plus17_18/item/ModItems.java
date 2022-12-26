package com.puppetmarion.plus17_18.item;

import com.puppetmarion.plus17_18.Plus17_18;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Plus17_18.MOD_ID);

    // Ruby items
    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    // Citrine items
    public static final RegistryObject<Item> CITRINE =
            ITEMS.register("citrine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> RAW_CITRINE =
            ITEMS.register("raw_citrine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));

    // Rose gold items
    public static final RegistryObject<Item> ROSE_GOLD_INGOT =
            ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    // Tools
    public static final RegistryObject<Item> ROSE_GOLD_SWORD =
            ITEMS.register("rose_gold_sword", () -> new SwordItem(ModTiers.ROSE_GOLD, 4, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE =
            ITEMS.register("rose_gold_pickaxe", () -> new PickaxeItem(ModTiers.ROSE_GOLD, 2, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> ROSE_GOLD_AXE =
            ITEMS.register("rose_gold_axe", () -> new AxeItem(ModTiers.ROSE_GOLD, 7, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL =
            ITEMS.register("rose_gold_shovel", () -> new ShovelItem(ModTiers.ROSE_GOLD, 2, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> ROSE_GOLD_HOE =
            ITEMS.register("rose_gold_hoe", () -> new HoeItem(ModTiers.ROSE_GOLD, 0, -2.4f, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));

    // Armor
    public static final RegistryObject<Item> ROSE_GOLD_HELMET =
            ITEMS.register("rose_gold_helmet", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE =
            ITEMS.register("rose_gold_chestplate", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS =
            ITEMS.register("rose_gold_leggings", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS =
            ITEMS.register("rose_gold_boots", () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
