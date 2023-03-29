
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.shinealsendupdate.fluid.types.VoidialWaterFluidType;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateMod;

public class ShinealsEndUpdateModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ShinealsEndUpdateMod.MODID);
	public static final RegistryObject<FluidType> VOIDIAL_WATER_TYPE = REGISTRY.register("voidial_water", () -> new VoidialWaterFluidType());
}
