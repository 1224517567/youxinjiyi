package zsj.YOUXJY.LegendaryTools.Block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zsj.YOUXJY.Colorful.Block.ColorCZ;
import zsj.YOUXJY.Colorful.Block.ColorTNT;
import zsj.YOUXJY.Colorful.Block.ColorTorch;

public class BlockLoader {
	
	public BlockLoader()
    {
        FMLCommonHandler.instance().bus();
    }
	//public static Block BlueChest = new BlueChest();
   // public static Item ItemBlueChest = new ItemBlock(BlueChest);
  public BlockLoader(FMLPreInitializationEvent event)
    {
       // register(BlueChest, "BlueChest");
        //register(ItemBlueChest, "ItemBlueChest");
    }
    
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
       // registerRender(BlueChest);
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