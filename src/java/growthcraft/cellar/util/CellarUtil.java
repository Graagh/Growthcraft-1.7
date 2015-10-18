package growthcraft.cellar.util;

import growthcraft.cellar.GrowthCraftCellar;

import net.minecraft.item.ItemStack;

public class CellarUtil
{
	private CellarUtil() {}

	/**
	 * Determines if the given item stack is a residue item
	 *
	 * @param stack - item stack to check
	 * @return true if its a residue, false otherwise
	 */
	public static boolean itemIsResidue(ItemStack stack)
	{
		if (stack != null)
		{
			return GrowthCraftCellar.residue.isItemEqual(stack);
		}
		return false;
	}
}
