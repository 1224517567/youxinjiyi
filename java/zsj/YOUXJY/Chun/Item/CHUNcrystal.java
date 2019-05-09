package zsj.YOUXJY.Chun.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zsj.YOUXJY.creativetab.TabLoader;

public class CHUNcrystal extends Item
{
	@SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    public CHUNcrystal()
    {
        super();
    this.setUnlocalizedName("CHUNcrystal");//内部名称，就是/give 名字  内部名称 数量
    this.setCreativeTab(TabLoader.tabnewyear);//创造模式物品栏标签
    }
}