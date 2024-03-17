package net.mcreator.shinealsendndergrowth.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendndergrowth.entity.EndStriderEntity;

public class EndStriderModel extends GeoModel<EndStriderEntity> {
	@Override
	public ResourceLocation getAnimationResource(EndStriderEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "animations/end_strider.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndStriderEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "geo/end_strider.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndStriderEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "textures/entities/" + entity.getTexture() + ".png");
	}

}
