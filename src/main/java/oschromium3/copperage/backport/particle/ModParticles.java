package oschromium3.copperage.backport.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final SimpleParticleType COPPER_FIRE_FLAME = register("copper_fire_flame", false);

    private static SimpleParticleType register(String name, boolean alwaysSpawn) {
        // Use your own mod ID here
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of("minecraft", name), FabricParticleTypes.simple(alwaysSpawn));
    }

    public static void init() {
        // This method does nothing, but ensures the static fields are initialized
    }
}
