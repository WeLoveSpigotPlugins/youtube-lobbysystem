package net.welovespigotplugins.lobbysystem.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * JavaDoc this file!
 * Created: 16.06.2019
 *
 * @author WeLoveSpigotPlugins (welovespigotplugins@gmail.com)
 */
public class PlayerUtils {

    private final Inventory inventory;

    public PlayerUtils() {
        this.inventory = Bukkit.createInventory(null, 9, "");

        // INVENTORY ITEMS
        this.inventory.setItem(0,
                new ItemManager(Material.COMPASS).setDisplayName("§8● §eNavigator §8(§eRechtsklick§8)").build());

        this.inventory.setItem(1,
                new ItemManager(Material.FEATHER).setDisplayName("§8● §ePlayerhider §8(§eRechtsklick§8)").build());

    }

    public void setPlayerInventory(final Player player) {
        player.getInventory().setContents(inventory.getContents());
    }

}
