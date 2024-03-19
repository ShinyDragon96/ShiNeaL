package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.shinealsendndergrowth.mixins.NoiseGeneratorSettingsAccess;

@Mod.EventBusSubscriber
public class ShinealsEndergrowthModSurfaceRules {
	@SubscribeEvent
	public static void init(ServerAboutToStartEvent event) {
		LevelStem levelStem = event.getServer().registryAccess().registryOrThrow(Registries.LEVEL_STEM).get(LevelStem.END);
		ChunkGenerator chunkGenerator = levelStem.generator();
		boolean hasEndBiomes = chunkGenerator.getBiomeSource().possibleBiomes().stream().anyMatch(biomeHolder -> biomeHolder.unwrapKey().orElseThrow().location().getNamespace().equals("shineals_endergrowth"));
		if (hasEndBiomes) {
			if (chunkGenerator instanceof NoiseBasedChunkGenerator generator) {
				NoiseGeneratorSettings noiseGeneratorSettings = generator.settings.value();
				((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings)
						.addSurfaceRule(
								SurfaceRules
										.sequence(
												SurfaceRules
														.ifTrue(SurfaceRules.isBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("shineals_endergrowth:chorus_forest"))),
																SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(Blocks.END_STONE.defaultBlockState())),
																		SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.state(ShinealsEndergrowthModBlocks.COBBLED_END_STONE.get().defaultBlockState())))),
												noiseGeneratorSettings.surfaceRule()));
			}
		}
	}
}
