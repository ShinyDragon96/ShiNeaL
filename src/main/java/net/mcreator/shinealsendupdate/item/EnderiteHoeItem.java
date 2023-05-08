
package net.mcreator.shinealsendupdate.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModItems;

public class EnderiteHoeItem extends HoeItem {
	public EnderiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2501;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ShinealsEndUpdateModItems.ENDERITE_INGOT.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}
