package squar.beta.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import squar.beta.ZiggtownUtils;

public class ModItems {

    public static final Item EURO_COIN = registerItem("euro_coin", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ZiggtownUtils.MOD_ID,"euro_coin")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ZiggtownUtils.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ZiggtownUtils.LOGGER.info("All Good, Registering mod items" + ZiggtownUtils.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(EURO_COIN);
        });

    }

}
