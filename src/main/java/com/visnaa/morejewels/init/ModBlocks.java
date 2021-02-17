package com.visnaa.morejewels.init;

import com.visnaa.morejewels.util.Reference;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = BLOCKS.register("aquamarine_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> AQUAMARINE_ORE = BLOCKS.register("aquamarine_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> JADE_BLOCK = BLOCKS.register("jade_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> JADE_ORE = BLOCKS.register("jade_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPAL_BLOCK = BLOCKS.register("opal_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> OPAL_ORE = BLOCKS.register("opal_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_DIAMOND_BLOCK = BLOCKS.register("yellow_diamond_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> YELLOW_DIAMOND_ORE = BLOCKS.register("yellow_diamond_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMBER_BLOCK = BLOCKS.register("amber_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> AMBER_ORE = BLOCKS.register("amber_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = BLOCKS.register("beryllium_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BERYLLIUM_ORE = BLOCKS.register("beryllium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BIXBIT_BLOCK = BLOCKS.register("bixbit_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BIXBIT_ORE = BLOCKS.register("bixbit_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MALACHITE_BLOCK = BLOCKS.register("malachite_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MALACHITE_ORE = BLOCKS.register("malachite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ONYX_ORE = BLOCKS.register("onyx_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOT_BLOCK = BLOCKS.register("peridot_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 30.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));
    public static final RegistryObject<Block> PERIDOT_ORE = BLOCKS.register("peridot_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
}