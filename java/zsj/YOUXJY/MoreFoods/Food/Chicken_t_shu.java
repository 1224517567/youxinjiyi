package zsj.YOUXJY.MoreFoods.Food;

import net.minecraft.item.ItemFood;
import zsj.YOUXJY.creativetab.TabLoader;

public class Chicken_t_shu extends ItemFood{

	public Chicken_t_shu() {
		super(7,5.5f,true);//(增加饥饿度，饱和度，喂动物)
 this.setUnlocalizedName("chicken_t_shu");
 this.setCreativeTab(TabLoader.tabMoreFoods);
 
 
	}
	
}