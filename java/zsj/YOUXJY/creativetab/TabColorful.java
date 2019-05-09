package zsj.YOUXJY.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zsj.YOUXJY.Chun.Item.ItemLoader;

public class TabColorful extends CreativeTabs {

	
	TabColorful(){
		
		super("Colorful");
	}
	
	@Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack( Item.getItemFromBlock(zsj.YOUXJY.Colorful.Block.BlockLoader.ColorTNT));
    }
}
