package yusama125718.man10MiniGame;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI {
    // ItemStack作成
    public static ItemStack CreateIcon(String name, Material mat){
        if (mat == null){
            mat = Material.COBBLESTONE;
        }
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(name));
        item.setItemMeta(meta);
        return item;
    }
    // CMD入りItemStack
    public static ItemStack CreateIcon(String name, Material mat, int cmd){
        if (mat == null){
            mat = Material.COBBLESTONE;
        }
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(cmd);
        meta.displayName(Component.text(name));
        item.setItemMeta(meta);
        return item;
    }
}
