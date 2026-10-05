package com.ivonwobodo.ironmanarmormod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class Main implements ModInitializer {
    public static final String MOD_ID = "ironmanarmormod";
    public static final ArmorItem IRON_MAN_ARMOR = new ArmorItem(ArmorMaterial.IRON, ArmorItem.Type.CHESTPLATE, new Item.Settings().group(ItemGroup.COMBAT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_man_armor"), IRON_MAN_ARMOR);
        System.out.println("Iron Man Armor Mod initialized!");
    }
}
