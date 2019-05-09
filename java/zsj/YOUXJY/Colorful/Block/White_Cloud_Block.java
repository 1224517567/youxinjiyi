package zsj.YOUXJY.Colorful.Block;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zsj.YOUXJY.creativetab.TabLoader;

public class White_Cloud_Block extends BlockBreakable{
	public White_Cloud_Block()
    {
        super(Material.SPONGE, false, MapColor.SNOW);
        this.setUnlocalizedName("white_cloud_block");
        this.setHardness(0.1F);
        this.setSoundType(SoundType.SNOW);
        this.setCreativeTab(TabLoader.tabColorful);
        this.slipperiness = 1.0F;
    }
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;//半透明方块
    }
	//-----------------------------------------------------------------------------
	
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        if (entityIn.isSneaking())
        {
        	entityIn.fall(fallDistance, 0.0F);
            super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
        }
        else
        {
            entityIn.fall(fallDistance, 0.0F);
        }    }
	
	//---------------------------------------------------------------------------以上设置掉落伤害为0
	
	public void onLanded(World worldIn, Entity entityIn)
    {
        if (entityIn.isSneaking())
        {
            super.onLanded(worldIn, entityIn);
        }
        else if (entityIn.motionY < 0.0D)
        {
            entityIn.motionY = -entityIn.motionY;

            if (!(entityIn instanceof EntityLivingBase))
            {
                entityIn.motionY *= 1.2D;
            }
        }
    }
	//------------------------------------------------------------------以上为实体潜行时调用
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        if (Math.abs(entityIn.motionY) < 0.2D && !entityIn.isSneaking())
        {
            double d0 = 1.1D + Math.abs(entityIn.motionY) * 1.1D;
            entityIn.motionX *= d0;
            entityIn.motionZ *= d0;
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
	//----------------------------------------------------------以上为当实体行走时
}
