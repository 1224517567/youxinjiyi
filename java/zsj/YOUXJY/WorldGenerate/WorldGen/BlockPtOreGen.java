package zsj.YOUXJY.WorldGenerate.WorldGen;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BlockPtOreGen extends WorldGenerator
{
	private final WorldGenerator PtOreGen = new WorldGenMinable(zsj.YOUXJY.BlockOre.BlockLoader.ptore.getDefaultState(), 3);

    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {
       if (TerrainGen.generateOre(world, rand, this, pos, OreGenEvent.GenerateMinable.EventType.CUSTOM))
        {
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 2 + rand.nextInt(8);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                Biome biomeGenBase = world.getBiomeForCoordsBody(blockpos);
                if (biomeGenBase.getRainfall() < rand.nextInt(65536))
                {
                	PtOreGen.generate(world, rand, blockpos);
                }
            }
        }
        return true;
    }
}