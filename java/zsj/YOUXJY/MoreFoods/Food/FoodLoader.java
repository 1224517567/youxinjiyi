package zsj.YOUXJY.MoreFoods.Food;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.GameData;
import zsj.YOUXJY.LegendaryTools.Food.Weilonglatiao;
public class FoodLoader
{
	public FoodLoader()
    {
        FMLCommonHandler.instance().bus();
    }
	
	
	
               public static ItemFood Jiaozhuangwater=new Jiaozhunagshui();
               public static ItemFood egg_s=new Egg_s();
               public static ItemFood pufferfish_s=new Pufferfish_s();
               public static ItemFood chicken_t_sheng=new Chicken_t_sheng();
               public static ItemFood chicken_t_shu=new Chicken_t_shu();
               
	    public FoodLoader(FMLPreInitializationEvent event)
	    {
	   

	        register(Jiaozhuangwater,"Jiaozhuangwater");
	        register(egg_s,"egg_s");
	        register(pufferfish_s,"pufferfish_s");
	        register(chicken_t_sheng,"chicken_t_sheng");
	        register(chicken_t_shu,"chicken_t_shu");
	        
	    }

	    @SideOnly(Side.CLIENT)
	    public static void registerRenders()
	    {

	        registerRender(Jiaozhuangwater);
	        registerRender(egg_s);
	        registerRender(pufferfish_s);
	        registerRender(chicken_t_sheng);
	        registerRender(chicken_t_shu);

	    }

	   private static void register(Item item, String name)
	    {
		   ForgeRegistries.ITEMS.register(item.setRegistryName(name));
	    }

	    @SideOnly(Side.CLIENT)
	    private static void registerRender(Item item)
	    {
	    	
	        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	    }
	    
	    
}