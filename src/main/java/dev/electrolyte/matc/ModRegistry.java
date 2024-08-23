package dev.electrolyte.matc;

import dev.electrolyte.matc.config.MATCModConfig;
import dev.electrolyte.matc.items.BaseTieredCrystalItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MATC.MOD_ID);

    public static final TagKey<Item> INFERIUM_CRYSTALS = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "infusion_crystals/inferium"));
    public static final TagKey<Item> PRUDENTIUM_CRYSTALS = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "infusion_crystals/prudentium"));
    public static final TagKey<Item> TERTIUM_CRYSTALS = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "infusion_crystals/tertium"));
    public static final TagKey<Item> IMPERIUM_CRYSTALS = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "infusion_crystals/imperium"));
    public static final TagKey<Item> SUPREMIUM_CRYSTALS = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "infusion_crystals/supremium"));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final Supplier<BaseTieredCrystalItem> INFERIUM_CRYSTAL = ITEMS.register("inferium_crystal",
            () -> new BaseTieredCrystalItem(MATCModConfig.INFERIUM_DURABILITY, "Inferium -> Prudentium", MATCModConfig.INFERIUM_DURABILITY_ENABLED, p -> p));
    public static final Supplier<BaseTieredCrystalItem> PRUDENTIUM_CRYSTAL = ITEMS.register("prudentium_crystal",
            () -> new BaseTieredCrystalItem(MATCModConfig.PRUDENTIUM_DURABILITY, "Prudentium -> Tertium", MATCModConfig.PRUDENTIUM_DURABILITY_ENABLED, p -> p));
    public static final Supplier<BaseTieredCrystalItem> TERTIUM_CRYSTAL = ITEMS.register("tertium_crystal",
            () -> new BaseTieredCrystalItem(MATCModConfig.TERTIUM_DURABILITY, "Tertium -> Imperium", MATCModConfig.TERTIUM_DURABILITY_ENABLED, p -> p));
    public static final Supplier<BaseTieredCrystalItem> IMPERIUM_CRYSTAL = ITEMS.register("imperium_crystal",
            () -> new BaseTieredCrystalItem(MATCModConfig.IMPERIUM_DURABILITY, "Imperium -> Supremium", MATCModConfig.IMPERIUM_DURABILITY_ENABLED, p -> p));
    public static final Supplier<BaseTieredCrystalItem> SUPREMIUM_CRYSTAL = ITEMS.register("supremium_crystal",
            () -> new BaseTieredCrystalItem(MATCModConfig.SUPREMIUM_DURABILITY, "Supremium -> Insanium", MATCModConfig.SUPREMIUM_DURABILITY_ENABLED, p -> p));
}