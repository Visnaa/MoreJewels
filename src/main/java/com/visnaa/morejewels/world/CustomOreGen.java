package com.visnaa.morejewels.world;

import com.visnaa.morejewels.init.ModBlocks;
import com.visnaa.morejewels.util.Reference;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CustomOreGen
{
    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();

    public static void registerOres(){
        overworldOres.add(register("ruby_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.RUBY_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("sapphire_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.SAPPHIRE_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("aquamarine_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AQUAMARINE_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("jade_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.JADE_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("opal_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.OPAL_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("yellow_diamond_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.YELLOW_DIAMOND_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("amber_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AMBER_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("amethyst_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.AMETHYST_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("topaz_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.TOPAZ_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("platinum_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.PLATINUM_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        overworldOres.add(register("baryllium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.BERYLLIUM_ORE.get().getDefaultState(), 4))
                .range(40).square()
                .func_242731_b(64)));
        
        //netherOres.add(register("", Feature.ORE.withConfiguration(new OreFeatureConfig(
        //        OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks."BLOCK_NAME".get().getDefaultState(), 4))
        //        .range(48).square()
        //        .func_242731_b(64)));
        //
        //endOres.add(register("", Feature.ORE.withConfiguration(new OreFeatureConfig(
        //        new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks."BLOCK NAME".get().getDefaultState(), 4))
        //        .range(128).square()
        //        .func_242731_b(64)));
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        /*if (event.getCategory().equals(Biome.Category.NETHER)) {
            for (ConfiguredFeature<?, ?> ore : netherOres) {
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        if (event.getCategory().equals(Biome.Category.THEEND)) {
            for (ConfiguredFeature<?, ?> ore : endOres) {
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }*/
        for (ConfiguredFeature<?, ?> ore : overworldOres) {
            if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, Reference.MOD_ID + ":" + name, configuredFeature);
    }
}
