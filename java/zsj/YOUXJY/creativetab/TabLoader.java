package zsj.YOUXJY.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class TabLoader
{
    public static CreativeTabs tabnewyear;
    public static CreativeTabs tablegendaryTools;
    public static CreativeTabs tabColorful;
    public static CreativeTabs tabMoreFoods;
    public static CreativeTabs tabYOUXItem;
    public static CreativeTabs tabOre;
    public TabLoader(FMLPreInitializationEvent event)
    {
        tabnewyear = new Tabnewyear();
 tablegendaryTools = new TablegendaryTools();
       tabColorful = new TabColorful();
      tabMoreFoods = new TabMoreFoods();
       tabYOUXItem = new TabYOUXItem();
            tabOre = new TabOre();
    }
}