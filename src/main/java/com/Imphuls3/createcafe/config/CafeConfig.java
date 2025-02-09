package com.Imphuls3.createcafe.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

import java.util.List;

public class CafeConfig {
    public static ConfigValue<List<String>> hidingOverrides;
    public static BooleanValue giveEmptyCups;
    public static IntValue effectDuration;

    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.push("config");
        giveEmptyCups = COMMON_BUILDER
                .comment("Should drinks give empty cups after drinking them [Default: true]")
                .define("giveEmptyCups", true);
        COMMON_BUILDER.pop();
    }
    public static void registerServerConfig(ForgeConfigSpec.Builder SERVER_BUILDER) {
        SERVER_BUILDER.push("Server Config");
        effectDuration = SERVER_BUILDER.comment("The duration of the effect that drinks give [Default: 10]")
                .defineInRange("effectDuration", 10, 0, Integer.MAX_VALUE);
        SERVER_BUILDER.pop();
    }
}
