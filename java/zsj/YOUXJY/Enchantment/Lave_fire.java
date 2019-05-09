/*package zsj.YOUXJY.Enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import zsj.YOUXJY.MainYOUXJY;
import zsj.YOUXJY.common.ConfigLoader;

public class Lave_fire extends Enchantment
{
	 public  Lave_fire() {
		super(ConfigLoader.Lave_fireId, new ResourceLocation(MainYOUXJY.MODID + ":" + "Lave_fire"), 1,
                EnumEnchantmentType.DIGGER);
				
				
				
			
		
	}

	
    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 15;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 1;
    }

    @Override
    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench.effectId != silkTouch.effectId && ench.effectId != fortune.effectId;
    }

    @Override
    public boolean canApply(ItemStack stack)
    {
        return stack.getItem() == Items.SHEARS ? true : super.canApply(stack);
    }             
}*/