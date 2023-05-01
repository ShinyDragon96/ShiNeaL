package net.mcreator.shinealsendupdate.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendupdate.entity.ChorusBeeEntity;

public class ChorusBeeModel extends AnimatedGeoModel<ChorusBeeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChorusBeeEntity entity) {
		return new ResourceLocation("shineals_end_update", "animations/chorusbee.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChorusBeeEntity entity) {
		return new ResourceLocation("shineals_end_update", "geo/chorusbee.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChorusBeeEntity entity) {
		return new ResourceLocation("shineals_end_update", "textures/entities/" + entity.getTexture() + ".png");
	}

}
