
package net.mcreator.shinealsendupdate.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.shinealsendupdate.itemgroup.ShinyCreepersEndUpdateItemGroup;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateModElements;

@ShinealsEndUpdateModElements.ModElement.Tag
public class EnderiteSwordItem extends ShinealsEndUpdateModElements.ModElement {
	@ObjectHolder("shineals_end_update:enderite_sword")
	public static final Item block = null;

	public EnderiteSwordItem(ShinealsEndUpdateModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2501;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderiteIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ShinyCreepersEndUpdateItemGroup.tab)) {
		}.setRegistryName("enderite_sword"));
	}
}
