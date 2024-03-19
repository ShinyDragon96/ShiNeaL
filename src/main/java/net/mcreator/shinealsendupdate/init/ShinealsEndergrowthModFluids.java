
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.shinealsendndergrowth.fluid.VoidialWaterFluid;
import net.mcreator.shinealsendndergrowth.ShinealsEndergrowthMod;

public class ShinealsEndergrowthModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ShinealsEndergrowthMod.MODID);
	public static final RegistryObject<FlowingFluid> VOIDIAL_WATER = REGISTRY.register("voidial_water", () -> new VoidialWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_VOIDIAL_WATER = REGISTRY.register("flowing_voidial_water", () -> new VoidialWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(VOIDIAL_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VOIDIAL_WATER.get(), RenderType.translucent());
		}
	}
}
