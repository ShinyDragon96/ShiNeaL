
package net.mcreator.shinealsendupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModTabs;

public class EnderiteIngotItem extends Item {
	public EnderiteIngotItem() {
		super(new Item.Properties().tab(ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
