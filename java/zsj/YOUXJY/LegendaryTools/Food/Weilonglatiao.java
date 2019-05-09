package zsj.YOUXJY.LegendaryTools.Food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import zsj.YOUXJY.creativetab.TabLoader;

public class Weilonglatiao extends ItemFood {

	public Weilonglatiao() {
		super(4,0.4f,false);//(增加饥饿度，饱和度，喂动物)
 this.setAlwaysEdible();
 this.setUnlocalizedName("weilonglatiao");
 this.setCreativeTab(TabLoader.tabMoreFoods);
 this.setPotionEffect(new PotionEffect(Potion.getPotionById(19), 20, 3), 0.2f);//(效果id，时间，药水等级，概率)
	}

	
	@Override
    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 100, 3));
            player.addExperience(25);
    
        }
        super.onFoodEaten(stack, worldIn, player);
    }
}
