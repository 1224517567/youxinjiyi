package zsj.YOUXJY.Chun.Tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import zsj.YOUXJY.creativetab.TabLoader;
import net.minecraftforge.common.util.EnumHelper;
public class CHUNsword extends ItemSword
{
    public static final Item.ToolMaterial CHUN = EnumHelper.addToolMaterial("CHUN", 3/*工具等级*/, 666/*耐久*/, 15.0F/*效率*/, 7.0F/*伤害*/, 30/*附魔等级*/);

    public CHUNsword()
    {
        super(CHUN);
        this.setUnlocalizedName("CHUNsword");
        this.setCreativeTab(TabLoader.tabnewyear);
    }
}