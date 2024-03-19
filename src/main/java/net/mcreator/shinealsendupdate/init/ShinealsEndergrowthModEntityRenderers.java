
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.shinealsendndergrowth.client.renderer.EnderPhantomRenderer;
import net.mcreator.shinealsendndergrowth.client.renderer.EnderMageRenderer;
import net.mcreator.shinealsendndergrowth.client.renderer.EndStriderRenderer;
import net.mcreator.shinealsendndergrowth.client.renderer.ChorusSnailRenderer;
import net.mcreator.shinealsendndergrowth.client.renderer.ChorusBeeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShinealsEndergrowthModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ShinealsEndergrowthModEntities.ENDER_MAGE.get(), EnderMageRenderer::new);
		event.registerEntityRenderer(ShinealsEndergrowthModEntities.ENDER_PHANTOM.get(), EnderPhantomRenderer::new);
		event.registerEntityRenderer(ShinealsEndergrowthModEntities.END_STRIDER.get(), EndStriderRenderer::new);
		event.registerEntityRenderer(ShinealsEndergrowthModEntities.CHORUS_BEE.get(), ChorusBeeRenderer::new);
		event.registerEntityRenderer(ShinealsEndergrowthModEntities.CHORUS_SNAIL.get(), ChorusSnailRenderer::new);
	}
}
