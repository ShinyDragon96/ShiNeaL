
package net.mcreator.shinealsendupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModTabs;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModFluids;

public class VoidialWaterItem extends BucketItem {
	public VoidialWaterItem() {
		super(ShinealsEndUpdateModFluids.VOIDIAL_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE));
	}
}
