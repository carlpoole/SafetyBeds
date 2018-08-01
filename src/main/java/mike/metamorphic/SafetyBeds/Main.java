package mike.metamorphic.SafetyBeds;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("SafetyBeds is disabled");
    }

    @Override
    public void onEnable() {
        super.onEnable();
        registerListeners();
        getLogger().info("SafetyBeds is enabled");
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new BedExplosionNullifier(), this);
    }

}
