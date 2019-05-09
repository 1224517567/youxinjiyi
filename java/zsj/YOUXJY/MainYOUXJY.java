package zsj.YOUXJY;

import zsj.YOUXJY.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = MainYOUXJY.MODID, name = MainYOUXJY.NAME, version = MainYOUXJY.VERSION, acceptedMinecraftVersions = "1.12.2")
public class MainYOUXJY
{
    public static final String MODID = "youxinjiyi";
    public static final String NAME = "Optimal symplectic memory";
    public static final String VERSION = "1.0.0";

    @Instance(MainYOUXJY.MODID)
    public static MainYOUXJY instance;

    @SidedProxy(clientSide = "zsj.YOUXJY.client.ClientProxy", //这是代理类的路径
            serverSide = "zsj.YOUXJY.common.CommonProxy")//clientSide和serverSide
    public static CommonProxy proxy;                     //是区分服务端和客户端
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}