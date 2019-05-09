package zsj.YOUXJY.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TablegendaryTools extends CreativeTabs {

	
	TablegendaryTools(){
		
		super("LegendaryTools");
	}
	
	@Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.weilonglatiaobz);/**创造模式物品栏显示物品*/
    }
}

