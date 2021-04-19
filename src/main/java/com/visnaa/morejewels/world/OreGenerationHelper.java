package com.visnaa.morejewels.world;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.IRuleTestType;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;

import java.util.Random;

public class OreGenerationHelper
{
    public static final RuleTest BASE_STONE_OVERWORLD = new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD);
    public static final RuleTest BASE_STONE_NETHER = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
    public static final RuleTest BASE_STONE_THEEND = new BlockMatchRuleTest(Blocks.END_STONE);
    public static final RuleTest STONE = new BlockMatchRuleTest(Blocks.STONE);
    public static final RuleTest NETHERRACK = new BlockMatchRuleTest(Blocks.NETHERRACK);
}
