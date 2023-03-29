
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.shinealsendupdate.world.biome.ChorusForestBiome;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateMod;

public class ShinealsEndUpdateModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ShinealsEndUpdateMod.MODID);
	public static final RegistryObject<Biome> CHORUS_FOREST = REGISTRY.register("chorus_forest", ChorusForestBiome::createBiome);
}
