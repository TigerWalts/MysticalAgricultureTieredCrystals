package dev.electrolyte.matc;

import com.blakebr0.cucumber.helper.ColorHelper;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = MATC.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public final class MATCColorHandler {

    @SubscribeEvent
    public static void onItemColors(RegisterColorHandlersEvent.Item event) {
        event.register((stack, tint) -> {
                float stackDamage = (float) (stack.getMaxDamage() - stack.getDamageValue()) / stack.getMaxDamage();
                return ColorHelper.saturate(0x8AB800, stackDamage);
            }, ModRegistry.INFERIUM_CRYSTAL.get());

        event.register((stack, tint) -> {
                float stackDamage = (float) (stack.getMaxDamage() - stack.getDamageValue()) / stack.getMaxDamage();
                return ColorHelper.saturate(0x00AA00, stackDamage);
            }, ModRegistry.PRUDENTIUM_CRYSTAL.get());

        event.register((stack, tint) -> {
                float stackDamage = (float) (stack.getMaxDamage() - stack.getDamageValue()) / stack.getMaxDamage();
                return ColorHelper.saturate(0xE35400, stackDamage);
                }, ModRegistry.TERTIUM_CRYSTAL.get());

        event.register((stack, tint) -> {
                float stackDamage = (float) (stack.getMaxDamage() - stack.getDamageValue()) / stack.getMaxDamage();
                return ColorHelper.saturate(0x0087E8, stackDamage);
            }, ModRegistry.IMPERIUM_CRYSTAL.get());

        event.register((stack, tint) -> {
                float stackDamage = (float) (stack.getMaxDamage() - stack.getDamageValue()) / stack.getMaxDamage();
                return ColorHelper.saturate(0xDD0000, stackDamage);
            }, ModRegistry.SUPREMIUM_CRYSTAL.get());
    }
}
