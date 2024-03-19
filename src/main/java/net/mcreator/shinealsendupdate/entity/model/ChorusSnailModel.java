package net.mcreator.shinealsendndergrowth.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendndergrowth.entity.ChorusSnailEntity;

public class ChorusSnailModel extends GeoModel<ChorusSnailEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChorusSnailEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "animations/chorussnail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChorusSnailEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "geo/chorussnail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChorusSnailEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "textures/entities/" + entity.getTexture() + ".png");
	}

}
