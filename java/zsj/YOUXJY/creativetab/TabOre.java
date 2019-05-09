package zsj.YOUXJY.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zsj.YOUXJY.BlockOre.BlockLoader;

public class TabOre extends CreativeTabs {

	
	TabOre(){
		
		super("ore");
	}
	
	@Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(Item.getItemFromBlock(BlockLoader.bluestoneore));
    }
}

