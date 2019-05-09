package zsj.YOUXJY.LegendaryTools.Tool;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;
import zsj.YOUXJY.creativetab.TabLoader;

public class End_pickaxe extends ItemPickaxe {
	public static final Item.ToolMaterial END = EnumHelper.addToolMaterial("END", 3/*工具等级*/, 25/*耐久*/, 0.5F/*效率*/, 0.5F/*伤害*/, 0/*附魔等级*/);

    public End_pickaxe()
    {
        super(END);
        this.setUnlocalizedName("Endpickaxe");
        this.setCreativeTab(TabLoader.tablegendaryTools);
      
    }
    
    
}
