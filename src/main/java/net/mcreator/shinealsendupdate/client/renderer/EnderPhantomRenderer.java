
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.EnderPhantomModel;
import net.mcreator.shinealsendupdate.entity.EnderPhantomEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EnderPhantomRenderer extends GeoEntityRenderer<EnderPhantomEntity> {
	public EnderPhantomRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EnderPhantomModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EnderPhantomEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
