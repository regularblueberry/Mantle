package com.blueberry.Mantle

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import org.slf4j.LoggerFactory
import com.mojang.authlib.minecraft.client.MinecraftClient


const val MOD_ID = "bb-mantle"


class MantleClient : ClientModInitializer {

    companion object {
        private val LOGGER = LoggerFactory.getLogger("${MOD_ID}_CLIENT") // Distinguish client logs
    }

    override fun onInitializeClient() {
	
    }
}
