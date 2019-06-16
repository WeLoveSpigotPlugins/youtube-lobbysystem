package net.welovespigotplugins.lobbysystem.utils;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaDoc this file!
 * Created: 16.06.2019
 *
 * @author WeLoveSpigotPlugins (welovespigotplugins@gmail.com)
 */
public class ItemManager {

    private ItemStack item;
    private List<String> lore = new ArrayList<String>();
    private ItemMeta meta;

    public ItemManager(Material mat, short subid, int amount) {
        item = new ItemStack(mat, amount, subid);
        meta = item.getItemMeta();
    }

    public ItemManager(ItemStack item) {
        this.item = item;
        this.meta = item.getItemMeta();
    }

    public ItemManager(Material mat, short subid) {
        item = new ItemStack(mat, 1, subid);
        meta = item.getItemMeta();
    }

    public ItemManager(Material mat, int amount) {
        item = new ItemStack(mat, amount, (short)0);
        meta = item.getItemMeta();
    }

    public ItemManager(Material mat) {
        item = new ItemStack(mat, 1, (short)0);
        meta = item.getItemMeta();
    }

    public ItemManager setAmount(int value) {
        item.setAmount(value);
        return this;
    }

    public ItemManager setNoName() {
        meta.setDisplayName(" ");
        return this;
    }

    public ItemManager setGlow() {
        meta.addEnchant( Enchantment.DURABILITY, 1, true);
        meta.addItemFlags( ItemFlag.HIDE_ENCHANTS);
        return this;
    }

    public ItemManager setData(short data) {
        item.setDurability(data);
        return this;
    }

    public ItemManager addLoreLine(String line) {
        lore.add(line);
        return this;
    }

    public ItemManager addLoreArray(String[] lines) {
        for(int x = 0; x < lines.length; x++) {
            lore.add(lines[x]);
        }
        return this;
    }

    public ItemManager addLoreAll(List<String> lines) {
        lore.addAll(lines);
        return this;
    }

    public ItemManager setDisplayName(String name) {
        meta.setDisplayName(name);
        return this;
    }

    public ItemManager setSkullOwner(String owner) {
        ((SkullMeta)meta).setOwner(owner);
        return this;
    }

    public ItemManager setColor(Color c) {
        ((LeatherArmorMeta)meta).setColor(c);
        return this;
    }

    public ItemManager setBannerColor(DyeColor c) {
        ((BannerMeta)meta).setBaseColor(c);
        return this;
    }

    public ItemManager setUnbreakable(boolean value) {
        meta.spigot().setUnbreakable(value);
        return this;
    }

    public ItemManager addEnchantment(Enchantment ench, int lvl) {
        meta.addEnchant(ench, lvl, true);
        return this;
    }

    public ItemManager addItemFlag(ItemFlag flag) {
        meta.addItemFlags(flag);
        return this;
    }

    public ItemManager addLeatherColor(Color color) {
        ((LeatherArmorMeta ) meta).setColor( color );
        return this;
    }

    public ItemStack build() {
        if(lore.isEmpty() == false) {
            meta.setLore(lore);
        }
        item.setItemMeta(meta);
        return item;
    }

}
