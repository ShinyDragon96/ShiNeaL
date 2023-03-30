
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.shinealsendupdate.world.features.ores.EnderiteOreFeature;
import net.mcreator.shinealsendupdate.world.features.ores.CobbledEndStoneFeature;
import net.mcreator.shinealsendupdate.world.features.EnderHutFeature;
import net.mcreator.shinealsendupdate.world.features.ChorusTreeFeature;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateMod;

@Mod.EventBusSubscriber
public class ShinealsEndUpdateModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ShinealsEndUpdateMod.MODID);
	public static final RegistryObject<Feature<?>> COBBLED_END_STONE = REGISTRY.register("cobbled_end_stone", CobbledEndStoneFeature::feature);
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = REGISTRY.register("enderite_ore", EnderiteOreFeature::feature);
	public static final RegistryObject<Feature<?>> CHORUS_TREE = REGISTRY.register("chorus_tree", ChorusTreeFeature::feature);
	public static final RegistryObject<Feature<?>> ENDER_HUT = REGISTRY.register("ender_hut", EnderHutFeature::feature);
}
