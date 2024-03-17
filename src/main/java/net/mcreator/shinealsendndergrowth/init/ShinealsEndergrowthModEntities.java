
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.shinealsendndergrowth.entity.EnderPhantomEntity;
import net.mcreator.shinealsendndergrowth.entity.EnderMageEntity;
import net.mcreator.shinealsendndergrowth.entity.EndStriderEntity;
import net.mcreator.shinealsendndergrowth.entity.ChorusSnailEntity;
import net.mcreator.shinealsendndergrowth.entity.ChorusBeeEntity;
import net.mcreator.shinealsendndergrowth.ShinealsEndergrowthMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShinealsEndergrowthModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ShinealsEndergrowthMod.MODID);
	public static final RegistryObject<EntityType<EnderMageEntity>> ENDER_MAGE = register("ender_mage",
			EntityType.Builder.<EnderMageEntity>of(EnderMageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnderMageEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnderPhantomEntity>> ENDER_PHANTOM = register("ender_phantom",
			EntityType.Builder.<EnderPhantomEntity>of(EnderPhantomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnderPhantomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EndStriderEntity>> END_STRIDER = register("end_strider",
			EntityType.Builder.<EndStriderEntity>of(EndStriderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndStriderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChorusBeeEntity>> CHORUS_BEE = register("chorus_bee",
			EntityType.Builder.<ChorusBeeEntity>of(ChorusBeeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChorusBeeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChorusSnailEntity>> CHORUS_SNAIL = register("chorus_snail",
			EntityType.Builder.<ChorusSnailEntity>of(ChorusSnailEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChorusSnailEntity::new)

					.sized(1f, 1.25f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EnderMageEntity.init();
			EnderPhantomEntity.init();
			EndStriderEntity.init();
			ChorusBeeEntity.init();
			ChorusSnailEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENDER_MAGE.get(), EnderMageEntity.createAttributes().build());
		event.put(ENDER_PHANTOM.get(), EnderPhantomEntity.createAttributes().build());
		event.put(END_STRIDER.get(), EndStriderEntity.createAttributes().build());
		event.put(CHORUS_BEE.get(), ChorusBeeEntity.createAttributes().build());
		event.put(CHORUS_SNAIL.get(), ChorusSnailEntity.createAttributes().build());
	}
}
