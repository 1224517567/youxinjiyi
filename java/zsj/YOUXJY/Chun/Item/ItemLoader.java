package zsj.YOUXJY.Chun.Item;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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
import zsj.YOUXJY.Chun.Armor.ItemCHUNArmor;
public class ItemLoader
{
	public ItemLoader()
    {
        FMLCommonHandler.instance().bus();
    }
	
	
	public static Item CHUNcrystal = new CHUNcrystal();//定义物品的类名，这里就是new出一个物品对象。
	public static Item CHUNpickaxe/*对象名*/ = new zsj.YOUXJY.Chun.Tools.CHUNpickaxe();////定义物品的类名
	public static Item CHUNaxe = new zsj.YOUXJY.Chun.Tools.CHUNaxe();
	public static Item CHUNshovel = new zsj.YOUXJY.Chun.Tools.CHUNshovel();
	public static Item CHUNsword = new zsj.YOUXJY.Chun.Tools.CHUNsword();
	public static ItemArmor CHUNHelmet = new ItemCHUNArmor();
	public static ItemArmor CHUNChestplate = new ItemCHUNArmor.Chestplate();
    public static ItemArmor CHUNLeggings = new ItemCHUNArmor.Leggings();
    public static ItemArmor CHUNBoots = new ItemCHUNArmor.Boots();
	   public ItemLoader(FMLPreInitializationEvent event)
    {
	   
	        register(CHUNcrystal,"CHUNcrystal");
	        register(CHUNpickaxe,"CHUNpickaxe");
	        register(CHUNaxe,"CHUNaxe");
	        register(CHUNshovel,"CHUNshovel");
	        register(CHUNsword,"CHUNsword");
	        register(CHUNHelmet,"CHUNHelmet");
	        register(CHUNChestplate,"CHUNChestplate");
	        register(CHUNLeggings,"CHUNLeggings");
	        register(CHUNBoots,"CHUNBoots");

	    }

	    @SideOnly(Side.CLIENT)
	    public static void registerRenders()
	    {
	        registerRender(CHUNcrystal);
	        registerRender(CHUNpickaxe);
	        registerRender(CHUNaxe);
	        registerRender(CHUNshovel);
	        registerRender(CHUNsword);
	        registerRender(CHUNHelmet);
	        registerRender(CHUNChestplate);
	        registerRender(CHUNLeggings);
	        registerRender(CHUNBoots);

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