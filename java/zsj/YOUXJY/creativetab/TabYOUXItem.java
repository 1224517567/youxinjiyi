package zsj.YOUXJY.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabYOUXItem extends CreativeTabs {

	
	TabYOUXItem(){
		
		super("YOUXItem");
	}
	
	@Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(zsj.YOUXJY.YOUXItem.ItemLoader.bluestone);/**创造模式物品栏显示物品*/
    }
}

