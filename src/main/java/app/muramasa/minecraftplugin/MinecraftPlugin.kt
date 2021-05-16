package app.muramasa.minecraftplugin

import org.bukkit.Server
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.PluginCommand
import org.bukkit.entity.Player
import org.bukkit.event.HandlerList
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Handler

class MinecraftPlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello!!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        HandlerList.unregisterAll(this)
    }
}