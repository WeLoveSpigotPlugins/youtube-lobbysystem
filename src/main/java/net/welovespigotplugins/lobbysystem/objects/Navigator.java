package net.welovespigotplugins.lobbysystem.objects;

import com.google.common.collect.Lists;
import lombok.Getter;
import net.welovespigotplugins.lobbysystem.utils.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

/**
 * JavaDoc this file!
 * Created: 16.06.2019
 *
 * @author WeLoveSpigotPlugins (welovespigotplugins@gmail.com)
 */

@Getter
public class Navigator {

    private final String displayName;
    private Inventory inventory;
    private List<ItemStack> itemStackList = Lists.newArrayList();

    public Navigator(final String displayName) {
        this.displayName = displayName;
        setupInventory();
    }

    private void setupInventory() {
        inventory = Bukkit.createInventory(null, 9 * 5, this.displayName);

        final ItemStack blackGlass = new ItemManager(Material.STAINED_GLASS_PANE).setData((short) 7).setNoName().build();
        final ItemStack redGlass = new ItemManager(Material.STAINED_GLASS_PANE).
                setData((short) 14).
                setDisplayName("§8● §cKein Item gesetzt§8!").
                addLoreAll(Arrays.asList("",
                        "§7Bitte füge in der §enavigation.yml §7weitere Spawnpunkte ein§8!")).
                build();

        for(int i = 0 ; i < 11 ; i++) {
            inventory.setItem(i, blackGlass);
        }

        inventory.setItem(12, redGlass);
        inventory.setItem(13, redGlass);
        inventory.setItem(14, redGlass);

        inventory.setItem(16, blackGlass);
        inventory.setItem(17, blackGlass);
        inventory.setItem(18, blackGlass);

        inventory.setItem(19, redGlass);
        inventory.setItem(20, redGlass);

        inventory.setItem(24, redGlass);
        inventory.setItem(25, redGlass);

        inventory.setItem(26, blackGlass);
        inventory.setItem(27, blackGlass);

        inventory.setItem(31, redGlass);

        inventory.setItem(35, blackGlass);
        inventory.setItem(36, blackGlass);
        inventory.setItem(37, blackGlass);

        for(int i = 43; i < 54; i++) {
            inventory.setItem(i, blackGlass);
        }

    }

}
