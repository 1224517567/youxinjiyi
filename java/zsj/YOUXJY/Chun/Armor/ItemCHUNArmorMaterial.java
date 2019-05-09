package zsj.YOUXJY.Chun.Armor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import zsj.YOUXJY.MainYOUXJY;

public class ItemCHUNArmorMaterial extends ItemArmor
{
    public static final ItemArmor.ArmorMaterial CHUN_ARMOR = EnumHelper.addArmorMaterial("CHUN",
            MainYOUXJY.MODID + ":" + "CHUN", 45, new int[]
            { 4, 6, 8, 4 }, 30,SoundEvents.BLOCK_ANVIL_BREAK,3f);

    public ItemCHUNArmorMaterial(EntityEquipmentSlot armorType)
    {
        super(CHUN_ARMOR, CHUN_ARMOR.ordinal(), armorType);
    }
}
