package mike.metamorphic.SafetyBeds;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;

public class BedExplosionNullifier implements Listener {

    @EventHandler
    public void onExplode(BlockExplodeEvent blockExplodeEvent) {
        if (blockExplodeEvent.getBlock().getWorld().getEnvironment() == World.Environment.NETHER) {

            // Check for air, since bed explosions originate from the air
            if (blockExplodeEvent.getBlock().getType().equals(Material.AIR)) {
                blockExplodeEvent.blockList().clear();
                blockExplodeEvent.setYield(0);
                blockExplodeEvent.setCancelled(true);
            }
        }
    }
}
