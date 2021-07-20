package com.strangequark.quarkoverhaul.registry;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial
{
    public static final ObsidianToolMaterial INSTANCE = new ObsidianToolMaterial();

    @Override
    public int getDurability()
    {
        return 1800;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 6.0F;
    }

    @Override
    public float getAttackDamage()
    {
        return 0;
    }

    @Override
    public int getMiningLevel()
    {
        return 3;
    }

    @Override
    public int getEnchantability()
    {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(Items.OBSIDIAN);
    }
}
