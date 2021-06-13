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

    private var effects : Map<Int, Collection<PotionEffect>> = mutableMapOf()

    constructor(plugin: Plugin) {
        plugin.server.pluginManager.registerEvents(this, plugin)

        this.effects = mutableMapOf(
            60 to mutableListOf(
                PotionEffect(PotionEffectType.HUNGER, 60, 60),
                PotionEffect(PotionEffectType.SLOW_DIGGING, 60, 60)
            ),
            50 to mutableListOf(
                PotionEffect(PotionEffectType.SLOW, 60, 60),
                PotionEffect(PotionEffectType.UNLUCK, 60, 60),
                PotionEffect(PotionEffectType.HUNGER, 60, 60)
            ),
            40 to mutableListOf(
                PotionEffect(PotionEffectType.WITHER, 60, 60),
                PotionEffect(PotionEffectType.POISON, 60, 60)
            )
        )
    }

    @EventHandler(priority = EventPriority.NORMAL)
    fun onMove(e: PlayerMoveEvent) {


        var player : Player = e.player
        var loc : Location = player.getLocation()

        if (loc.y < 60) {
            player.sendTitle("y=60以下", "", 1, 3, 1)

            player.addPotionEffect(PotionEffect(PotionEffectType.POISON, 60, 60))


        } else {
            player.removePotionEffect(PotionEffectType.POISON)
        }

        return
    }

}
