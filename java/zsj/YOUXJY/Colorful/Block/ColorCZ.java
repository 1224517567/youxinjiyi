package zsj.YOUXJY.Colorful.Block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import zsj.YOUXJY.creativetab.TabLoader;

public class ColorCZ extends Block
{
	
    public ColorCZ()
    {
        super(Material.ROCK);
        this.setUnlocalizedName("ColorCZ");
        this.setHardness(45.5F);
        this.setHarvestLevel("pickaxe", 3);
        this.setSoundType(SoundType.STONE);
        this.setLightLevel(0.2F);
        this.setResistance(3000.0F);
        this.setCreativeTab(TabLoader.tabColorful);
       
    }
   
    
}
