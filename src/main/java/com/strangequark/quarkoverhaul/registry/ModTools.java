package com.strangequark.quarkoverhaul.registry;

import com.strangequark.quarkoverhaul.QuarkOverhaul;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTools
{
    public static final ToolItem OBSIDIAN_PICKAXE = new ObsidianPickaxeItem(ObsidianToolMaterial.INSTANCE, 1, 1.0F, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerTools()
    {
        Registry.register(Registry.ITEM, new Identifier(QuarkOverhaul.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
    }
}
