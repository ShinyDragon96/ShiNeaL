
package net.mcreator.shinealsendupdate.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModTabs;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModItems;

public class EnderitePickaxeItem extends PickaxeItem {
	public EnderitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2501;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ShinealsEndUpdateModItems.ENDERITE_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties().tab(ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE));
	}
}
