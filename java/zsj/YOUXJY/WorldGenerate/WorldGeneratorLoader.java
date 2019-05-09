package zsj.YOUXJY.WorldGenerate;

import net.minecraft.network.play.server.SPacketCombatEvent.Event;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import zsj.YOUXJY.WorldGenerate.WorldGen.BlockPtOreGen;
import zsj.YOUXJY.WorldGenerate.WorldGen.BlueStoneOreGen;

public class WorldGeneratorLoader
{
	
	private static WorldGenerator BlueStoneOreGen = new BlueStoneOreGen();
	private static WorldGenerator PtOreGen = new BlockPtOreGen();
    private BlockPos pos;
    
    
    public WorldGeneratorLoader()
    {
        MinecraftForge.ORE_GEN_BUS.register(this);
    }

    @SubscribeEvent
    public void onOreGenGenerateMinable(OreGenEvent.GenerateMinable event)
    {
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.ANDESITE)//阻止生成
        {
            event.setResult(Result.DENY);
        }
    }
    
    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event)
    {
        if (!event.getPos().equals(this.pos))
        {
            this.pos = event.getPos();
            BlueStoneOreGen.generate(event.getWorld(), event.getRand(), event.getPos());
            PtOreGen.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }
}