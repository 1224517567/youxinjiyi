package zsj.YOUXJY.common;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zsj.YOUXJY.WorldGenerate.WorldGeneratorLoader;
import zsj.YOUXJY.change.ChangeLoader;
import zsj.YOUXJY.creativetab.TabLoader;
import zsj.YOUXJY.event.EventLoader;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	new ConfigLoader(event);
    	new TabLoader(event);
    	new zsj.YOUXJY.Colorful.Block.BlockLoader(event);
    	new zsj.YOUXJY.BlockOre.BlockLoader(event);
    	new zsj.YOUXJY.LegendaryTools.Block.BlockLoader(event);
    	new zsj.YOUXJY.Chun.Item.ItemLoader(event);
    	new zsj.YOUXJY.LegendaryTools.Item.ItemLoader(event);
    	new zsj.YOUXJY.MoreFoods.Food.FoodLoader(event);
    	new zsj.YOUXJY.YOUXItem.ItemLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {

            new ChangeLoader();
            new EventLoader();
            new WorldGeneratorLoader();
            
          
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}