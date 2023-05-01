
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

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

import net.mcreator.shinealsendupdate.entity.EnderPhantomEntity;
import net.mcreator.shinealsendupdate.entity.EndStriderEntity;
import net.mcreator.shinealsendupdate.entity.EndMageEntityProjectile;
import net.mcreator.shinealsendupdate.entity.EndMageEntity;
import net.mcreator.shinealsendupdate.entity.ChorusSnailEntity;
import net.mcreator.shinealsendupdate.entity.ChorusBeeEntity;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShinealsEndUpdateModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ShinealsEndUpdateMod.MODID);
	public static final RegistryObject<EntityType<EndStriderEntity>> END_STRIDER = register("end_strider",
			EntityType.Builder.<EndStriderEntity>of(EndStriderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndStriderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EndMageEntity>> ENDMAGE = register("endmage",
			EntityType.Builder.<EndMageEntity>of(EndMageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndMageEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EndMageEntityProjectile>> ENDMAGE_PROJECTILE = register("projectile_endmage", EntityType.Builder.<EndMageEntityProjectile>of(EndMageEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(EndMageEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChorusSnailEntity>> CHORUSSNAIL = register("chorussnail",
			EntityType.Builder.<ChorusSnailEntity>of(ChorusSnailEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChorusSnailEntity::new)

					.sized(1.25f, 1f));
	public static final RegistryObject<EntityType<ChorusBeeEntity>> CHORUSBEE = register("chorusbee",
			EntityType.Builder.<ChorusBeeEntity>of(ChorusBeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChorusBeeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnderPhantomEntity>> ENDERPHANTOM = register("enderphantom",
			EntityType.Builder.<EnderPhantomEntity>of(EnderPhantomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnderPhantomEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EndStriderEntity.init();
			EndMageEntity.init();
			ChorusSnailEntity.init();
			ChorusBeeEntity.init();
			EnderPhantomEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(END_STRIDER.get(), EndStriderEntity.createAttributes().build());
		event.put(ENDMAGE.get(), EndMageEntity.createAttributes().build());
		event.put(CHORUSSNAIL.get(), ChorusSnailEntity.createAttributes().build());
		event.put(CHORUSBEE.get(), ChorusBeeEntity.createAttributes().build());
		event.put(ENDERPHANTOM.get(), EnderPhantomEntity.createAttributes().build());
	}
}
