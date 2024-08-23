package dev.electrolyte.matc.data;

import dev.electrolyte.matc.MATC;
import dev.electrolyte.matc.data.MATCItemTagsProvider.MATCBlockTagsProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MATC.MOD_ID, bus = Bus.MOD)
public class MATCDatagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        MATCBlockTagsProvider blockTags = new MATCBlockTagsProvider(event.getGenerator().getPackOutput(), event.getLookupProvider(), event.getExistingFileHelper());
        event.getGenerator().addProvider(event.includeServer(), blockTags);
        event.getGenerator().addProvider(event.includeServer(), new MATCItemTagsProvider(event.getGenerator().getPackOutput(), event.getLookupProvider(), blockTags.contentsGetter()));
        event.getGenerator().addProvider(event.includeServer(), new MATCRecipeProvider(event.getGenerator().getPackOutput(), event.getLookupProvider()));

        event.getGenerator().addProvider(event.includeClient(), new MATCLangProvider(event.getGenerator().getPackOutput()));
        event.getGenerator().addProvider(event.includeClient(), new MATCItemModelProvider(event.getGenerator().getPackOutput(), event.getExistingFileHelper()));
    }
}
