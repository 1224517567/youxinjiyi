package zsj.YOUXJY.BlockOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import zsj.YOUXJY.creativetab.TabLoader;

public class BlueStoneOre extends Block {
	public BlueStoneOre()
    {
        super(Material.ROCK);
        this.setUnlocalizedName("BlueStoneOre");
        this.setHardness(8.5F);
        this.setHarvestLevel("pickaxe", 2);
        this.setSoundType(SoundType.STONE);
        this.setResistance(16.0F);
        this.setCreativeTab(TabLoader.tabOre);
       
    }
}
