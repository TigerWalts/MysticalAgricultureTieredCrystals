package dev.electrolyte.matc.data;

import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import dev.electrolyte.matc.MATC;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

class MATCItemModelProvider extends ItemModelProvider {
    public MATCItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MATC.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.withExistingParent("inferium_crystal", ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "item/infusion_crystal"));
        this.withExistingParent("prudentium_crystal", ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "item/infusion_crystal"));
        this.withExistingParent("tertium_crystal", ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "item/infusion_crystal"));
        this.withExistingParent("imperium_crystal", ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "item/infusion_crystal"));
        this.withExistingParent("supremium_crystal", ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "item/infusion_crystal"));
    }
}
