package com.electrolyte.matc.items;

import com.blakebr0.cucumber.item.BaseReusableItem;
import com.electrolyte.matc.config.MATCModConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;

import java.util.List;
import java.util.function.Function;

public class SupremiumCrystal extends BaseReusableItem {

    public SupremiumCrystal(Function<Properties, Properties> properties) {
        super(MATCModConfig.SUPREMIUM_DURABILITY.getDefault(), properties);
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return MATCModConfig.SUPREMIUM_DURABILITY.get();
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return false;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return MATCModConfig.SUPREMIUM_DURABILITY_ENABLED.get() ? super.getCraftingRemainingItem(stack) : stack.copy();
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> list, TooltipFlag flagIn) {
        if(MATCModConfig.UPGRADE_TOOLTIP.get() && ModList.get().isLoaded("mysticalagradditions")) {
            list.add(Component.translatable(ChatFormatting.GRAY + "Supremium -> Insanium"));
        }

        if(MATCModConfig.USES_TOOLTIP.get()) {
            Component tooltip = (MATCModConfig.SUPREMIUM_DURABILITY_ENABLED.get()) ?
                    Component.translatable(ChatFormatting.GRAY + "Uses Left: " + ChatFormatting.RED + (stack.getMaxDamage() - getDamage(stack))) :
                    Component.translatable(ChatFormatting.GRAY + "Uses Left: " + ChatFormatting.RED + "Unlimited");
            list.add(tooltip);
        }
    }
}
