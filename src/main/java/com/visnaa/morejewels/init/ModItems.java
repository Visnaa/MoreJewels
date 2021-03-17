package com.visnaa.morejewels.init;

import com.visnaa.morejewels.Main;
import com.visnaa.morejewels.item.armor.ArmorMaterials;
import com.visnaa.morejewels.item.tool.ToolMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

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
    public static final RegistryObject<Item> BIXBIT = ITEMS.register("bixbit", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_BIXBIT = ITEMS.register("rough_bixbit", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_MALACHITE = ITEMS.register("rough_malachite", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_ONYX = ITEMS.register("rough_onyx", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_PERIDOT = ITEMS.register("rough_peridot", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> MOON_STONE = ITEMS.register("moon_stone", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_MOON_STONE = ITEMS.register("rough_moon_stone", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> SUN_STONE = ITEMS.register("sun_stone", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_SUN_STONE = ITEMS.register("rough_sun_stone", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_CITRINE = ITEMS.register("rough_citrine", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("dolomite", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<Item> ROUGH_DOLOMITE = ITEMS.register("rough_dolomite", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP)));

    //Food
    public static final RegistryObject<Item> GEMSTONE_APPLE = ITEMS.register("gemstone_apple", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP).rarity(Rarity.create("LEGENDARY", TextFormatting.GOLD)).food(new Food.Builder().hunger(6).saturation(10.0F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.ABSORPTION, 20 * 180, 4), 1.0F).effect(() -> new EffectInstance(Effects.REGENERATION, 20 * 40, 2), 1.0F).effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 20 * 600, 1), 1.0F).effect(() -> new EffectInstance(Effects.RESISTANCE, 20 * 600, 1), 1.0F).effect(() -> new EffectInstance(Effects.HASTE, 20 * 300, 3), 1.0F).build())));
    public static final RegistryObject<Item> BAD_APPLE = ITEMS.register("bad_apple", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(0.0F).effect(() -> new EffectInstance(Effects.POISON, 20 * 15, 3), 1F).build())));
    public static final RegistryObject<Item> JADE_RING = ITEMS.register("jade_ring", () -> new Item(new Item.Properties().group(Main.ITEM_GROUP).food(new Food.Builder().hunger(4).saturation(6.0F).effect(() -> new EffectInstance(Effects.GLOWING, 20 * 30, 1), 1F).build())));

    //Block Items
    public static final RegistryObject<BlockItem> DECORATED_DRAGON_EGG = ITEMS.register("decorated_dragon_egg", () -> new BlockItem(ModBlocks.DECORATED_DRAGON_EGG.get(), new Item.Properties().rarity(Rarity.create("LEGENDARY", TextFormatting.GOLD))));

    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(ModBlocks.SAPPHIRE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AQUAMARINE_BLOCK = ITEMS.register("aquamarine_block", () -> new BlockItem(ModBlocks.AQUAMARINE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> AQUAMARINE_ORE = ITEMS.register("aquamarine_ore", () -> new BlockItem(ModBlocks.AQUAMARINE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JADE_BLOCK = ITEMS.register("jade_block", () -> new BlockItem(ModBlocks.JADE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> JADE_ORE = ITEMS.register("jade_ore", () -> new BlockItem(ModBlocks.JADE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> OPAL_BLOCK = ITEMS.register("opal_block", () -> new BlockItem(ModBlocks.OPAL_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
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
    public static final RegistryObject<BlockItem> BIXBIT_BLOCK = ITEMS.register("bixbit_block", () -> new BlockItem(ModBlocks.BIXBIT_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> BIXBIT_ORE = ITEMS.register("bixbit_ore", () -> new BlockItem(ModBlocks.BIXBIT_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> MALACHITE_BLOCK = ITEMS.register("malachite_block", () -> new BlockItem(ModBlocks.MALACHITE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> MALACHITE_ORE = ITEMS.register("malachite_ore", () -> new BlockItem(ModBlocks.MALACHITE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block", () -> new BlockItem(ModBlocks.ONYX_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore", () -> new BlockItem(ModBlocks.ONYX_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> PERIDOT_BLOCK = ITEMS.register("peridot_block", () -> new BlockItem(ModBlocks.PERIDOT_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> PERIDOT_ORE = ITEMS.register("peridot_ore", () -> new BlockItem(ModBlocks.PERIDOT_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> MOON_STONE_BLOCK = ITEMS.register("moon_stone_block", () -> new BlockItem(ModBlocks.MOON_STONE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> MOON_STONE_ORE = ITEMS.register("moon_stone_ore", () -> new BlockItem(ModBlocks.MOON_STONE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SUN_STONE_BLOCK = ITEMS.register("sun_stone_block", () -> new BlockItem(ModBlocks.SUN_STONE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> SUN_STONE_ORE = ITEMS.register("sun_stone_ore", () -> new BlockItem(ModBlocks.SUN_STONE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> CITRINE_BLOCK = ITEMS.register("citrine_block", () -> new BlockItem(ModBlocks.CITRINE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> CITRINE_ORE = ITEMS.register("citrine_ore", () -> new BlockItem(ModBlocks.CITRINE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> DOLOMITE_BLOCK = ITEMS.register("dolomite_block", () -> new BlockItem(ModBlocks.DOLOMITE_BLOCK.get(), new Item.Properties().group(Main.ITEM_GROUP)));
    public static final RegistryObject<BlockItem> DOLOMITE_ORE = ITEMS.register("dolomite_ore", () -> new BlockItem(ModBlocks.DOLOMITE_ORE.get(), new Item.Properties().group(Main.ITEM_GROUP)));


    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ToolMaterials.RUBY, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ToolMaterials.RUBY, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ToolMaterials.RUBY, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ToolMaterials.RUBY, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ToolMaterials.RUBY, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ToolMaterials.SAPPHIRE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ToolMaterials.SAPPHIRE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ToolMaterials.SAPPHIRE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ToolMaterials.SAPPHIRE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ToolMaterials.SAPPHIRE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> AQUAMARINE_SWORD = ITEMS.register("aquamarine_sword", () -> new SwordItem(ToolMaterials.AQUAMARINE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> AQUAMARINE_SHOVEL = ITEMS.register("aquamarine_shovel", () -> new ShovelItem(ToolMaterials.AQUAMARINE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> AQUAMARINE_PICKAXE = ITEMS.register("aquamarine_pickaxe", () -> new PickaxeItem(ToolMaterials.AQUAMARINE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> AQUAMARINE_AXE = ITEMS.register("aquamarine_axe", () -> new AxeItem(ToolMaterials.AQUAMARINE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> AQUAMARINE_HOE = ITEMS.register("aquamarine_hoe", () -> new HoeItem(ToolMaterials.AQUAMARINE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> JADE_SWORD = ITEMS.register("jade_sword", () -> new SwordItem(ToolMaterials.JADE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> JADE_SHOVEL = ITEMS.register("jade_shovel", () -> new ShovelItem(ToolMaterials.JADE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> JADE_PICKAXE = ITEMS.register("jade_pickaxe", () -> new PickaxeItem(ToolMaterials.JADE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> JADE_AXE = ITEMS.register("jade_axe", () -> new AxeItem(ToolMaterials.JADE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> JADE_HOE = ITEMS.register("jade_hoe", () -> new HoeItem(ToolMaterials.JADE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> OPAL_SWORD = ITEMS.register("opal_sword", () -> new SwordItem(ToolMaterials.OPAL, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> OPAL_SHOVEL = ITEMS.register("opal_shovel", () -> new ShovelItem(ToolMaterials.OPAL, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> OPAL_PICKAXE = ITEMS.register("opal_pickaxe", () -> new PickaxeItem(ToolMaterials.OPAL, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> OPAL_AXE = ITEMS.register("opal_axe", () -> new AxeItem(ToolMaterials.OPAL, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> OPAL_HOE = ITEMS.register("opal_hoe", () -> new HoeItem(ToolMaterials.OPAL, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> YELLOW_DIAMOND_SWORD = ITEMS.register("yellow_diamond_sword", () -> new SwordItem(ToolMaterials.YELLOW_DIAMOND, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> YELLOW_DIAMOND_SHOVEL = ITEMS.register("yellow_diamond_shovel", () -> new ShovelItem(ToolMaterials.YELLOW_DIAMOND, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> YELLOW_DIAMOND_PICKAXE = ITEMS.register("yellow_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.YELLOW_DIAMOND, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> YELLOW_DIAMOND_AXE = ITEMS.register("yellow_diamond_axe", () -> new AxeItem(ToolMaterials.YELLOW_DIAMOND, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> YELLOW_DIAMOND_HOE = ITEMS.register("yellow_diamond_hoe", () -> new HoeItem(ToolMaterials.YELLOW_DIAMOND, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> AMBER_SWORD = ITEMS.register("amber_sword", () -> new SwordItem(ToolMaterials.AMBER, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> AMBER_SHOVEL = ITEMS.register("amber_shovel", () -> new ShovelItem(ToolMaterials.AMBER, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem>AMBER_PICKAXE = ITEMS.register("amber_pickaxe", () -> new PickaxeItem(ToolMaterials.AMBER, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> AMBER_AXE = ITEMS.register("amber_axe", () -> new AxeItem(ToolMaterials.AMBER, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> AMBER_HOE = ITEMS.register("amber_hoe", () -> new HoeItem(ToolMaterials.AMBER, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ToolMaterials.AMETHYST, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ToolMaterials.AMETHYST, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ToolMaterials.AMETHYST, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ToolMaterials.AMETHYST, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ToolMaterials.AMETHYST, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ToolMaterials.TOPAZ, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ToolMaterials.TOPAZ, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ToolMaterials.TOPAZ, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ToolMaterials.TOPAZ, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ToolMaterials.TOPAZ, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(ToolMaterials.PLATINUM, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(ToolMaterials.PLATINUM, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(ToolMaterials.PLATINUM, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(ToolMaterials.PLATINUM, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new HoeItem(ToolMaterials.PLATINUM, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> BERYLLIUM_SWORD = ITEMS.register("beryllium_sword", () -> new SwordItem(ToolMaterials.BERYLLIUM, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> BERYLLIUM_SHOVEL = ITEMS.register("beryllium_shovel", () -> new ShovelItem(ToolMaterials.BERYLLIUM, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> BERYLLIUM_PICKAXE = ITEMS.register("beryllium_pickaxe", () -> new PickaxeItem(ToolMaterials.BERYLLIUM, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> BERYLLIUM_AXE = ITEMS.register("beryllium_axe", () -> new AxeItem(ToolMaterials.BERYLLIUM, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> BERYLLIUM_HOE = ITEMS.register("beryllium_hoe", () -> new HoeItem(ToolMaterials.BERYLLIUM, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> BIXBIT_SWORD = ITEMS.register("bixbit_sword", () -> new SwordItem(ToolMaterials.BIXBIT, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> BIXBIT_SHOVEL = ITEMS.register("bixbit_shovel", () -> new ShovelItem(ToolMaterials.BIXBIT, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> BIXBIT_PICKAXE = ITEMS.register("bixbit_pickaxe", () -> new PickaxeItem(ToolMaterials.BIXBIT, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> BIXBIT_AXE = ITEMS.register("bixbit_axe", () -> new AxeItem(ToolMaterials.BIXBIT, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> BIXBIT_HOE = ITEMS.register("bixbit_hoe", () -> new HoeItem(ToolMaterials.BIXBIT, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> MALACHITE_SWORD = ITEMS.register("malachite_sword", () -> new SwordItem(ToolMaterials.MALACHITE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> MALACHITE_SHOVEL = ITEMS.register("malachite_shovel", () -> new ShovelItem(ToolMaterials.MALACHITE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> MALACHITE_PICKAXE = ITEMS.register("malachite_pickaxe", () -> new PickaxeItem(ToolMaterials.MALACHITE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> MALACHITE_AXE = ITEMS.register("malachite_axe", () -> new AxeItem(ToolMaterials.MALACHITE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> MALACHITE_HOE = ITEMS.register("malachite_hoe", () -> new HoeItem(ToolMaterials.MALACHITE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> ONYX_SWORD = ITEMS.register("onyx_sword", () -> new SwordItem(ToolMaterials.ONYX, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> ONYX_SHOVEL = ITEMS.register("onyx_shovel", () -> new ShovelItem(ToolMaterials.ONYX, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> ONYX_PICKAXE = ITEMS.register("onyx_pickaxe", () -> new PickaxeItem(ToolMaterials.ONYX, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> ONYX_AXE = ITEMS.register("onyx_axe", () -> new AxeItem(ToolMaterials.ONYX, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> ONYX_HOE = ITEMS.register("onyx_hoe", () -> new HoeItem(ToolMaterials.ONYX, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> PERIDOT_SWORD = ITEMS.register("peridot_sword", () -> new SwordItem(ToolMaterials.PERIDOT, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel", () -> new ShovelItem(ToolMaterials.PERIDOT, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe", () -> new PickaxeItem(ToolMaterials.PERIDOT, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> PERIDOT_AXE = ITEMS.register("peridot_axe", () -> new AxeItem(ToolMaterials.PERIDOT, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> PERIDOT_HOE = ITEMS.register("peridot_hoe", () -> new HoeItem(ToolMaterials.PERIDOT, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> MOON_STONE_SWORD = ITEMS.register("moon_stone_sword", () -> new SwordItem(ToolMaterials.MOON_STONE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> MOON_STONE_SHOVEL = ITEMS.register("moon_stone_shovel", () -> new ShovelItem(ToolMaterials.MOON_STONE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> MOON_STONE_PICKAXE = ITEMS.register("moon_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.MOON_STONE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> MOON_STONE_AXE = ITEMS.register("moon_stone_axe", () -> new AxeItem(ToolMaterials.MOON_STONE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> MOON_STONE_HOE = ITEMS.register("moon_stone_hoe", () -> new HoeItem(ToolMaterials.MOON_STONE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> SUN_STONE_SWORD = ITEMS.register("sun_stone_sword", () -> new SwordItem(ToolMaterials.SUN_STONE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> SUN_STONE_SHOVEL = ITEMS.register("sun_stone_shovel", () -> new ShovelItem(ToolMaterials.SUN_STONE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> SUN_STONE_PICKAXE = ITEMS.register("sun_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.SUN_STONE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> SUN_STONE_AXE = ITEMS.register("sun_stone_axe", () -> new AxeItem(ToolMaterials.SUN_STONE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> SUN_STONE_HOE = ITEMS.register("sun_stone_hoe", () -> new HoeItem(ToolMaterials.SUN_STONE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> CITRINE_STONE_SWORD = ITEMS.register("citrine_sword", () -> new SwordItem(ToolMaterials.CITRINE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> CITRINE_STONE_SHOVEL = ITEMS.register("citrine_shovel", () -> new ShovelItem(ToolMaterials.CITRINE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> CITRINE_STONE_PICKAXE = ITEMS.register("citrine_pickaxe", () -> new PickaxeItem(ToolMaterials.CITRINE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> CITRINE_STONE_AXE = ITEMS.register("citrine_axe", () -> new AxeItem(ToolMaterials.CITRINE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> CITRINE_STONE_HOE = ITEMS.register("citrine_hoe", () -> new HoeItem(ToolMaterials.CITRINE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<SwordItem> DOLOMITE_STONE_SWORD = ITEMS.register("dolomite_sword", () -> new SwordItem(ToolMaterials.DOLOMITE, SWORD_DAMAGE, SWORD_SPEED, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ShovelItem> DOLOMITE_STONE_SHOVEL = ITEMS.register("dolomite_shovel", () -> new ShovelItem(ToolMaterials.DOLOMITE, SHOVEL_DAMAGE, SHOVEL_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<PickaxeItem> DOLOMITE_STONE_PICKAXE = ITEMS.register("dolomite_pickaxe", () -> new PickaxeItem(ToolMaterials.DOLOMITE, PICKAXE_DAMAGE, PICKAXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> DOLOMITE_STONE_AXE = ITEMS.register("dolomite_axe", () -> new AxeItem(ToolMaterials.DOLOMITE, AXE_DAMAGE, AXE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> DOLOMITE_STONE_HOE = ITEMS.register("dolomite_hoe", () -> new HoeItem(ToolMaterials.DOLOMITE, HOE_DAMAGE, HOE_SPEED, new Item.Properties().group(ItemGroup.TOOLS)));

    //Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> AQUAMARINE_HELMET = ITEMS.register("aquamarine_helmet", () -> new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AQUAMARINE_CHESTPLATE = ITEMS.register("aquamarine_chestplate", () -> new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AQUAMARINE_LEGGINGS = ITEMS.register("aquamarine_leggings", () -> new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AQUAMARINE_BOOTS = ITEMS.register("aquamarine_boots", () -> new ArmorItem(ArmorMaterials.AQUAMARINE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> JADE_HELMET = ITEMS.register("jade_helmet", () -> new ArmorItem(ArmorMaterials.JADE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> JADE_CHESTPLATE = ITEMS.register("jade_chestplate", () -> new ArmorItem(ArmorMaterials.JADE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> JADE_LEGGINGS = ITEMS.register("jade_leggings", () -> new ArmorItem(ArmorMaterials.JADE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> JADE_BOOTS = ITEMS.register("jade_boots", () -> new ArmorItem(ArmorMaterials.JADE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> OPAL_HELMET = ITEMS.register("opal_helmet", () -> new ArmorItem(ArmorMaterials.OPAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate", () -> new ArmorItem(ArmorMaterials.OPAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> OPAL_LEGGINGS = ITEMS.register("opal_leggings", () -> new ArmorItem(ArmorMaterials.OPAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> OPAL_BOOTS = ITEMS.register("opal_boots", () -> new ArmorItem(ArmorMaterials.OPAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_HELMET = ITEMS.register("yellow_diamond_helmet", () -> new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_CHESTPLATE = ITEMS.register("yellow_diamond_chestplate", () -> new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_LEGGINGS = ITEMS.register("yellow_diamond_leggings", () -> new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> YELLOW_DIAMOND_BOOTS = ITEMS.register("yellow_diamond_boots", () -> new ArmorItem(ArmorMaterials.YELLOW_DIAMOND, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> AMBER_HELMET = ITEMS.register("amber_helmet", () -> new ArmorItem(ArmorMaterials.AMBER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate", () -> new ArmorItem(ArmorMaterials.AMBER, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMBER_LEGGINGS = ITEMS.register("amber_leggings", () -> new ArmorItem(ArmorMaterials.AMBER, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMBER_BOOTS = ITEMS.register("amber_boots", () -> new ArmorItem(ArmorMaterials.AMBER, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(ArmorMaterials.PLATINUM, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> BERYLLIUM_HELMET = ITEMS.register("beryllium_helmet", () -> new ArmorItem(ArmorMaterials.BERYLLIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BERYLLIUM_CHESTPLATE = ITEMS.register("beryllium_chestplate", () -> new ArmorItem(ArmorMaterials.BERYLLIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BERYLLIUM_LEGGINGS = ITEMS.register("beryllium_leggings", () -> new ArmorItem(ArmorMaterials.BERYLLIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BERYLLIUM_BOOTS = ITEMS.register("beryllium_boots", () -> new ArmorItem(ArmorMaterials.BERYLLIUM, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> BIXBIT_HELMET = ITEMS.register("bixbit_helmet", () -> new ArmorItem(ArmorMaterials.BIXBIT, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BIXBIT_CHESTPLATE = ITEMS.register("bixbit_chestplate", () -> new ArmorItem(ArmorMaterials.BIXBIT, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BIXBIT_LEGGINGS = ITEMS.register("bixbit_leggings", () -> new ArmorItem(ArmorMaterials.BIXBIT, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> BIXBIT_BOOTS = ITEMS.register("bixbit_boots", () -> new ArmorItem(ArmorMaterials.BIXBIT, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> MALACHITE_HELMET = ITEMS.register("malachite_helmet", () -> new ArmorItem(ArmorMaterials.MALACHITE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> MALACHITE_CHESTPLATE = ITEMS.register("malachite_chestplate", () -> new ArmorItem(ArmorMaterials.MALACHITE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> MALACHITE_LEGGINGS = ITEMS.register("malachite_leggings", () -> new ArmorItem(ArmorMaterials.MALACHITE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> MALACHITE_BOOTS = ITEMS.register("malachite_boots", () -> new ArmorItem(ArmorMaterials.MALACHITE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> ONYX_HELMET = ITEMS.register("onyx_helmet", () -> new ArmorItem(ArmorMaterials.ONYX, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> ONYX_CHESTPLATE = ITEMS.register("onyx_chestplate", () -> new ArmorItem(ArmorMaterials.ONYX, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> ONYX_LEGGINGS = ITEMS.register("onyx_leggings", () -> new ArmorItem(ArmorMaterials.ONYX, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> ONYX_BOOTS = ITEMS.register("onyx_boots", () -> new ArmorItem(ArmorMaterials.ONYX, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> PERIDOT_HELMET = ITEMS.register("peridot_helmet", () -> new ArmorItem(ArmorMaterials.PERIDOT, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PERIDOT_CHESTPLATE = ITEMS.register("peridot_chestplate", () -> new ArmorItem(ArmorMaterials.PERIDOT, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PERIDOT_LEGGINGS = ITEMS.register("peridot_leggings", () -> new ArmorItem(ArmorMaterials.PERIDOT, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> PERIDOT_BOOTS = ITEMS.register("peridot_boots", () -> new ArmorItem(ArmorMaterials.PERIDOT, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> MOON_STONE_HELMET = ITEMS.register("moon_stone_helmet", () -> new ArmorItem(ArmorMaterials.MOON_STONE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> MOON_STONE_CHESTPLATE = ITEMS.register("moon_stone_chestplate", () -> new ArmorItem(ArmorMaterials.MOON_STONE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> MOON_STONE_LEGGINGS = ITEMS.register("moon_stone_leggings", () -> new ArmorItem(ArmorMaterials.MOON_STONE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> MOON_STONE_BOOTS = ITEMS.register("moon_stone_boots", () -> new ArmorItem(ArmorMaterials.MOON_STONE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> SUN_STONE_HELMET = ITEMS.register("sun_stone_helmet", () -> new ArmorItem(ArmorMaterials.SUN_STONE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SUN_STONE_CHESTPLATE = ITEMS.register("sun_stone_chestplate", () -> new ArmorItem(ArmorMaterials.SUN_STONE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SUN_STONE_LEGGINGS = ITEMS.register("sun_stone_leggings", () -> new ArmorItem(ArmorMaterials.SUN_STONE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> SUN_STONE_BOOTS = ITEMS.register("sun_stone_boots", () -> new ArmorItem(ArmorMaterials.SUN_STONE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> CITRINE_HELMET = ITEMS.register("citrine_helmet", () -> new ArmorItem(ArmorMaterials.CITRINE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate", () -> new ArmorItem(ArmorMaterials.CITRINE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings", () -> new ArmorItem(ArmorMaterials.CITRINE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> CITRINE_BOOTS = ITEMS.register("citrine_boots", () -> new ArmorItem(ArmorMaterials.CITRINE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> DOLOMITE_HELMET = ITEMS.register("dolomite_helmet", () -> new ArmorItem(ArmorMaterials.DOLOMITE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> DOLOMITE_CHESTPLATE = ITEMS.register("dolomite_chestplate", () -> new ArmorItem(ArmorMaterials.DOLOMITE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> DOLOMITE_LEGGINGS = ITEMS.register("dolomite_leggings", () -> new ArmorItem(ArmorMaterials.DOLOMITE, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<ArmorItem> DOLOMITE_BOOTS = ITEMS.register("dolomite_boots", () -> new ArmorItem(ArmorMaterials.DOLOMITE, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1).rarity(Rarity.UNCOMMON)));
}