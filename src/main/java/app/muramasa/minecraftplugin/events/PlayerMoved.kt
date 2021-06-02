package app.muramasa.minecraftplugin.events;

import org.bukkit.EntityEffect
import org.bukkit.Location
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class PlayerMoved : Listener {

    constructor(plugin: Plugin) {
        plugin.server.pluginManager.registerEvents(this, plugin)
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    fun onMove(e: PlayerMoveEvent) {

        var player : Player = e.player
        var from : Location = e.from
        var to : Location? = e.to

//        player.sendMessage(String.format("%s -> x: %s, y: %s, z: %s", e.eventName, from.x, from.y, from.z))

        if (from.y < 60) {
            player.sendTitle("y=60以下", "", 1, 3, 1)

            var poisonEffect = PotionEffect(PotionEffectType.POISON, 60, 60)
            player.addPotionEffect(poisonEffect)
        } else {
            player.removePotionEffect(PotionEffectType.POISON)
        }

        return
    }

}
