package zsj.YOUXJY.change;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zsj.YOUXJY.common.ConfigLoader;

public class ChangeLoader
{
    public ChangeLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()//添加合成表
    {
    	GameRegistry.addShapedRecipe(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal.getRegistryName(),zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal.getRegistryName(),new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal/*新春晶石*/), new Object[]
    	        {
    	                " * ", "*#*", " * ", '#', Items.LAVA_BUCKET, '*', Items.EGG,//有序合成
    	        });
    	           ResourceLocation z1=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNpickaxe.getRegistryName();
    	           ResourceLocation z2=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNaxe.getRegistryName();
    	           ResourceLocation z3=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNshovel.getRegistryName();
    	    	   ResourceLocation z4=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNsword.getRegistryName();
    	    	   ResourceLocation z5=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNHelmet.getRegistryName();
    	    	   ResourceLocation z6=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNChestplate.getRegistryName();
    	    	   ResourceLocation z7=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNLeggings.getRegistryName();
    	    	   ResourceLocation z8=zsj.YOUXJY.Chun.Item.ItemLoader.CHUNBoots.getRegistryName();
    	GameRegistry.addShapedRecipe(z1,z1,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNpickaxe/*新春烈镐*/), new Object[]
    	        {
    	                /*从上到下*/"###", " * ", " * ", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal,'*',Items.STICK//有序合成
    	        });
    	GameRegistry.addShapedRecipe(z2,z2,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNaxe/*新春烈斧*/), new Object[]
    	        {
    	                " ##", " *#", " * ", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal,'*',Items.STICK//有序合成
    	        });
    	GameRegistry.addShapedRecipe(z3,z3,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNshovel/*新春烈锹*/), new Object[]
    	        {
    	                " # ", " * ", " * ", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal,'*',Items.STICK//有序合成
    	        });
    	GameRegistry.addShapedRecipe(z4,z4,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNsword/*新春烈剑*/), new Object[]
    	        {
    	                " # ", " # ", " * ", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal,'*',Items.STICK//有序合成
    	        });
    	GameRegistry.addShapedRecipe(z5,z5,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNHelmet/*新春头盔*/), new Object[]
    	        {
    	                "###", "# #", "   ", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal//有序合成
    	        });
    	GameRegistry.addShapedRecipe(z6,z6,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNChestplate/*新春胸甲*/), new Object[]
    	        {
    	                "# #", "###", "###", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal//有序合成
    	        });
    	GameRegistry.addShapedRecipe(z7,z7,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNLeggings/*新春护腿*/), new Object[]
    	        {
    	                "###", "# #", "# #", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal//有序合成
    	        });
    	GameRegistry.addShapedRecipe(z8,z8,new ItemStack(zsj.YOUXJY.Chun.Item.ItemLoader.CHUNBoots/*新春靴子*/), new Object[]
    	        {
    	                "   ", "# #", "# #", '#', zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal//有序合成
    	        });
                       	ResourceLocation x1= zsj.YOUXJY.Colorful.Block.BlockLoader.ColorTNT.getRegistryName();
                       	ResourceLocation x2=zsj.YOUXJY.LegendaryTools.Item.ItemLoader.weilonglatiaobz.getRegistryName();
                        ResourceLocation x3=zsj.YOUXJY.Colorful.Block.BlockLoader.ColorCZ.getRegistryName();
                    	ResourceLocation x4=zsj.YOUXJY.Colorful.Block.BlockLoader.ColorTorch.getRegistryName();
                    //	ResourceLocation x5=zsj.YOUXJY.BlockOre.BlockLoader.ptore.getRegistryName();
    	GameRegistry.addShapedRecipe(x1,x1,new ItemStack(zsj.YOUXJY.Colorful.Block.BlockLoader.ColorTNT/*彩色TNT*/), new Object[]
    	        {
    	                "#*#", "***", "#*#", '#', Blocks.WOOL,'*', Items.GUNPOWDER//有序合成
    	        });
    	GameRegistry.addShapedRecipe(x2,x2,new ItemStack(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.weilonglatiaobz/*卫龙辣条包装*/), new Object[]
    	        {
    	                "#*#", "*#*", "#*#", '#', Items.WHEAT,'*', Items.LEATHER//有序合成
    	        });
    	GameRegistry.addShapedRecipe(x3,x3,new ItemStack(zsj.YOUXJY.Colorful.Block.BlockLoader.ColorCZ/*彩色瓷砖*/), new Object[]
    	        {
    	                "*#*", "#h#", "*#*", '#', Blocks.BRICK_BLOCK,'*', Blocks.WOOL,'h',Blocks.OBSIDIAN//有序合成
    	        });
    	GameRegistry.addShapedRecipe(x4,x4,new ItemStack(zsj.YOUXJY.Colorful.Block.BlockLoader.ColorTorch/*彩色火把1*/,3), new Object[]
    	        {
    	                " 1 ", " 8 ", " 6 ", '1', Items.COAL,'8', Blocks.WOOL,'6',Items.STICK//有序合成
    	        });
    	GameRegistry.addShapedRecipe(x4,x4,new ItemStack(zsj.YOUXJY.Colorful.Block.BlockLoader.ColorTorch/*彩色火把2*/,9), new Object[]
    	        {
    	                " 1 ", " 8 ", " 6 ", '1', Items.LAVA_BUCKET,'8', Blocks.WOOL,'6',Items.STICK//有序合成
    	        });
    	//GameRegistry.addShapedRecipe(x5,x5,new ItemStack(zsj.YOUXJY.Colorful.Block.BlockLoader.ColorTorch/*铂金矿石*/,9), new Object[]
    	 //       {
    	   //             " w ", " w ", "   ", '1', zsj.YOUXJY.YOUXItem.ItemLoader.pt,'w', Blocks.WOOL,'6',Items.STICK//有序合成
    	   //     });
    	ResourceLocation c1=zsj.YOUXJY.LegendaryTools.Item.ItemLoader.MingKnife.getRegistryName();
    	ResourceLocation c2=zsj.YOUXJY.LegendaryTools.Item.ItemLoader.RepairCrystal.getRegistryName();
    	ResourceLocation c3=zsj.YOUXJY.LegendaryTools.Item.ItemLoader.ShenglongSword.getRegistryName();
    	ResourceLocation c4=zsj.YOUXJY.MoreFoods.Food.FoodLoader.chicken_t_sheng.getRegistryName();
    	ResourceLocation c5=zsj.YOUXJY.MoreFoods.Food.FoodLoader.egg_s.getRegistryName();
    			
    	GameRegistry.addShapedRecipe(c1,c1,new ItemStack(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.MingKnife/*名刀司命*/), new Object[]
    	        {
    	                " s*", " #s", "#  ", '#', Items.NETHER_STAR,'*', Blocks.IRON_BLOCK,'s',Blocks.DIAMOND_BLOCK//有序合成
    	        });
    	GameRegistry.addShapedRecipe(c2,c2,new ItemStack(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.RepairCrystal/*修复水晶*/), new Object[]
    	        {
    	                " d ", "*#*", " * ", '#', Items.WATER_BUCKET,'*', Items.IRON_INGOT,'d',Items.DIAMOND//有序合成
    	        });
    	GameRegistry.addShapedRecipe(c1,c1,new ItemStack(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.MingKnife/*名刀司命修复*/), new Object[]
    	        {
    	                "   ", " * ", " # ", '#', new ItemStack( zsj.YOUXJY.LegendaryTools.Item.ItemLoader.MingKnife, 1/*数量*/, Short.MAX_VALUE),'*', zsj.YOUXJY.LegendaryTools.Item.ItemLoader.RepairCrystal//有序合成
    	        });
    	GameRegistry.addShapedRecipe(c3,c3,new ItemStack(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.ShenglongSword/*赖升龙剑*/), new Object[]
    	        {
    	                "  p", " * ", "#  ", '#', zsj.YOUXJY.YOUXItem.ItemLoader.Stone_ingot,'*', Blocks.IRON_BLOCK,'p',Blocks.EMERALD_BLOCK//有序合成
    	        });
    	GameRegistry.addShapedRecipe(c4,c4,new ItemStack(zsj.YOUXJY.MoreFoods.Food.FoodLoader.chicken_t_sheng,2/*2个生鸡腿*/), new Object[]
    	        {
    	                "   ", " # ", "*  ", '#', Items.CHICKEN, '*', Items.STONE_SWORD,//有序合成
    	        });
    	GameRegistry.addShapedRecipe(c5,c5,new ItemStack(zsj.YOUXJY.MoreFoods.Food.FoodLoader.egg_s/*去壳蛋*/), new Object[]
    	        {
    	                "   ", " # ", "*  ", '#', Items.EGG, '*', zsj.YOUXJY.YOUXItem.ItemLoader.Stone_ingot,//有序合成
    	        });
    	GameRegistry.addShapedRecipe(zsj.YOUXJY.MoreFoods.Food.FoodLoader.Jiaozhuangwater.getRegistryName(),zsj.YOUXJY.MoreFoods.Food.FoodLoader.Jiaozhuangwater.getRegistryName(),new ItemStack(zsj.YOUXJY.MoreFoods.Food.FoodLoader.Jiaozhuangwater/*胶状水*/,2), new Object[]
    	        {
    	                "   ", " 9 ", "   ", '9', Items.WATER_BUCKET, //有序合成
    	        });
    	GameRegistry.addShapedRecipe(zsj.YOUXJY.YOUXItem.ItemLoader.bluepowder.getRegistryName(),zsj.YOUXJY.YOUXItem.ItemLoader.bluepowder.getRegistryName(),new ItemStack(zsj.YOUXJY.YOUXItem.ItemLoader.bluepowder/*蓝宝石粉末*/,7), new Object[]
    	        {
    	                "   ", " # ", "   ", '#', zsj.YOUXJY.YOUXItem.ItemLoader.bluestone, //有序合成
    	        });
    	//GameRegistry.addShapelessRecipe(null,null,new ItemStack(zsj.YOUXJY.MoreFoods.Food.FoodLoader.Jiaozhuangwater/*胶状水*/, 2/*合成后数量*/), Items.WATER_BUCKET);}//无序合成
    }

    private static void registerSmelting()//添加烧炼规则
    {
    
            GameRegistry.addSmelting(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.weilonglatiaobz/*卫龙辣条包装*/,new ItemStack(zsj.YOUXJY.LegendaryTools.Item.ItemLoader.weilonglatiao/*卫龙辣条*/), 0.5F);
            GameRegistry.addSmelting(zsj.YOUXJY.MoreFoods.Food.FoodLoader.chicken_t_sheng/*生鸡腿*/,new ItemStack(zsj.YOUXJY.MoreFoods.Food.FoodLoader.chicken_t_shu/*熟鸡腿*/), 2F);    
            GameRegistry.addSmelting(Items.COOKED_FISH/*河豚*/,new ItemStack(zsj.YOUXJY.MoreFoods.Food.FoodLoader.chicken_t_shu/*无毒河豚*/), 15F);
            GameRegistry.addSmelting(zsj.YOUXJY.BlockOre.BlockLoader.bluestoneore/*蓝宝石矿石*/, new ItemStack(zsj.YOUXJY.YOUXItem.ItemLoader.bluestone/*蓝宝石*/), 17F);
            GameRegistry.addSmelting(Blocks.STONE/*石头*/,new ItemStack(zsj.YOUXJY.YOUXItem.ItemLoader.Stone_ingot/*石锭*/,4), 1F);
        
    	
    	
    }

    private static void registerFuel()//添加燃料
    {
    	GameRegistry.registerFuelHandler(new IFuelHandler()
        {
            @Override
            public int getBurnTime(ItemStack fuel)
            {
                return zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal != fuel.getItem() ? 0 : Math.max(0, ConfigLoader.CHUNcrystalBurnTime) * 20;
            }
        });
    }
}