package zsj.YOUXJY.client;


public class ItemRenderLoaderModer
{
    public ItemRenderLoaderModer()
    {
        zsj.YOUXJY.Chun.Item.ItemLoader.registerRenders();
        zsj.YOUXJY.LegendaryTools.Item.ItemLoader.registerRenders();
        zsj.YOUXJY.Colorful.Block.BlockLoader.registerRenders();
        zsj.YOUXJY.MoreFoods.Food.FoodLoader.registerRenders();
        zsj.YOUXJY.YOUXItem.ItemLoader.registerRenders();
        zsj.YOUXJY.BlockOre.BlockLoader.registerRenders();
        zsj.YOUXJY.LegendaryTools.Block.BlockLoader.registerRenders();
    }
}