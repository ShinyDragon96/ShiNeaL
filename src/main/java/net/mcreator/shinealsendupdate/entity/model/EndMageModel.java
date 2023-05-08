package net.mcreator.shinealsendupdate.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendupdate.entity.EndMageEntity;

public class EndMageModel extends GeoModel<EndMageEntity> {
	@Override
	public ResourceLocation getAnimationResource(EndMageEntity entity) {
		return new ResourceLocation("shineals_end_update", "animations/endmage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndMageEntity entity) {
		return new ResourceLocation("shineals_end_update", "geo/endmage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndMageEntity entity) {
		return new ResourceLocation("shineals_end_update", "textures/entities/" + entity.getTexture() + ".png");
	}

}
