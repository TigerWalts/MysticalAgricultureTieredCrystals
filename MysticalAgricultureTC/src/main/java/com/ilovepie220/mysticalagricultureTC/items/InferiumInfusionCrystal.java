package com.ilovepie220.mysticalagricultureTC.items;

import java.util.List;

import com.ilovepie220.mysticalagricultureTC.ConfigMain;
import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InferiumInfusionCrystal extends Item {

	protected String name;
	
	public InferiumInfusionCrystal(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setMaxDamage(ConfigMain.infusiondurabilities.inferiumDurability);
		setNoRepair();
	}
	
	public ItemStack getContainerItem(ItemStack itemstack) {
		ItemStack stack = itemstack.copy();
		if(ConfigMain.infusiondurabilities.enableInfusionDurability) {
		stack.setItemDamage(stack.getItemDamage() + 1);
		}
		return stack;
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flagIn) {
	list.add(ChatFormatting.GRAY + "Inferium -> Prudentium");
	
	if(ConfigMain.infusiondurabilities.enableInfusionDurability) {
	list.add(ChatFormatting.GRAY + "Uses Left: " + ChatFormatting.RED + "" + (this.maxDamage() - getDamage(itemstack)));
	}
	
	else if (!ConfigMain.infusiondurabilities.enableInfusionDurability) {
		list.add(ChatFormatting.GRAY + "Uses Left: " + ChatFormatting.RED + "Unlimited");
	}
}
	
	private int maxDamage() {
		return ConfigMain.infusiondurabilities.inferiumDurability;
	}
}