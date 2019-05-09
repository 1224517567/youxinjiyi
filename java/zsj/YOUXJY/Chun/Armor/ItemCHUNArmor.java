package zsj.YOUXJY.Chun.Armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import zsj.YOUXJY.creativetab.TabLoader;


public  class ItemCHUNArmor extends ItemCHUNArmorMaterial
{
	
	public static class Chestplate extends ItemCHUNArmorMaterial
	{
	    public Chestplate()
	    {
	        super(EntityEquipmentSlot.CHEST);
	        this.setUnlocalizedName("CHUNChestplate");
	        this.setCreativeTab(TabLoader.tabnewyear);
	    }
	}

	public static class Leggings extends ItemCHUNArmorMaterial
	{
	    public Leggings()
	    {
	        super(EntityEquipmentSlot.LEGS);
	        this.setUnlocalizedName("CHUNLeggings");
	        this.setCreativeTab(TabLoader.tabnewyear);
	    }
	}

	public static class Boots extends ItemCHUNArmorMaterial
	{
	    public Boots()
	    {
	        super(EntityEquipmentSlot.FEET);
	        this.setUnlocalizedName("CHUNBoots");
	        this.setCreativeTab(TabLoader.tabnewyear);
	    }
	}

    public ItemCHUNArmor()
    {
        super(EntityEquipmentSlot.HEAD);
        this.setUnlocalizedName("CHUNHelmet");
        this.setCreativeTab(TabLoader.tabnewyear);
    }
}

