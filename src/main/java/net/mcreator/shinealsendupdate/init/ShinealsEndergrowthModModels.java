
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.shinealsendndergrowth.client.model.Modelcustom_model;
import net.mcreator.shinealsendndergrowth.client.model.ModelVoidStrider;
import net.mcreator.shinealsendndergrowth.client.model.ModelChorusSnail;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ShinealsEndergrowthModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelVoidStrider.LAYER_LOCATION, ModelVoidStrider::createBodyLayer);
		event.registerLayerDefinition(ModelChorusSnail.LAYER_LOCATION, ModelChorusSnail::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
