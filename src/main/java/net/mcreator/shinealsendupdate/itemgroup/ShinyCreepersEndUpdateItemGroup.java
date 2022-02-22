
package net.mcreator.shinealsendupdate.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.shinealsendupdate.item.EnderiteIngotItem;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateModElements;

@ShinealsEndUpdateModElements.ModElement.Tag
public class ShinyCreepersEndUpdateItemGroup extends ShinealsEndUpdateModElements.ModElement {
	public ShinyCreepersEndUpdateItemGroup(ShinealsEndUpdateModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabshiny_creepers_end_update") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EnderiteIngotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
