package dev.orf1.OrfAdditions.item;

import dev.orf1.OrfAdditions.OrfAdditions;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OrfAdditions.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.ORFADDITIONS)));
    public static final RegistryObject<Item> COPIUM = ITEMS.register("copium",
            () -> new Item(new Item.Properties().group(ModItemGroup.ORFADDITIONS)));
    public static final RegistryObject<Item> FAT_L = ITEMS.register("fat_l",
            () -> new Item(new Item.Properties().group(ModItemGroup.ORFADDITIONS)));
    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("stone_fire",
            () -> new ItemFireStone(new Item.Properties().group(ModItemGroup.ORFADDITIONS).maxDamage(8)));
    public static final RegistryObject<Item> VELOCITYSTONE = ITEMS.register("stone_velocity",
            () -> new ItemVelocityStone(new Item.Properties().group(ModItemGroup.ORFADDITIONS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
