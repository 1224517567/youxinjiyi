package zsj.YOUXJY.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zsj.YOUXJY.Chun.Item.ItemLoader;

public class Tabnewyear extends CreativeTabs {

	
	Tabnewyear(){
		
		super("newyear");
	}
	
	@Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.CHUNcrystal);
    }
}

