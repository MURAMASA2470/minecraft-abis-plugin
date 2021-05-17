package app.muramasa.minecraftplugin.events;

import org.bukkit.EntityEffect
import org.bukkit.Location
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin

class PlayerLevelUp : Listener {

    constructor(plugin: Plugin) {
        plugin.server.pluginManager.registerEvents(this, plugin)
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    fun onLevelUp(e: PlayerLevelChangeEvent) {

        e.player.sendMessage(String.format("レベルアップしました。"))

        return
    }

}
