package dev.zero.client.mixin;

import dev.zero.client.util.ZeroRuntime;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Dispatches ZERO modules once per vanilla client tick without a Fabric API event. */
@Mixin(targets = "net.minecraft.client.Minecraft")
public abstract class MinecraftTickMixin {
    @Inject(method = "runTick", at = @At("TAIL"), require = 0)
    private void zero$clientTick(CallbackInfo callbackInfo) {
        ZeroRuntime.tick(this);
    }
}
