package com.visnaa.morejewels.item.tool;

import com.visnaa.morejewels.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ToolMaterials implements IItemTier
{
    RUBY(3, 1405, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.RUBY.get());
    }),
    SAPPHIRE(3, 1405, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.SAPPHIRE.get());
    }),
    AQUAMARINE(3, 1249, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.AQUAMARINE.get());
    }),
    JADE(3, 1093, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.JADE.get());
    }),
    OPAL(3, 1015, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.OPAL.get());
    }),
    YELLOW_DIAMOND(3, 1561, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.YELLOW_DIAMOND.get());
    }),
    AMBER(3, 390, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.AMBER.get());
    }),
    AMETHYST(3, 1093, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.AMETHYST.get());
    }),
    TOPAZ(3, 1249, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.TOPAZ.get());
    }),
    PLATINUM(3, 702, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.PLATINUM.get());
    }),
    BERYLLIUM(3, 1249, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.BERYLLIUM.get());
    }),
    BIXBIT(3, 1249, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.BIXBIT.get());
    }),
    MALACHITE(3, 702, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.MALACHITE.get());
    }),
    ONYX(3, 1093, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.ONYX.get());
    }),
    PERIDOT(3, 1093, 8.5F, 3.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.PERIDOT.get());
    }),
    MOON_STONE(3, 1015, 8.5F, 3.0F, 15, () -> {
    return Ingredient.fromItems(ModItems.MOON_STONE.get());
    }),
    SUN_STONE(3, 1015, 8.5F, 3.0F, 15, () -> {
    return Ingredient.fromItems(ModItems.SUN_STONE.get());
    }),
    CITRINE(3, 1093, 8.5F, 3.0F, 15, () -> {
    return Ingredient.fromItems(ModItems.CITRINE.get());
    }),
    DOLOMITE(3, 624, 8.5F, 3.0F, 15, () -> {
    return Ingredient.fromItems(ModItems.DOLOMITE.get());
    }),
    TANZANITE(3, 1015, 8.5F, 3.0F, 15, () -> {
    return Ingredient.fromItems(ModItems.TANZANITE.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private ToolMaterials(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

}
