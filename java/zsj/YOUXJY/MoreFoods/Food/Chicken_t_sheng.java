package zsj.YOUXJY.MoreFoods.Food;

import net.minecraft.item.ItemFood;
import zsj.YOUXJY.creativetab.TabLoader;

public class Chicken_t_sheng extends ItemFood{

	public Chicken_t_sheng() {
		super(3,0.5f,false);//(增加饥饿度，饱和度，喂动物)
 this.setUnlocalizedName("chicken_t_sheng");
 this.setCreativeTab(TabLoader.tabMoreFoods);
 
 
	}
	
}