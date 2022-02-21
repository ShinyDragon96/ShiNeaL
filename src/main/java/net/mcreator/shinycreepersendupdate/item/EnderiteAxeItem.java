
package net.mcreator.shinycreepersendupdate.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.shinycreepersendupdate.itemgroup.ShinyCreepersEndUpdateItemGroup;
import net.mcreator.shinycreepersendupdate.ShinycreepersEndUpdateModElements;

@ShinycreepersEndUpdateModElements.ModElement.Tag
public class EnderiteAxeItem extends ShinycreepersEndUpdateModElements.ModElement {
	@ObjectHolder("shinycreepers_end_update:enderite_axe")
	public static final Item block = null;

	public EnderiteAxeItem(ShinycreepersEndUpdateModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2501;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderiteIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ShinyCreepersEndUpdateItemGroup.tab)) {
		}.setRegistryName("enderite_axe"));
	}
}
