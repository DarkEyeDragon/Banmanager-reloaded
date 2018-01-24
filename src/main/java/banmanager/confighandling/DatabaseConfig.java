package banmanager.confighandling;

import banmanager.BanManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class DatabaseConfig{

    BanManager banManager = new BanManager();

    private Plugin plugin;

    public DatabaseConfig(Plugin plugin){
        this.plugin = plugin;
    }

    public FileConfiguration getConfig(){
        return plugin.getConfig();
    }

}
