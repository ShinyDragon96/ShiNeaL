package net.mcreator.shinealsendupdate.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendupdate.entity.ChorusSnailEntity;

public class ChorusSnailModel extends AnimatedGeoModel<ChorusSnailEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChorusSnailEntity entity) {
		return new ResourceLocation("shineals_end_update", "animations/chorussnail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChorusSnailEntity entity) {
		return new ResourceLocation("shineals_end_update", "geo/chorussnail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChorusSnailEntity entity) {
		return new ResourceLocation("shineals_end_update", "textures/entities/" + entity.getTexture() + ".png");
	}

}
