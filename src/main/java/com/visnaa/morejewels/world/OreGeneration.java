package com.visnaa.morejewels.world;

import com.visnaa.morejewels.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration
{
    public static void registerOres(final BiomeLoadingEvent event) {
        //Overworld Ores
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOres(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.EMERALD_ORE.getDefaultState(), 1, 1, 20, 1);

            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.RUBY_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.SAPPHIRE_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.AQUAMARINE_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.JADE_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.OPAL_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.YELLOW_DIAMOND_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.AMBER_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.AMETHYST_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.TOPAZ_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.PLATINUM_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.BERYLLIUM_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.BIXBIT_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.MALACHITE_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.ONYX_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.PERIDOT_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.MOON_STONE_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.SUN_STONE_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.CITRINE_ORE.get().getDefaultState(), 2, 10, 40, 1);
            generateOres(event.getGeneration(), OreGenerationHelper.BASE_STONE_OVERWORLD, ModBlocks.DOLOMITE_ORE.get().getDefaultState(), 2, 10, 40, 1);
        }
    }

    private static void generateOres(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().func_242731_b(amount));
    }
}
