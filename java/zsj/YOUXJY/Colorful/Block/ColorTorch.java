package zsj.YOUXJY.Colorful.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import zsj.YOUXJY.creativetab.TabLoader;

public class ColorTorch extends BlockTorch
{
	
	
    public ColorTorch()
    {
        super();
        this.setUnlocalizedName("ColorTorch");
        this.setLightLevel(10F);
        this.setCreativeTab(TabLoader.tabColorful);
    }

}
