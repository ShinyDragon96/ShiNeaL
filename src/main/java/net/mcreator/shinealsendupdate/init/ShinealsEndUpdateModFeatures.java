
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.shinealsendupdate.world.features.ores.EnderiteOreFeature;
import net.mcreator.shinealsendupdate.world.features.ores.CobbledEndStoneFeature;
import net.mcreator.shinealsendupdate.world.features.ChorusTreeFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShinealsEndUpdateModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(CobbledEndStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CobbledEndStoneFeature.GENERATE_BIOMES, CobbledEndStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EnderiteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				EnderiteOreFeature.GENERATE_BIOMES, EnderiteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ChorusTreeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				ChorusTreeFeature.GENERATE_BIOMES, ChorusTreeFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
