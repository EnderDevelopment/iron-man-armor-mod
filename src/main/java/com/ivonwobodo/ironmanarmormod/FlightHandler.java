package com.ivonwobodo.ironmanarmormod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public
class FlightHandler implements ClientTickEvents.EndTick {
    @Override
    public void onEndTick(MinecraftClient client) {
        PlayerEntity player = client.player;
        if (player != null && player.getEquippedStack(EquipmentSlot.CHEST).getItem() == Main.IRON_MAN_ARMOR) {
            player.getAbilities().allowFlying = true;
        } else {
            player.getAbilities().allowFlying = false;
            player.getAbilities().flying = false;
        }
        player.sendAbilitiesUpdate();
    }
}
