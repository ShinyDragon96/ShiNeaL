
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.EndStriderModel;
import net.mcreator.shinealsendupdate.entity.EndStriderEntity;

public class EndStriderRenderer extends GeoEntityRenderer<EndStriderEntity> {
	public EndStriderRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EndStriderModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EndStriderEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public GeoEntityRenderer<EndStriderEntity> withScale(float amount) {
		amount = 1f;
		return withScale(amount, amount);
	}

	@Override
	protected float getDeathMaxRotation(EndStriderEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
