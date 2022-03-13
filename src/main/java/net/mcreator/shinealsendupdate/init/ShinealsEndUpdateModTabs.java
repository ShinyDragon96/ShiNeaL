
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ShinealsEndUpdateModTabs {
	public static CreativeModeTab TAB_SHINY_CREEPERS_END_UPDATE;

	public static void load() {
		TAB_SHINY_CREEPERS_END_UPDATE = new CreativeModeTab("tabshiny_creepers_end_update") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ShinealsEndUpdateModItems.ENDERITE_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
