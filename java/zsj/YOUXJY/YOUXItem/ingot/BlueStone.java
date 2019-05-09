package zsj.YOUXJY.YOUXItem.ingot;

import net.minecraft.item.Item;
import net.minecraft.item.ItemEnderPearl;
import zsj.YOUXJY.creativetab.TabLoader;
/*蓝宝石*/
public class BlueStone extends ItemEnderPearl{
	 public  BlueStone(){   	
   	  super();
   	  this.setUnlocalizedName("bluestone");
   	  this.setCreativeTab(TabLoader.tabYOUXItem);
   	  this.setMaxStackSize(64);
   	  
     }
}
