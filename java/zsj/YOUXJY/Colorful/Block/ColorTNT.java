package zsj.YOUXJY.Colorful.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import zsj.YOUXJY.creativetab.TabLoader;
import net.minecraft.world.*;

public class ColorTNT extends Block
{
	
	
    public ColorTNT()
    {
        super(Material.TNT);
        this.setUnlocalizedName("ColorTNT");
        this.setHardness(0.5F);
        this.setSoundType(SoundType.SAND);
        this.setCreativeTab(TabLoader.tabColorful);
    }
   
    @Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		worldIn.createExplosion(null, pos.getX()+0.6,pos.getY()+0.6 , pos.getZ()+0.6, 4,true);
        return true;
    }

    
    
    
    
}