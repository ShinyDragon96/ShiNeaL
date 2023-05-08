
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.EnderPhantomModel;
import net.mcreator.shinealsendupdate.entity.EnderPhantomEntity;

public class EnderPhantomRenderer extends GeoEntityRenderer<EnderPhantomEntity> {
	public EnderPhantomRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EnderPhantomModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EnderPhantomEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public GeoEntityRenderer<EnderPhantomEntity> withScale(float amount) {
		amount = 1f;
		return withScale(amount, amount);
	}
}
