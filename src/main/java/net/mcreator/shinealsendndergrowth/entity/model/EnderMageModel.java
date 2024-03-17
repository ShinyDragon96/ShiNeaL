package net.mcreator.shinealsendndergrowth.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendndergrowth.entity.EnderMageEntity;

public class EnderMageModel extends GeoModel<EnderMageEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnderMageEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "animations/endermage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnderMageEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "geo/endermage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnderMageEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "textures/entities/" + entity.getTexture() + ".png");
	}

}
