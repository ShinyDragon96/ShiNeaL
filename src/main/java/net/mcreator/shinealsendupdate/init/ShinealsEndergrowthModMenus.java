
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.shinealsendndergrowth.world.inventory.PortalTableGUIMenu;
import net.mcreator.shinealsendndergrowth.ShinealsEndergrowthMod;

public class ShinealsEndergrowthModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ShinealsEndergrowthMod.MODID);
	public static final RegistryObject<MenuType<PortalTableGUIMenu>> PORTAL_TABLE_GUI = REGISTRY.register("portal_table_gui", () -> IForgeMenuType.create(PortalTableGUIMenu::new));
}
