package dev.electrolyte.matc.items;

import com.blakebr0.cucumber.item.BaseReusableItem;
import dev.electrolyte.matc.config.MATCModConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantments;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.common.ModConfigSpec.BooleanValue;
import net.neoforged.neoforge.common.ModConfigSpec.IntValue;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.function.Function;

public class BaseTieredCrystalItem extends BaseReusableItem {

    private IntValue uses;
    private final String tier;
    private BooleanValue durabilityEnabled;

    public BaseTieredCrystalItem(IntValue uses, String tier, BooleanValue durabilityEnabled, Function<Properties, Properties> properties) {
        super(uses.getDefault(), properties);
        this.uses = uses;
        this.tier = tier;
        this.durabilityEnabled = durabilityEnabled;
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return uses.get();
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return false;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack copy = stack.copy();
        if(! durabilityEnabled.get()) {
            return copy;
        }
        int unbreakingLevel = stack.getEnchantmentLevel(DeferredHolder.create(Enchantments.UNBREAKING));
        if(Math.random() * 100 < (100.0 / ((double) unbreakingLevel + 1))) {
            copy.setDamageValue(stack.getDamageValue() + 1);
        }
        return copy.getDamageValue() >= copy.getMaxDamage() ? ItemStack.EMPTY : copy;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> list, TooltipFlag flag) {
        if(MATCModConfig.UPGRADE_TOOLTIP.get()) {
            Component tierTooltip = Component.translatable(ChatFormatting.GRAY + tier);
            list.add(tierTooltip);
            if(tier.contains("Insanium") && !ModList.get().isLoaded("mysticalagradditions")) {
                list.remove(tierTooltip);
            }
        }

        if(MATCModConfig.USES_TOOLTIP.get()) {
            String damage = durabilityEnabled.get() ?
                    String.valueOf(stack.getMaxDamage() - getDamage(stack)) :
                    "Unlimited";
            list.add(Component.translatable(ChatFormatting.GRAY + "Uses Left: " + ChatFormatting.RED + damage));
        }
    }
}
