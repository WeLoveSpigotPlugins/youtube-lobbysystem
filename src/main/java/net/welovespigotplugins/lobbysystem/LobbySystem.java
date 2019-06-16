package net.welovespigotplugins.lobbysystem;

import net.welovespigotplugins.lobbysystem.utils.PlayerUtils;
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

        this.playerUtils = new PlayerUtils();

    }

    public static LobbySystem getInstance() {
        return instance;
    }

    public PlayerUtils getPlayerUtils() {
        return playerUtils;
    }
}
