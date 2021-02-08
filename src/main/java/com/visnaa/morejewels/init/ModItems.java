package com.visnaa.morejewels.init;

import com.visnaa.morejewels.Main;
import com.visnaa.morejewels.item.material.CustomMaterial;
import com.visnaa.morejewels.util.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    private static final int SWORD_DAMAGE = 3;
    private static final float SHOVEL_DAMAGE = 1.5F;
    private static final int PICKAXE_DAMAGE = 1;
    private static final float AXE_DAMAGE = 5.0F;
    private static final int HOE_DAMAGE = -3;
    private static final float SWORD_SPEED = -2.4F;
    private static final float SHOVEL_SPEED = -3.0F;
    private static final float PICKAXE_SPEED = -2.8F;
    private static final float AXE_SPEED = -3.0F;
    private static final float HOE_SPEED = 0.0F;

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_RUBY = ITEMS.register("rough_ruby", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_SAPPHIRE = ITEMS.register("rough_sapphire", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_AQUAMARINE = ITEMS.register("rough_aquamarine", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_JADE = ITEMS.register("rough_jade", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_OPAL = ITEMS.register("rough_opal", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> YELLOW_DIAMOND = ITEMS.register("yellow_diamond", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_YELLOW_DIAMOND = ITEMS.register("rough_yellow_diamond", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_AMBER = ITEMS.register("rough_amber", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_AMETHYST = ITEMS.register("rough_amethyst", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_TOPAZ = ITEMS.register("rough_topaz", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> PLATINUM = ITEMS.register("platinum", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_PLATINUM = ITEMS.register("rough_platinum", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> BERYLLIUM = ITEMS.register("beryllium", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_BERYLLIUM = ITEMS.register("rough_beryllium", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));

    //Food
    public static final RegistryObject<Item> BAD_APPLE = ITEMS.register("bad_apple", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(0.0F).effect(new EffectInstance(Effects.POISON, 20 * 15, 3), 1F).build())));
    public static final RegistryObject<Item> JADE_RING = ITEMS.register("jade_ring", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(6.0F).effect(new EffectInstance(Effects.GLOWING, 20 * 30, 1), 1F).build())));

    //Block Items
    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(ModBlocks.SAPPHIRE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AQUAMARINE_BLOCK = ITEMS.register("aquamarine_block", () -> new BlockItem(ModBlocks.AQUAMARINE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AQUAMARINE_ORE = ITEMS.register("aquamarine_ore", () -> new BlockItem(ModBlocks.AQUAMARINE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JADE_BLOCK = ITEMS.register("jade_block", () -> new BlockItem(ModBlocks.JADE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JADE_ORE = ITEMS.register("jade_ore", () -> new BlockItem(ModBlocks.JADE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> OPAL_BLOCK = ITEMS.register("opal_block", () -> new BlockItem(ModBlocks.OPAL_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> POLISHED_OPAL_BLOCK = ITEMS.register("polished_opal_block", () -> new BlockItem(ModBlocks.POLISHED_OPAL_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> OPAL_ORE = ITEMS.register("opal_ore", () -> new BlockItem(ModBlocks.OPAL_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> YELLOW_DIAMOND_BLOCK = ITEMS.register("yellow_diamond_block", () -> new BlockItem(ModBlocks.YELLOW_DIAMOND_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> YELLOW_DIAMOND_ORE = ITEMS.register("yellow_diamond_ore", () -> new BlockItem(ModBlocks.YELLOW_DIAMOND_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AMBER_BLOCK = ITEMS.register("amber_block", () -> new BlockItem(ModBlocks.AMBER_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AMBER_ORE = ITEMS.register("amber_ore", () -> new BlockItem(ModBlocks.AMBER_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AMETHYST_BLOCK = ITEMS.register("amethyst_block", () -> new BlockItem(ModBlocks.AMETHYST_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AMETHYST_ORE = ITEMS.register("amethyst_ore", () -> new BlockItem(ModBlocks.AMETHYST_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> TOPAZ_BLOCK = ITEMS.register("topaz_block", () -> new BlockItem(ModBlocks.TOPAZ_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> TOPAZ_ORE = ITEMS.register("topaz_ore", () -> new BlockItem(ModBlocks.TOPAZ_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> PLATINUM_BLOCK = ITEMS.register("platinum_block", () -> new BlockItem(ModBlocks.PLATINUM_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> PLATINUM_ORE = ITEMS.register("platinum_ore", () -> new BlockItem(ModBlocks.PLATINUM_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> BERYLLIUM_BLOCK = ITEMS.register("beryllium_block", () -> new BlockItem(ModBlocks.BERYLLIUM_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> BERYLLIUM_ORE = ITEMS.register("beryllium_ore", () -> new BlockItem(ModBlocks.BERYLLIUM_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));


    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> AQUAMARINE_SWORD = ITEMS.register("aquamarine_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> AQUAMARINE_SHOVEL = ITEMS.register("aquamarine_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> AQUAMARINE_PICKAXE = ITEMS.register("aquamarine_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> AQUAMARINE_AXE = ITEMS.register("aquamarine_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> AQUAMARINE_HOE = ITEMS.register("aquamarine_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> JADE_SWORD = ITEMS.register("jade_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> JADE_SHOVEL = ITEMS.register("jade_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> JADE_PICKAXE = ITEMS.register("jade_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> JADE_AXE = ITEMS.register("jade_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> JADE_HOE = ITEMS.register("jade_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> OPAL_SWORD = ITEMS.register("opal_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> OPAL_SHOVEL = ITEMS.register("opal_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> OPAL_PICKAXE = ITEMS.register("opal_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> OPAL_AXE = ITEMS.register("opal_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> OPAL_HOE = ITEMS.register("opal_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> YELLOW_DIAMOND_SWORD = ITEMS.register("yellow_diamond_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> YELLOW_DIAMOND_SHOVEL = ITEMS.register("yellow_diamond_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> YELLOW_DIAMOND_PICKAXE = ITEMS.register("yellow_diamond_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> YELLOW_DIAMOND_AXE = ITEMS.register("yellow_diamond_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> YELLOW_DIAMOND_HOE = ITEMS.register("yellow_diamond_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> AMBER_SWORD = ITEMS.register("amber_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> AMBER_SHOVEL = ITEMS.register("amber_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem>AMBER_PICKAXE = ITEMS.register("amber_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> AMBER_AXE = ITEMS.register("amber_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> AMBER_HOE = ITEMS.register("amber_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> BERYLLIUM_SWORD = ITEMS.register("beryllium_sword", () -> new SwordItem(ItemTier.DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> BERYLLIUM_SHOVEL = ITEMS.register("beryllium_shovel", () -> new ShovelItem(ItemTier.DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> BERYLLIUM_PICKAXE = ITEMS.register("beryllium_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> BERYLLIUM_AXE = ITEMS.register("beryllium_axe", () -> new AxeItem(ItemTier.DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> BERYLLIUM_HOE = ITEMS.register("beryllium_hoe", () -> new HoeItem(ItemTier.DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    //Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(CustomMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(CustomMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(CustomMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(CustomMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(CustomMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(CustomMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(CustomMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(CustomMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> AQUAMARINE_HELMET = ITEMS.register("aquamarine_helmet", () -> new ArmorItem(CustomMaterial.AQUAMARINE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AQUAMARINE_CHESTPLATE = ITEMS.register("aquamarine_chestplate", () -> new ArmorItem(CustomMaterial.AQUAMARINE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AQUAMARINE_LEGGINGS = ITEMS.register("aquamarine_leggings", () -> new ArmorItem(CustomMaterial.AQUAMARINE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AQUAMARINE_BOOTS = ITEMS.register("aquamarine_boots", () -> new ArmorItem(CustomMaterial.AQUAMARINE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> JADE_HELMET = ITEMS.register("jade_helmet", () -> new ArmorItem(CustomMaterial.JADE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> JADE_CHESTPLATE = ITEMS.register("jade_chestplate", () -> new ArmorItem(CustomMaterial.JADE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> JADE_LEGGINGS = ITEMS.register("jade_leggings", () -> new ArmorItem(CustomMaterial.JADE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> JADE_BOOTS = ITEMS.register("jade_boots", () -> new ArmorItem(CustomMaterial.JADE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> OPAL_HELMET = ITEMS.register("opal_helmet", () -> new ArmorItem(CustomMaterial.OPAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate", () -> new ArmorItem(CustomMaterial.OPAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> OPAL_LEGGINGS = ITEMS.register("opal_leggings", () -> new ArmorItem(CustomMaterial.OPAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> OPAL_BOOTS = ITEMS.register("opal_boots", () -> new ArmorItem(CustomMaterial.OPAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_HELMET = ITEMS.register("yellow_diamond_helmet", () -> new ArmorItem(CustomMaterial.YELLOW_DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_CHESTPLATE = ITEMS.register("yellow_diamond_chestplate", () -> new ArmorItem(CustomMaterial.YELLOW_DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_LEGGINGS = ITEMS.register("yellow_diamond_leggings", () -> new ArmorItem(CustomMaterial.YELLOW_DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_BOOTS = ITEMS.register("yellow_diamond_boots", () -> new ArmorItem(CustomMaterial.YELLOW_DIAMOND, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> AMBER_HELMET = ITEMS.register("amber_helmet", () -> new ArmorItem(CustomMaterial.AMBER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate", () -> new ArmorItem(CustomMaterial.AMBER, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMBER_LEGGINGS = ITEMS.register("amber_leggings", () -> new ArmorItem(CustomMaterial.AMBER, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMBER_BOOTS = ITEMS.register("amber_boots", () -> new ArmorItem(CustomMaterial.AMBER, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(CustomMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(CustomMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(CustomMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(CustomMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(CustomMaterial.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(CustomMaterial.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(CustomMaterial.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(CustomMaterial.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(CustomMaterial.PLATINUM, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(CustomMaterial.PLATINUM, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(CustomMaterial.PLATINUM, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(CustomMaterial.PLATINUM, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> BERYLLIUM_HELMET = ITEMS.register("beryllium_helmet", () -> new ArmorItem(CustomMaterial.BERYLLIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BERYLLIUM_CHESTPLATE = ITEMS.register("beryllium_chestplate", () -> new ArmorItem(CustomMaterial.BERYLLIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BERYLLIUM_LEGGINGS = ITEMS.register("beryllium_leggings", () -> new ArmorItem(CustomMaterial.BERYLLIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BERYLLIUM_BOOTS = ITEMS.register("beryllium_boots", () -> new ArmorItem(CustomMaterial.BERYLLIUM, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
}