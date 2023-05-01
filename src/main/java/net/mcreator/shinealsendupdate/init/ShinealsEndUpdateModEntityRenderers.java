
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.shinealsendupdate.client.renderer.EnderPhantomRenderer;
import net.mcreator.shinealsendupdate.client.renderer.EndStriderRenderer;
import net.mcreator.shinealsendupdate.client.renderer.EndMageRenderer;
import net.mcreator.shinealsendupdate.client.renderer.ChorusSnailRenderer;
import net.mcreator.shinealsendupdate.client.renderer.ChorusBeeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShinealsEndUpdateModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ShinealsEndUpdateModEntities.END_STRIDER.get(), EndStriderRenderer::new);
		event.registerEntityRenderer(ShinealsEndUpdateModEntities.ENDMAGE.get(), EndMageRenderer::new);
		event.registerEntityRenderer(ShinealsEndUpdateModEntities.ENDMAGE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ShinealsEndUpdateModEntities.CHORUSSNAIL.get(), ChorusSnailRenderer::new);
		event.registerEntityRenderer(ShinealsEndUpdateModEntities.CHORUSBEE.get(), ChorusBeeRenderer::new);
		event.registerEntityRenderer(ShinealsEndUpdateModEntities.ENDERPHANTOM.get(), EnderPhantomRenderer::new);
	}
}
