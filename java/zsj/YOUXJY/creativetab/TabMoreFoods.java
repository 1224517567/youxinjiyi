package zsj.YOUXJY.creativetab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zsj.YOUXJY.Chun.Item.ItemLoader;

public class TabMoreFoods extends CreativeTabs {

	
	TabMoreFoods(){
		
		super("MoreFoods");
	}
	
	@Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(zsj.YOUXJY.MoreFoods.Food.FoodLoader.Jiaozhuangwater);
    }
}
