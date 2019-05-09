package zsj.YOUXJY.LegendaryTools.Tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import zsj.YOUXJY.creativetab.TabLoader;

public class ShenglongSword extends ItemSword {
	public static final Item.ToolMaterial LONG = EnumHelper.addToolMaterial("LONG", 3/*工具等级*/, 15/*耐久*/, 15.0F/*效率*/, 21.5F/*伤害*/, 30/*附魔等级*/);

    public ShenglongSword()
    {
        super(LONG);
        this.setUnlocalizedName("ShenglongSword");
        this.setCreativeTab(TabLoader.tablegendaryTools);
    }
}
