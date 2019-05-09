package zsj.YOUXJY.BlockOre;

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
	public static Block bluestoneore = new BlueStoneOre();
	public static Item Itembluestoneore = new ItemBlock(bluestoneore);
    public static Block ptore= new BlockPtOre();
    public static Item Itemptore= new ItemBlock(ptore);
    public static Block ptbrick=new BlockPtbrick();
    public static Item Itemptbrick=new ItemBlock(ptbrick);
  public BlockLoader(FMLPreInitializationEvent event)
    {
        register(bluestoneore, "bluestoneore");
        register(Itembluestoneore, "Itembluestoneore");
        register(ptore, "ptore");
        register(Itemptore, "Itemptore");
        register(ptbrick,"ptbrick");
        register(Itemptbrick,"Itemptbrick");
    }
    
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(bluestoneore);
        registerRender(ptore);
        registerRender(ptbrick);

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