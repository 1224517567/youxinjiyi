package zsj.YOUXJY.Chun.Tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import zsj.YOUXJY.creativetab.TabLoader;
import net.minecraftforge.common.util.EnumHelper;
public class CHUNshovel extends ItemSpade
{
    public static final Item.ToolMaterial CHUN = EnumHelper.addToolMaterial("CHUN", 3/*工具等级*/, 666/*耐久*/, 15.0F/*效率*/, 1.0F/*伤害*/, 30/*附魔等级*/);

    public CHUNshovel()
    {
        super(CHUN);
        this.setUnlocalizedName("CHUNshovel");
        this.setCreativeTab(TabLoader.tabnewyear);
    }
}