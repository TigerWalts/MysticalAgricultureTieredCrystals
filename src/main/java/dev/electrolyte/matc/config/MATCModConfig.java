package dev.electrolyte.matc.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.Builder;

public class MATCModConfig {

    public static ModConfigSpec CLIENT_CONFIG;
    public static ModConfigSpec SERVER_CONFIG;

    public static ModConfigSpec.BooleanValue USES_TOOLTIP;
    public static ModConfigSpec.BooleanValue UPGRADE_TOOLTIP;

    public static ModConfigSpec.IntValue INFERIUM_DURABILITY;
    public static ModConfigSpec.BooleanValue INFERIUM_DURABILITY_ENABLED;
    public static ModConfigSpec.IntValue PRUDENTIUM_DURABILITY;
    public static ModConfigSpec.BooleanValue PRUDENTIUM_DURABILITY_ENABLED;
    public static ModConfigSpec.IntValue TERTIUM_DURABILITY;
    public static ModConfigSpec.BooleanValue TERTIUM_DURABILITY_ENABLED;
    public static ModConfigSpec.IntValue IMPERIUM_DURABILITY;
    public static ModConfigSpec.BooleanValue IMPERIUM_DURABILITY_ENABLED;
    public static ModConfigSpec.IntValue SUPREMIUM_DURABILITY;
    public static ModConfigSpec.BooleanValue SUPREMIUM_DURABILITY_ENABLED;

    static {
        Builder CLIENT_BUILDER = new Builder();

        CLIENT_BUILDER.push("tooltips");
        USES_TOOLTIP = CLIENT_BUILDER.define("usesTooltip", true);
        UPGRADE_TOOLTIP = CLIENT_BUILDER.define("upgradeTooltip", true);
        CLIENT_BUILDER.pop();

        CLIENT_CONFIG = CLIENT_BUILDER.build();


        Builder SERVER_BUILDER = new Builder();

        SERVER_BUILDER.push("durability");
        INFERIUM_DURABILITY = SERVER_BUILDER
                .defineInRange("inferiumDurability", 256, 1, Integer.MAX_VALUE);
        PRUDENTIUM_DURABILITY = SERVER_BUILDER
                .defineInRange("prudentiumDurability", 512, 1, Integer.MAX_VALUE);
        TERTIUM_DURABILITY = SERVER_BUILDER
                .defineInRange("tertiumDurability", 1024, 1, Integer.MAX_VALUE);
        IMPERIUM_DURABILITY = SERVER_BUILDER
                .defineInRange("imperiumDurability", 2048, 1, Integer.MAX_VALUE);
        SUPREMIUM_DURABILITY = SERVER_BUILDER
                .defineInRange("supremiumDurability", 4096, 1, Integer.MAX_VALUE);
        SERVER_BUILDER.pop();

        SERVER_BUILDER.push("durabilityEnabled");
        INFERIUM_DURABILITY_ENABLED = SERVER_BUILDER.define("inferiumDurabilityEnabled", true);
        PRUDENTIUM_DURABILITY_ENABLED = SERVER_BUILDER.define("prudentiumDurabilityEnabled", true);
        TERTIUM_DURABILITY_ENABLED = SERVER_BUILDER.define("tertiumDurabilityEnabled", true);
        IMPERIUM_DURABILITY_ENABLED = SERVER_BUILDER.define("imperiumDurabilityEnabled", true);
        SUPREMIUM_DURABILITY_ENABLED = SERVER_BUILDER.define("supremiumDurabilityEnabled", true);
        SERVER_BUILDER.pop();

        SERVER_CONFIG = SERVER_BUILDER.build();
    }
}
