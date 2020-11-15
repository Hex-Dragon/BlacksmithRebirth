package com.hexdragon.enchrebirth.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

// 腐朽诅咒：拥有这个附魔的工具在 修补、合并、从经验修补获得耐久度 时增加的耐久度下降，每级 30%（一级下降 30%，二级下降 60%，三级下降 90%）
// TODO : 让腐朽诅咒对物品合并的合成配方、经验修补附魔生效
public class DecayCurseEnchantment extends Enchantment {
    public DecayCurseEnchantment() {super(Rarity.VERY_RARE, EnchantmentType.BREAKABLE, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});}

    public int getMinEnchantability(int enchantmentLevel) {return 20;}
    public int getMaxEnchantability(int enchantmentLevel) {return 50;}
    public int getMaxLevel() {return 3;}
    public boolean isTreasureEnchantment() {return true;}
    public boolean isCurse() {return true;}

}