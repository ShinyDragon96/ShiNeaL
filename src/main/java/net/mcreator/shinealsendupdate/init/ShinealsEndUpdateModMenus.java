
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.shinealsendupdate.world.inventory.PortalTableGUIMenu;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateMod;

public class ShinealsEndUpdateModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ShinealsEndUpdateMod.MODID);
	public static final RegistryObject<MenuType<PortalTableGUIMenu>> PORTAL_TABLE_GUI = REGISTRY.register("portal_table_gui", () -> IForgeMenuType.create(PortalTableGUIMenu::new));
}
