package zsj.YOUXJY.MoreFoods.Food;
import net.minecraft.item.ItemFood;
import zsj.YOUXJY.creativetab.TabLoader;

public class Pufferfish_s extends ItemFood{

	public Pufferfish_s() {
		super(6,4f,true);//(增加饥饿度，饱和度，喂动物)
 this.setUnlocalizedName("pufferfish_s");
 this.setCreativeTab(TabLoader.tabMoreFoods);
 
 
	}
	
}