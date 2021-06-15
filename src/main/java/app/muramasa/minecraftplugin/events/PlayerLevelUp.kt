package app.muramasa.minecraftplugin.events

import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerLevelChangeEvent
import org.bukkit.plugin.Plugin

class PlayerLevelUp(plugin: Plugin) : Listener {

    init {
        plugin.server.pluginManager.registerEvents(this, plugin)
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    fun onLevelUp(e: PlayerLevelChangeEvent) {

        e.player.sendMessage(String.format("レベルアップしました。"))

        return
    }

}
