package zsj.YOUXJY.MoreFoods.Food;

import net.minecraft.item.ItemFood;
import zsj.YOUXJY.creativetab.TabLoader;

public class Egg_s extends ItemFood{

	public Egg_s() {
		super(4,2f,false);//(增加饥饿度，饱和度，喂动物)
 this.setUnlocalizedName("egg_s");
 this.setCreativeTab(TabLoader.tabMoreFoods);
 
 
	}
	
}
