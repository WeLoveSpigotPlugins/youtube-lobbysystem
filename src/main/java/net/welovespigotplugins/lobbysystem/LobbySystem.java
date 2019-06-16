package net.welovespigotplugins.lobbysystem;

import net.welovespigotplugins.lobbysystem.listener.PlayerJoinListener;
import net.welovespigotplugins.lobbysystem.utils.PlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * JavaDoc this file!
 * Created: 16.06.2019
 *
 * @author WeLoveSpigotPlugins (welovespigotplugins@gmail.com)
 */
public class LobbySystem extends JavaPlugin {

    private static LobbySystem instance;
    private PlayerUtils playerUtils;

    @Override
    public void onEnable() {

        instance = this;
        registerEvents();

        this.playerUtils = new PlayerUtils();


    }

    public static LobbySystem getInstance() {
        return instance;
    }

    public PlayerUtils getPlayerUtils() {
        return playerUtils;
    }

    /**
     * Register Events
     */
    private void registerEvents() {

        final PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoinListener(), this);

    }

}
