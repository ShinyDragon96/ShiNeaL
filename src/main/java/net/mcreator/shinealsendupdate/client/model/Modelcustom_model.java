package net.mcreator.shinealsendupdate.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("shineals_end_update", "modelcustom_model"), "main");
	public final ModelPart body;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart hair_left_middle;
	public final ModelPart hair_left_bottom;
	public final ModelPart hair_right_middle;
	public final ModelPart hair_right_bottom;

	public Modelcustom_model(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.hair_left_middle = root.getChild("hair_left_middle");
		this.hair_left_bottom = root.getChild("hair_left_bottom");
		this.hair_right_middle = root.getChild("hair_right_middle");
		this.hair_right_bottom = root.getChild("hair_right_bottom");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 114).addBox(-5.0F, -1.0F, -14.0F, 10.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(4, 33).mirror().addBox(-20.0F, -32.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 33).mirror()
				.addBox(-20.0F, -44.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-38.0F, 2.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 55).addBox(-10.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 7.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 32).addBox(6.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 7.0F, 0.0F));
		PartDefinition hair_left_middle = partdefinition.addOrReplaceChild("hair_left_middle", CubeListBuilder.create(), PartPose.offset(-8.0F, -1.0F, -8.0F));
		PartDefinition hair_left_middle_rotation = hair_left_middle.addOrReplaceChild("hair_left_middle_rotation", CubeListBuilder.create().texOffs(4, 49).addBox(0.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 3.0F, 8.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition hair_left_bottom = partdefinition.addOrReplaceChild("hair_left_bottom", CubeListBuilder.create(), PartPose.offset(-8.0F, 4.0F, -8.0F));
		PartDefinition hair_left_bottom_rotation = hair_left_bottom.addOrReplaceChild("hair_left_bottom_rotation", CubeListBuilder.create().texOffs(4, 65).addBox(0.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 0.0F, 8.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition hair_right_middle = partdefinition.addOrReplaceChild("hair_right_middle", CubeListBuilder.create(), PartPose.offset(8.0F, 0.0F, -8.0F));
		PartDefinition hair_right_middle_rotation = hair_right_middle.addOrReplaceChild("hair_right_middle_rotation",
				CubeListBuilder.create().texOffs(4, 49).mirror().addBox(-12.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.0F, 3.0F, 8.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition hair_right_bottom = partdefinition.addOrReplaceChild("hair_right_bottom", CubeListBuilder.create(), PartPose.offset(8.0F, 5.0F, -8.0F));
		PartDefinition hair_right_bottom_rotation = hair_right_bottom.addOrReplaceChild("hair_right_bottom_rotation",
				CubeListBuilder.create().texOffs(4, 65).mirror().addBox(-12.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.0F, 0.0F, 8.0F, 0.0F, 0.0F, -1.0472F));
		return LayerDefinition.create(meshdefinition, 64, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, buffer, packedLight, packedOverlay);
		left_leg.render(poseStack, buffer, packedLight, packedOverlay);
		right_leg.render(poseStack, buffer, packedLight, packedOverlay);
		hair_left_middle.render(poseStack, buffer, packedLight, packedOverlay);
		hair_left_bottom.render(poseStack, buffer, packedLight, packedOverlay);
		hair_right_middle.render(poseStack, buffer, packedLight, packedOverlay);
		hair_right_bottom.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
