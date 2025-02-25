package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.foods.*;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateCafe.ID);

    public static Item.Properties HIDDEN_PROPERTIES() {
        return new Item.Properties().stacksTo(1);
    }

    //Food Items

    public static final RegistryObject<Item> OREO = ITEMS.register("oreo",
            () -> new Item(makeItem().food(ModFoods.OREO)));

    public static final RegistryObject<Item> OREO_INCOMPLETE = ITEMS.register("oreo_incomplete",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> OREO_HALF_RAW = ITEMS.register("oreo_half_raw",
            () -> new Item(makeItem().food(ModFoods.OREO_HALF_RAW)));

    public static final RegistryObject<Item> OREO_HALF = ITEMS.register("oreo_half",
            () -> new Item(makeItem().food(ModFoods.OREO_HALF)));

    public static final RegistryObject<Item> OREO_DOUGH = ITEMS.register("oreo_dough",
            () -> new Item(makeItem()));

    public static final RegistryObject<Item> CRUSHED_OREO = ITEMS.register("oreo_crushed",
            () -> new Item(makeItem().food(ModFoods.CRUSHED_OREO)));

    public static final RegistryObject<Item> MANA_BERRIES = ITEMS.register("mana_berries",
            () -> new Item(new Item.Properties().food(ModFoods.MANA_BERRIES)));
    public static final RegistryObject<Item> BLOOD_ORANGE = ITEMS.register("blood_orange",
            () -> new Item(new Item.Properties().food(ModFoods.BLOOD_ORANGE)));

    //Drink Items
    public static final RegistryObject<CafeDrink> MANGO_TEA = ITEMS.register("mango_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> LIME_TEA = ITEMS.register("lime_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> STRAWBERRY_TEA = ITEMS.register("strawberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> PEACH_TEA = ITEMS.register("peach_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> PLUM_TEA = ITEMS.register("plum_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> JACKFRUIT_TEA = ITEMS.register("jackfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> APRICOT_TEA = ITEMS.register("apricot_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> DURIAN_TEA = ITEMS.register("durian_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> FIG_TEA = ITEMS.register("fig_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> GRAPE_TEA = ITEMS.register("grape_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> GRAPEFRUIT_TEA = ITEMS.register("grapefruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> STARFRUIT_TEA = ITEMS.register("starfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final RegistryObject<CafeDrink> MANDARIN_TEA = ITEMS.register("mandarin_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));

    public static final RegistryObject<CafeDrink> BLOOD_TEA = ITEMS.register("blood_orange_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final RegistryObject<CafeDrink> LYCHEE_TEA = ITEMS.register("lychee_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final RegistryObject<CafeDrink> BLUEBERRY_TEA = ITEMS.register("blueberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final RegistryObject<CafeDrink> PINEAPPLE_TEA = ITEMS.register("pineapple_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final RegistryObject<CafeDrink> APPLE_TEA = ITEMS.register("apple_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final RegistryObject<CafeDrink> PUMPKIN_TEA = ITEMS.register("pumpkin_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final RegistryObject<CafeDrink> AVOCADO_TEA = ITEMS.register("avocado_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final RegistryObject<CafeDrink> SWEETBERRY_TEA = ITEMS.register("sweetberry_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final RegistryObject<CafeDrink> TAMARIND_TEA = ITEMS.register("tamarind_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final RegistryObject<CafeDrink> PAPAYA_TEA = ITEMS.register("papaya_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final RegistryObject<CafeDrink> REDLOVE_TEA = ITEMS.register("redlove_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));

    public static final RegistryObject<CafeDrink> MANA_TEA = ITEMS.register("mana_berry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> KIWI_TEA = ITEMS.register("kiwi_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> ORANGE_TEA = ITEMS.register("orange_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> YUCCA_TEA = ITEMS.register("yucca_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.STRENGTH_DRINK), "strength"));
    public static final RegistryObject<CafeDrink> ALOE_TEA = ITEMS.register("aloe_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> COCONUT_TEA = ITEMS.register("coconut_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> PERSIMMON_TEA = ITEMS.register("persimmon_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> POMEGRANATE_TEA = ITEMS.register("pomegranate_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> RASPBERRY_TEA = ITEMS.register("raspberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final RegistryObject<CafeDrink> POMELO_TEA = ITEMS.register("pomelo_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));

    public static final RegistryObject<CafeDrink> LEMON_TEA = ITEMS.register("lemon_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> WATERMELON_TEA = ITEMS.register("watermelon_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.RES_DRINK), "res"));
    public static final RegistryObject<CafeDrink> VANILLA_TEA = ITEMS.register("vanilla_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> BANANA_TEA = ITEMS.register("banana_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> CHERRY_TEA = ITEMS.register("cherry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> BLACKBERRY_TEA = ITEMS.register("blackberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> DRAGONFRUIT_TEA = ITEMS.register("dragonfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> GOOSEBERRY_TEA = ITEMS.register("gooseberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> GUAVA_TEA = ITEMS.register("guava_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> PASSIONFRUIT_TEA = ITEMS.register("passionfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> LAVENDER_TEA = ITEMS.register("lavender_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final RegistryObject<CafeDrink> CITRON_TEA = ITEMS.register("citron_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));

    public static final RegistryObject<CafeDrink> BARBERRY_TEA = ITEMS.register("barberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.FIRE_RES)), "fire_res"));

    public static final RegistryObject<CafeDrink> OREO_TEA = ITEMS.register("oreo_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.SUPER_DRINK), "super"));

    public static final RegistryObject<IcedCoffeeDrink> ICED_COFFEE = ITEMS.register("iced_coffee",
            () -> new IcedCoffeeDrink(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none"));
    public static final RegistryObject<IcedCoffeeDrinkMilk> ICED_COFFEE_MILK = ITEMS.register("iced_coffee_milk",
            () -> new IcedCoffeeDrinkMilk(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none"));
    public static final RegistryObject<IcedCoffeeDrinkFlavor> STRAWBERRY_ICED_COFFEE = ITEMS.register("strawberry_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.REGENERATION)), "regen"));
    public static final RegistryObject<IcedCoffeeDrinkFlavor> VANILLA_ICED_COFFEE = ITEMS.register("vanilla_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.ABSORPTION)), "absorption"));
    public static final RegistryObject<IcedCoffeeDrinkFlavor> RASPBERRY_ICED_COFFEE = ITEMS.register("raspberry_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.DAMAGE_BOOST)), "strength"));
    public static final RegistryObject<IcedCoffeeDrinkFlavor> MINT_ICED_COFFEE = ITEMS.register("mint_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.FIRE_RESISTANCE)), "fire_res"));
    public static final RegistryObject<IcedCoffeeDrinkFlavor> CARAMEL_ICED_COFFEE = ITEMS.register("caramel_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation"));
    public static final RegistryObject<IcedCoffeeDrinkFlavor> COCONUT_ICED_COFFEE = ITEMS.register("coconut_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.WATER_BREATHING)), "water_breathing"));
    public static final RegistryObject<IcedCoffeeDrinkFlavor> BANANA_ICED_COFFEE = ITEMS.register("banana_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation"));

    //Non Food Items
    public static final RegistryObject<Item> BOBA_CUP = ITEMS.register("boba_cup",
            () -> new Item(makeItem()));

    public static final RegistryObject<Item> EMPTY_BOBA_CUP = ITEMS.register("empty_boba_cup",
            () -> new Item(makeItem()));

    public static final RegistryObject<Item> ICED_COFFEE_CUP = ITEMS.register("iced_coffee_cup",
            () -> new Item(makeItem()));

    public static final RegistryObject<Item> ICED_COFFEE_CUP_ICE = ITEMS.register("iced_coffee_cup_ice",
            () -> new Item(makeItem()));

    //Boba
    public static final RegistryObject<Item> BOBA = ITEMS.register("boba",
            () -> new Item(makeItem().food(ModFoods.BOBA)));

    public static final RegistryObject<Item> RAW_BOBA = ITEMS.register("raw_boba",
            () -> new Item(makeItem().food(ModFoods.RAW_BOBA)));

    public static final RegistryObject<Item> TAPIOCA_FLOUR = ITEMS.register("tapioca_flour",
            () -> new Item(makeItem()));

    //Crop Items
    public static final RegistryObject<Item> COFFEE_FRUIT = ITEMS.register("coffee_fruit",
            () -> new Item(makeItem().food(ModFoods.COFFEE_FRUIT)));

    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            () -> new ItemNameBlockItem(BlockRegistry.COFFEE.get(),
                    makeItem().food(ModFoods.COFFEE)));

    public static final RegistryObject<Item> ROASTED_COFFEE = ITEMS.register("roasted_coffee_beans",
            () -> new Item(makeItem().food(ModFoods.ROASTED_COFFEE)));

    public static final RegistryObject<Item> COFFEE_GROUNDS = ITEMS.register("coffee_grounds",
            () -> new Item(makeItem().food(ModFoods.ROASTED_COFFEE)));

    public static final RegistryObject<Item> CASSAVA_SEEDS = ITEMS.register("cassava_seeds",
            () -> new ItemNameBlockItem(BlockRegistry.CASSAVA.get(), makeItem()));

    public static final RegistryObject<Item> CASSAVA_ROOT = ITEMS.register("cassava_root",
            () -> new Item(makeItem().food(ModFoods.CASSAVA_ROOT)));

    public static Item.Properties makeItem() {
        return new Item.Properties();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
