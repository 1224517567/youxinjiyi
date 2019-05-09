package zsj.YOUXJY.LegendaryTools.Item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
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
import zsj.YOUXJY.LegendaryTools.Food.Weilonglatiao;
public class ItemLoader
{
	public ItemLoader()
    {
        FMLCommonHandler.instance().bus();
    }
	
	
	

        public static Item weilonglatiaobz=new Weilonglatiaobz();
        public static Item weilonglatiao=new Weilonglatiao();
        public static ItemSword MingKnife = new zsj.YOUXJY.LegendaryTools.Tool.MingKnife();
        public static Item RepairCrystal = new RepairCrystal();
        public static ItemSword ShenglongSword=new zsj.YOUXJY.LegendaryTools.Tool.ShenglongSword();
	    public static ItemPickaxe Endpickaxe = new zsj.YOUXJY.LegendaryTools.Tool.End_pickaxe();
        public ItemLoader(FMLPreInitializationEvent event)
	    {
	   
	        register(weilonglatiaobz,"weilonglatiaobz");
	        register(weilonglatiao,"weilonglatiao");
	        register(MingKnife,"MingKnife");
	        register(RepairCrystal,"RepairCrystal");
	        register(ShenglongSword,"ShenglongSword");
	        register(Endpickaxe,"Endpickaxe");
	        
	    }

	    @SideOnly(Side.CLIENT)
	    public static void registerRenders()
	    {
	        registerRender(weilonglatiaobz);
	        registerRender(weilonglatiao);
	        registerRender(MingKnife);
	        registerRender(RepairCrystal);
	        registerRender(ShenglongSword);
	        registerRender(Endpickaxe);

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