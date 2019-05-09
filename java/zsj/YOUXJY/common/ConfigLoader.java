package zsj.YOUXJY.common;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

public class ConfigLoader
{
    private static Configuration config;

    private static Logger logger;

    public static int CHUNcrystalBurnTime;
    public static int Lave_fireId;

    public ConfigLoader(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();
    }

    public static void load()
    {
        logger.info("开始加载配置...");
        String comment1;
        String Lave_fireIdComment;

        comment1 = "一个新春晶石能在熔炉里燃烧多少秒";
        Lave_fireIdComment = "附魔 熔岩贯通id （附魔id与其它mod的id冲突时可更改）";
        CHUNcrystalBurnTime = config.get(Configuration.CATEGORY_GENERAL, "新春晶石热值(秒)", 175, comment1).getInt();
        Lave_fireId = config.get(Configuration.CATEGORY_GENERAL, "熔岩贯通附魔ID", 122, Lave_fireIdComment).getInt();
        config.save();
        logger.info("完成加载配置 ");
    }

    public static Logger logger()
    {
        return logger;
    }
}