
package net.mcreator.shinealsendupdate.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModTabs;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModItems;

public class EnderiteSwordItem extends SwordItem {
	public EnderiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2501;
			}

			public float getSpeed() {
				return 4f;
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
				return Ingredient.of(new ItemStack(ShinealsEndUpdateModItems.ENDERITE_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE));
		setRegistryName("enderite_sword");
	}
}
