package dev.zero.client;

import dev.zero.client.module.ModuleManager;
import dev.zero.client.util.ZeroRuntime;
import net.fabricmc.api.ClientModInitializer;

/** Entry point for ZERO Client on Legacy Fabric 1.8.9. */
public final class ZeroClient implements ClientModInitializer {
    public static final String MOD_ID = "zero_client";

    @Override
    public void onInitializeClient() {
        ModuleManager.initialize();
        System.out.println("[ZERO] ZERO Client loaded for Minecraft 1.8.9");
    }
}
