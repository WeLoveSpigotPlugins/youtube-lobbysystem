package net.welovespigotplugins.lobbysystem.listener;

import net.welovespigotplugins.lobbysystem.LobbySystem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * JavaDoc this file!
 * Created: 16.06.2019
 *
 * @author WeLoveSpigotPlugins (welovespigotplugins@gmail.com)
 */
public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {

        final Player player = event.getPlayer();

        event.setJoinMessage(null);
        LobbySystem.getInstance().getPlayerUtils().setPlayerInventory(player);

    }

}
