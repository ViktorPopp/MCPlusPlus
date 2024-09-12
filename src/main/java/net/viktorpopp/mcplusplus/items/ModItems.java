package net.viktorpopp.mcplusplus.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.viktorpopp.mcplusplus.MCPlusPlus;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCPlusPlus.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static void reqister(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
