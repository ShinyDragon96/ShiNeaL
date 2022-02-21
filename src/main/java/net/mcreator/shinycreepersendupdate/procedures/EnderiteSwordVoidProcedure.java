package net.mcreator.shinycreepersendupdate.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.shinycreepersendupdate.item.EnderiteSwordItem;
import net.mcreator.shinycreepersendupdate.ShinycreepersEndUpdateMod;

import java.util.Map;
import java.util.Collections;

public class EnderiteSwordVoidProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ShinycreepersEndUpdateMod.LOGGER.warn("Failed to load dependency x for procedure EnderiteSwordVoid!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ShinycreepersEndUpdateMod.LOGGER.warn("Failed to load dependency y for procedure EnderiteSwordVoid!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ShinycreepersEndUpdateMod.LOGGER.warn("Failed to load dependency z for procedure EnderiteSwordVoid!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ShinycreepersEndUpdateMod.LOGGER.warn("Failed to load dependency entity for procedure EnderiteSwordVoid!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPosY() < 0) {
			if ((entity.world.getDimensionKey()) == (World.THE_END)) {
				if ((new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entity)).getItem() == EnderiteSwordItem.block) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate(x, (y + 1), z);
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, (y + 1), z, _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
				}
			}
		}
	}
}
