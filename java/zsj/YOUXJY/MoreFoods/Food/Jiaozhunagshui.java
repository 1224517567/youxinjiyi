package zsj.YOUXJY.MoreFoods.Food;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import zsj.YOUXJY.creativetab.TabLoader;
import net.minecraft.potion.Potion;

public class Jiaozhunagshui extends ItemFood {

	public Jiaozhunagshui() {
		super(3,0.4f,true);//(增加饥饿度，饱和度，喂动物)
 this.setAlwaysEdible();
 this.setUnlocalizedName("Jiaozhuangwater");
 this.setCreativeTab(TabLoader.tabMoreFoods);
 
 
	}
	@Override
    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
            player.clearActivePotions();
            
    
        }
        super.onFoodEaten(stack, worldIn, player);
    }
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		target.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 100, 3));/*添加效果（缓慢III 3秒）*/
        return super.hitEntity(stack, target, attacker) ;
    }
	
	
}
