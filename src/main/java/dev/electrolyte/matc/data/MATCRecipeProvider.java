package dev.electrolyte.matc.data;

import com.blakebr0.mysticalagriculture.init.ModItems;
import dev.electrolyte.matc.MATC;
import dev.electrolyte.matc.ModRegistry;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.conditions.NotCondition;

import java.util.concurrent.CompletableFuture;

public class MATCRecipeProvider extends RecipeProvider {
    public MATCRecipeProvider(PackOutput packOutput, CompletableFuture<Provider> provider) {
        super(packOutput, provider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModRegistry.INFERIUM_CRYSTAL.get())
                .pattern("PEP")
                .pattern("EGE")
                .pattern("PEP")
                .define('E', ModItems.PROSPERITY_SHARD.get())
                .define('P', ModItems.INFERIUM_ESSENCE.get())
                .define('G', ModItems.INFERIUM_GEMSTONE.get())
                .unlockedBy(getHasName(ModItems.INFERIUM_ESSENCE.get()), has(ModItems.INFERIUM_ESSENCE.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModRegistry.PRUDENTIUM_CRYSTAL.get())
                .pattern("PEP")
                .pattern("EGE")
                .pattern("PEP")
                .define('E', ModItems.PROSPERITY_SHARD.get())
                .define('P', ModItems.PRUDENTIUM_ESSENCE.get())
                .define('G', ModRegistry.INFERIUM_CRYSTAL.get())
                .unlockedBy(getHasName(ModItems.PRUDENTIUM_ESSENCE.get()), has(ModItems.PRUDENTIUM_ESSENCE.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModRegistry.TERTIUM_CRYSTAL.get())
                .pattern("PEP")
                .pattern("EGE")
                .pattern("PEP")
                .define('E', ModItems.PROSPERITY_SHARD.get())
                .define('P', ModItems.TERTIUM_ESSENCE.get())
                .define('G', ModRegistry.PRUDENTIUM_CRYSTAL.get())
                .unlockedBy(getHasName(ModItems.TERTIUM_ESSENCE.get()), has(ModItems.TERTIUM_ESSENCE.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModRegistry.IMPERIUM_CRYSTAL.get())
                .pattern("PEP")
                .pattern("EGE")
                .pattern("PEP")
                .define('E', ModItems.PROSPERITY_SHARD.get())
                .define('P', ModItems.IMPERIUM_ESSENCE.get())
                .define('G', ModRegistry.TERTIUM_CRYSTAL.get())
                .unlockedBy(getHasName(ModItems.IMPERIUM_ESSENCE.get()), has(ModItems.IMPERIUM_ESSENCE.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModRegistry.SUPREMIUM_CRYSTAL.get())
                .pattern("PEP")
                .pattern("EGE")
                .pattern("PEP")
                .define('E', ModItems.PROSPERITY_SHARD.get())
                .define('P', ModItems.SUPREMIUM_ESSENCE.get())
                .define('G', ModRegistry.IMPERIUM_CRYSTAL.get())
                .unlockedBy(getHasName(ModItems.SUPREMIUM_ESSENCE.get()), has(ModItems.SUPREMIUM_ESSENCE.get()))
                .save(output);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PRUDENTIUM_ESSENCE.get())
                .pattern(" E ")
                .pattern("EPE")
                .pattern(" E ")
                .define('P', ModRegistry.INFERIUM_CRYSTALS)
                .define('E', ModItems.INFERIUM_ESSENCE.get())
                .unlockedBy(getHasName(ModRegistry.INFERIUM_CRYSTAL.get()), has(ModRegistry.INFERIUM_CRYSTAL.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "prudentium_essence"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TERTIUM_ESSENCE.get())
                .pattern(" E ")
                .pattern("EPE")
                .pattern(" E ")
                .define('P', ModRegistry.PRUDENTIUM_CRYSTALS)
                .define('E', ModItems.PRUDENTIUM_ESSENCE.get())
                .unlockedBy(getHasName(ModRegistry.PRUDENTIUM_CRYSTAL.get()), has(ModRegistry.PRUDENTIUM_CRYSTAL.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "tertium_essence"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IMPERIUM_ESSENCE.get())
                .pattern(" E ")
                .pattern("EPE")
                .pattern(" E ")
                .define('P', ModRegistry.TERTIUM_CRYSTALS)
                .define('E', ModItems.TERTIUM_ESSENCE.get())
                .unlockedBy(getHasName(ModRegistry.TERTIUM_CRYSTAL.get()), has(ModRegistry.TERTIUM_CRYSTAL.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "imperium_essence"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUPREMIUM_ESSENCE.get())
                .pattern(" E ")
                .pattern("EPE")
                .pattern(" E ")
                .define('P', ModRegistry.IMPERIUM_CRYSTALS)
                .define('E', ModItems.IMPERIUM_ESSENCE.get())
                .unlockedBy(getHasName(ModRegistry.IMPERIUM_CRYSTAL.get()), has(ModRegistry.IMPERIUM_CRYSTAL.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "supremium_essence"));


        ModLoadedCondition modLoaded = new ModLoadedCondition("mysticalagradditions");
        Item insaniumEssence = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mysticalagradditions", "insanium_essence"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MASTER_INFUSION_CRYSTAL.get())
                .pattern("PEP")
                .pattern("EGE")
                .pattern("PEP")
                .define('E', ModItems.PROSPERITY_SHARD.get())
                .define('P', ModItems.SUPREMIUM_ESSENCE.get())
                .define('G', ModRegistry.SUPREMIUM_CRYSTAL.get())
                .unlockedBy(getHasName(ModItems.SUPREMIUM_ESSENCE.get()), has(ModItems.SUPREMIUM_ESSENCE.get()))
                .save(output.withConditions(new NotCondition(modLoaded)), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "master_infusion_crystal_superium"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MASTER_INFUSION_CRYSTAL.get())
                .pattern("PEP")
                .pattern("EGE")
                .pattern("PEP")
                .define('E', ModItems.PROSPERITY_SHARD.get())
                .define('P', insaniumEssence)
                .define('G', ModRegistry.SUPREMIUM_CRYSTAL.get())
                .unlockedBy(getHasName(ModItems.SUPREMIUM_ESSENCE.get()), has(ModItems.SUPREMIUM_ESSENCE.get()))
                .save(output.withConditions(modLoaded), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "master_infusion_crystal"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, insaniumEssence)
                .pattern(" E ")
                .pattern("EPE")
                .pattern(" E ")
                .define('P', ModRegistry.SUPREMIUM_CRYSTALS)
                .define('E', ModItems.SUPREMIUM_ESSENCE.get())
                .unlockedBy(getHasName(ModRegistry.SUPREMIUM_CRYSTAL.get()), has(ModRegistry.SUPREMIUM_CRYSTAL.get()))
                .save(output.withConditions(modLoaded), ResourceLocation.fromNamespaceAndPath(MATC.MOD_ID, "insanium_essence"));
    }
}
