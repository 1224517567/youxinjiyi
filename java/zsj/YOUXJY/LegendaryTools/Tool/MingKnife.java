package zsj.YOUXJY.LegendaryTools.Tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zsj.YOUXJY.creativetab.TabLoader;

public class MingKnife extends ItemSword
{
	
	@SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    public static final Item.ToolMaterial MING = EnumHelper.addToolMaterial("MING", 3/*工具等级*/, 10000/*耐久*/, 15.0F/*效率*/, 0.5F/*伤害*/, 1/*附魔等级*/);

    public MingKnife()
    {
        super(MING);
        this.setUnlocalizedName("MingKnife");
        this.setCreativeTab(TabLoader.tablegendaryTools);
    }
}