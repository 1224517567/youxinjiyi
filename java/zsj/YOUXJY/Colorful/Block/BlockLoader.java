package zsj.YOUXJY.Colorful.Block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
public class BlockLoader {
	
	public BlockLoader()
    {
        FMLCommonHandler.instance().bus();
    }
	public static Block ColorTNT = new ColorTNT();
	  public static Item ItemColorTNT = new ItemBlock(ColorTNT);
	  
	public static Block ColorCZ = new ColorCZ();
	public static Item ItemColorCZ=new ItemBlock(ColorCZ);
	 
	public static Block ColorTorch = new ColorTorch();
    public static Item ItemColorTorch=new ItemBlock(ColorTorch);
   
    public static Block WhiteCloudBlock=new White_Cloud_Block();
    public static Item ItemWhiteCloudBlock=new ItemBlock(WhiteCloudBlock);
  public BlockLoader(FMLPreInitializationEvent event)
    {
        register(ColorTNT, "ColorTNT");
        register(ItemColorTNT,"ItemColorTNT");
        
        register(ColorCZ, "ColorCZ");
        register(ItemColorCZ,"ItemColorCZ");
        
        register(ColorTorch,"ColorTorch");
        register(ItemColorTorch,"ItemColorTorch");
        
        register(WhiteCloudBlock,"WhiteCloudBlock");
        register(ItemWhiteCloudBlock,"ItemWhiteCloudBlock");
    }
    
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(ColorTNT);
        registerRender(ColorCZ);
        registerRender(ColorTorch);
        registerRender(WhiteCloudBlock);
    }
    private static void register(Item item, String name)
	   {
	    ForgeRegistries.ITEMS.register(item.setRegistryName(name));
	    }
    private static void register(Block block, String name)
    {
    	ForgeRegistries.BLOCKS.register(block.setRegistryName(name));
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}