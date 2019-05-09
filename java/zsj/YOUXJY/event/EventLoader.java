package zsj.YOUXJY.event;

import net.minecraft.block.BlockBreakable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.gui.StatsComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class EventLoader
{
    public EventLoader()
    {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus();
    }
    
    @SubscribeEvent
    public static void CHUNCraftedtextEvent(ItemCraftedEvent event){
    	ItemStack craftingw=event.crafting;
    	EntityPlayer player = event.player;
	if(player.isServerWorld()) {
		 if(craftingw.getItem()==zsj.YOUXJY.Chun.Item.ItemLoader.CHUNcrystal) {
			
		player.sendMessage(new TextComponentString(player.getName()+"合成了一个新春水晶") );
			 
		 }
		
		
	}
               }
    
    @SubscribeEvent
    
    public void MingKnifeEvent(LivingDeathEvent event){
    	Entity player =event.getEntity();
    	if(player instanceof EntityPlayer) {
    		EntityPlayer player2 = (EntityPlayer)player;
    	if(player2.getHeldItemMainhand()!=null&&player2.getHeldItemOffhand()!=null) {
            if(player2.getHeldItemMainhand().getItem()==zsj.YOUXJY.LegendaryTools.Item.ItemLoader.MingKnife) {
            if(player2.getHeldItemMainhand().getItemDamage()<8000) {
       	      event.setCanceled(true);
              player2.getHeldItemMainhand().setItemDamage(9999);
              player2.setHealth(5);
          	  player2.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 110, 5));
          	  player2.addPotionEffect(new PotionEffect(Potion.getPotionById(6), 20, 5));
           	 player2.sendMessage(new TextComponentString("[暗幕]："+player2.getName()+"触发了名刀效果！") );
            }
            }
            if(player2.getHeldItemOffhand().getItem()==zsj.YOUXJY.LegendaryTools.Item.ItemLoader.MingKnife) {
            	
            	if(player2.getHeldItemOffhand().getItemDamage()<8000) {
             	      event.setCanceled(true);
                    player2.getHeldItemOffhand().setItemDamage(9999);
                    player2.setHealth(5);
                	  player2.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 110, 5));
                	  player2.addPotionEffect(new PotionEffect(Potion.getPotionById(6), 20, 5));
                 	 player2.sendMessage(new TextComponentString("[暗幕]："+player2.getName()+"触发了名刀效果！") );
                  }
            }
            
    	} 			 		    	
    		}
    	
    	
    	
    	
    }
    @SubscribeEvent
    public void ShenglongSword(LivingAttackEvent event) {
    	Entity player=event.getEntityLiving();
    	if(player instanceof EntityPlayer) {
    		EntityPlayer playerzz=(EntityPlayer)player;
    		
    		if(playerzz.getHeldItemMainhand()!=null) {
    			if(playerzz.getHeldItemMainhand().getItem()==zsj.YOUXJY.LegendaryTools.Item.ItemLoader.ShenglongSword) {
    		playerzz.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 40, 1));	
    		playerzz.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 100, 2));	
    		playerzz.setHealth(playerzz.getHealth()+1f);
    		playerzz.sendMessage(new TextComponentString(playerzz.getName()+"不惜作死使用了赖升龙剑被攻击") );
  				}}}}
    @SubscribeEvent
    public void EndpickaxeEvent(BreakEvent event) {
    	if(event.getPlayer().getHeldItemMainhand()!=null) {
    	   if(event.getPlayer().getHeldItemMainhand().getItem()==zsj.YOUXJY.LegendaryTools.Item.ItemLoader.Endpickaxe) {
               if(event.getState().getBlock()==Blocks.BEDROCK) {
            	   event.getState().getBlock().setHardness(5);
                event.getPlayer().sendMessage(new TextComponentString(event.getPlayer().getName()+"使用极限返稿改变了一个基岩") );
               }
    	   }}
    	
    	
    	
    	
    }
    
    
    }