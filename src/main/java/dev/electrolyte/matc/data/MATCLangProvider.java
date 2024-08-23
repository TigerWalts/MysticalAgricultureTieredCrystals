package dev.electrolyte.matc.data;

import dev.electrolyte.matc.MATC;
import dev.electrolyte.matc.ModRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class MATCLangProvider extends LanguageProvider {
    public MATCLangProvider(PackOutput output) {
        super(output, MATC.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addItem(ModRegistry.INFERIUM_CRYSTAL, "§eInferium Crystal");
        this.addItem(ModRegistry.PRUDENTIUM_CRYSTAL, "§2Prudentium Crystal");
        this.addItem(ModRegistry.TERTIUM_CRYSTAL, "§6Tertium Crystal");
        this.addItem(ModRegistry.IMPERIUM_CRYSTAL, "§9Imperium Crystal");
        this.addItem(ModRegistry.SUPREMIUM_CRYSTAL, "§cSupremium Crystal");
        this.add("itemGroup.matc", "Mystical Agriculture Tiered Crystals");
        this.add("matc.configuration.title", "MATC Configuration");
        this.add("matc.configuration.section.matc.client.toml", "MATC Client Configuration");
        this.add("matc.configuration.section.matc.server.toml", "MATC Server Configuration");
        this.add("matc.configuration.section.matc.client.toml.title", "MATC Client Configuration");
        this.add("matc.configuration.section.matc.server.toml.title", "MATC Server Configuration");
        this.add("matc.configuration.tooltips", "Tooltip Settings");
        this.add("matc.configuration.usesTooltip", "Enable Uses Left Tooltip");
        this.add("matc.configuration.usesTooltip.tooltip", "Should crystals display 'Uses Left' on their tooltips?");
        this.add("matc.configuration.upgradeTooltip", "Enable Upgrade Tooltip");
        this.add("matc.configuration.upgradeTooltip.tooltip", "Should crystals display 'tier -> tier' on their tooltips?");
        this.add("matc.configuration.durability", "Durability");
        this.add("matc.configuration.durability.tooltip", "Number of uses for each infusion crystal");
        this.add("matc.configuration.inferiumDurability", "Inferium Durability");
        this.add("matc.configuration.inferiumDurability.tooltip", "Durability for the Inferium Crystal");
        this.add("matc.configuration.prudentiumDurability", "Prudentium Durability");
        this.add("matc.configuration.prudentiumDurability.tooltip", "Durability for the Prudentium Crystal");
        this.add("matc.configuration.tertiumDurability", "Tertium Durability");
        this.add("matc.configuration.tertiumDurability.tooltip", "Durability for the Tertium Crystal");
        this.add("matc.configuration.imperiumDurability", "Imperium Durability");
        this.add("matc.configuration.imperiumDurability.tooltip", "Durability for the Imperium Crystal");
        this.add("matc.configuration.supremiumDurability", "Supremium Durability");
        this.add("matc.configuration.supremiumDurability.tooltip", "Durability for the Supremium Crystal");
        this.add("matc.configuration.durabilityEnabled", "Enable / Disable Durability");
        this.add("matc.configuration.durabilityEnabled.tooltip", "Whether or not crystals should lose durability");
        this.add("matc.configuration.inferiumDurabilityEnabled", "Enable Inferium Durability");
        this.add("matc.configuration.inferiumDurabilityEnabled.tooltip", "Should the Inferium Crystal Have Durability?");
        this.add("matc.configuration.prudentiumDurabilityEnabled", "Enable Prudentium Durability");
        this.add("matc.configuration.prudentiumDurabilityEnabled.tooltip", "Should the Prudentium Crystal Have Durability?");
        this.add("matc.configuration.tertiumDurabilityEnabled", "Enable Tertium Durability");
        this.add("matc.configuration.tertiumDurabilityEnabled.tooltip", "Should the Tertium Crystal Have Durability?");
        this.add("matc.configuration.imperiumDurabilityEnabled", "Enable Imperium Durability");
        this.add("matc.configuration.imperiumDurabilityEnabled.tooltip", "Should the Imperium Crystal Have Durability?");
        this.add("matc.configuration.supremiumDurabilityEnabled", "Enable Supremium Durability");
        this.add("matc.configuration.supremiumDurabilityEnabled.tooltip", "Should the Supremium Crystal Have Durability?");
    }
}
