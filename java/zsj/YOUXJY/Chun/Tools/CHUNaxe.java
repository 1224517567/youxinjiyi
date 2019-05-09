package zsj.YOUXJY.Chun.Tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import zsj.YOUXJY.creativetab.TabLoader;
import net.minecraftforge.common.util.EnumHelper;
public class CHUNaxe extends ItemAxe
{
    public static final Item.ToolMaterial CHUN = EnumHelper.addToolMaterial("CHUN", 3/*工具等级*/, 666/*耐久*/, 15.0F/*效率*/, 4.0F/*伤害*/, 30/*附魔等级*/);

    public CHUNaxe()
    {
        super(CHUN,9f,1f);
        this.setUnlocalizedName("CHUNaxe");
        this.setCreativeTab(TabLoader.tabnewyear);
    }
}