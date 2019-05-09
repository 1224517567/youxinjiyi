package zsj.YOUXJY.BlockOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import zsj.YOUXJY.creativetab.TabLoader;

public class BlockPtOre extends Block {
	public BlockPtOre()
    {
        super(Material.ROCK);
        this.setUnlocalizedName("ptore");
        this.setHardness(16.5F);
        this.setHarvestLevel("pickaxe", 3);
        this.setSoundType(SoundType.STONE);
        this.setResistance(18.0F);//180000  
        this.setCreativeTab(TabLoader.tabOre);
        this.setLightLevel(0.2f);
       
    }
}
