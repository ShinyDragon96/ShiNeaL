package net.mcreator.shinealsendndergrowth.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendndergrowth.entity.ChorusBeeEntity;

public class ChorusBeeModel extends GeoModel<ChorusBeeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChorusBeeEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "animations/chorusbee.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChorusBeeEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "geo/chorusbee.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChorusBeeEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "textures/entities/" + entity.getTexture() + ".png");
	}

}
