package yusama125718.man10MiniGame;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Man10MiniGame extends JavaPlugin {

    public static JavaPlugin mminigame;
    public static String prefix = "";
    public static List<Data.MiniGame> gamelist = new ArrayList<>();

    @Override
    public void onEnable() {
        mminigame = this;
        Config.initial_config();
    }
}
