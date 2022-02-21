
package net.mcreator.shinycreepersendupdate.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.shinycreepersendupdate.itemgroup.ShinyCreepersEndUpdateItemGroup;
import net.mcreator.shinycreepersendupdate.ShinycreepersEndUpdateModElements;

@ShinycreepersEndUpdateModElements.ModElement.Tag
public class EnderiteIngotItem extends ShinycreepersEndUpdateModElements.ModElement {
	@ObjectHolder("shinycreepers_end_update:enderite_ingot")
	public static final Item block = null;

	public EnderiteIngotItem(ShinycreepersEndUpdateModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ShinyCreepersEndUpdateItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("enderite_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
