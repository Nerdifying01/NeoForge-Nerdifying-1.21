package net.Teenyez.NerdifyPack.item;

import net.Teenyez.NerdifyPack.NerdifyPack;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NerdifyPack.MODID);

    public static final DeferredItem<Item> FEATHER = ITEMS.register("flamingo feathers",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
