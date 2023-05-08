package net.mcreator.shinealsendupdate.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendupdate.entity.EndStriderEntity;

public class EndStriderModel extends GeoModel<EndStriderEntity> {
	@Override
	public ResourceLocation getAnimationResource(EndStriderEntity entity) {
		return new ResourceLocation("shineals_end_update", "animations/endstrider.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndStriderEntity entity) {
		return new ResourceLocation("shineals_end_update", "geo/endstrider.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndStriderEntity entity) {
		return new ResourceLocation("shineals_end_update", "textures/entities/" + entity.getTexture() + ".png");
	}

}
