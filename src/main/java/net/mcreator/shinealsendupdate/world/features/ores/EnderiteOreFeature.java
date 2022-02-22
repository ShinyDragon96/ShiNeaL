
package net.mcreator.shinealsendupdate.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModBlocks;

import java.util.Set;
import java.util.Random;

public class EnderiteOreFeature extends OreFeature {
	public static final EnderiteOreFeature FEATURE = (EnderiteOreFeature) new EnderiteOreFeature()
			.setRegistryName("shineals_end_update:enderite_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(EnderiteOreFeatureRuleTest.INSTANCE, ShinealsEndUpdateModBlocks.ENDERITE_ORE.defaultBlockState(), 2))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70)))).squared().count(1);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public EnderiteOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.END)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class EnderiteOreFeatureRuleTest extends RuleTest {
		static final EnderiteOreFeatureRuleTest INSTANCE = new EnderiteOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<EnderiteOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<EnderiteOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("shineals_end_update:enderite_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.END_STONE)
				blockCriteria = true;
			if (blockAt.getBlock() == ShinealsEndUpdateModBlocks.COBBLED_END_STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
