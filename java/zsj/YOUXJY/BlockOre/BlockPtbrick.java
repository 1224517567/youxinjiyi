package zsj.YOUXJY.BlockOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import zsj.YOUXJY.creativetab.TabLoader;

public class BlockPtbrick extends Block {

	public BlockPtbrick() {
		super(Material.ROCK);
		this.setUnlocalizedName("ptbrick");
        this.setHardness(24.5F);
        this.setHarvestLevel("pickaxe", 3);
        this.setSoundType(SoundType.STONE);
        this.setResistance(32.0F);
        this.setCreativeTab(TabLoader.tabOre);
        this.setLightLevel(0.6f);
		
	}

}
