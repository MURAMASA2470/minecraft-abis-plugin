package app.muramasa.minecraftplugin

import app.muramasa.minecraftplugin.events.PlayerMoved
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
        PlayerMoved(this)
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        when (sender) {
            is Player -> {
                logger.info(String.format("%s : %s : %s", command.name, label, sender.location.blockY))
            }
        }
        return true
    }

    override fun onDisable() {
        // Plugin shutdown logic
        HandlerList.unregisterAll(this)
    }
}