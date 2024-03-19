
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.shinealsendndergrowth.fluid.types.VoidialWaterFluidType;
import net.mcreator.shinealsendndergrowth.ShinealsEndergrowthMod;

public class ShinealsEndergrowthModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ShinealsEndergrowthMod.MODID);
	public static final RegistryObject<FluidType> VOIDIAL_WATER_TYPE = REGISTRY.register("voidial_water", () -> new VoidialWaterFluidType());
}
