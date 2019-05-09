package zsj.YOUXJY.YOUXItem;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
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
import zsj.YOUXJY.YOUXItem.ingot.BlueStone;
import zsj.YOUXJY.YOUXItem.ingot.Ptingot;
public class ItemLoader
{
	public ItemLoader()
    {
        FMLCommonHandler.instance().bus();
    }
	
	
       
        public static Item Stone_ingot=new Stone_ingot();
        public static Item youxinjiyiItem=new YouxinjiyiItem();
        public static Item bluestone=new BlueStone();
        public static Item bluepowder=new BluePowder();
        public static Item pt=new Ptingot();
        
	   public ItemLoader(FMLPreInitializationEvent event)
	    {
	   
	  
	        register(Stone_ingot,"Stone_ingot");
	        register(youxinjiyiItem,"youxinjiyiItem");
	        register(bluestone,"bluestone");
	        register(bluepowder,"bluepowder");
	        register(pt,"pt");
	        
	    }

	    @SideOnly(Side.CLIENT)
	    public static void registerRenders()
	    {
	       
	        registerRender(Stone_ingot);
	        registerRender(youxinjiyiItem);
	        registerRender(bluestone);
	        registerRender(bluepowder);
	        registerRender(pt);

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