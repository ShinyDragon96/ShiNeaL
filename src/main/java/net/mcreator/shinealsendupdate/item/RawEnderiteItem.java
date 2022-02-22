
package net.mcreator.shinealsendupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModTabs;

public class RawEnderiteItem extends Item {
	public RawEnderiteItem() {
		super(new Item.Properties().tab(ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("raw_enderite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
