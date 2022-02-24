package net.mcreator.shinealsendupdate.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.shinealsendupdate.entity.EndStriderEntity;
import net.mcreator.shinealsendupdate.client.model.Modelcustom_model;

public class EndStriderRenderer extends MobRenderer<EndStriderEntity, Modelcustom_model<EndStriderEntity>> {
	public EndStriderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EndStriderEntity entity) {
		return new ResourceLocation("shineals_end_update:textures/unknown.png");
	}
}
