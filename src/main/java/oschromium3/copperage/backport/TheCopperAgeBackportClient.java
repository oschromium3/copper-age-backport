package oschromium3.copperage.backport;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;
import oschromium3.copperage.backport.blocks.BlockItems;
import oschromium3.copperage.backport.particle.ModParticles;

public class TheCopperAgeBackportClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
        ParticleFactoryRegistry.getInstance().register(ModParticles.COPPER_FIRE_FLAME, FlameParticle.Factory::new);

        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.COPPER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.EXPOSED_COPPER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WEATHERED_COPPER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.OXIDIZED_COPPER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_COPPER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_EXPOSED_COPPER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_WEATHERED_COPPER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_OXIDIZED_COPPER_LANTERN, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.COPPER_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.EXPOSED_COPPER_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WEATHERED_COPPER_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.OXIDIZED_COPPER_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_COPPER_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_EXPOSED_COPPER_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_WEATHERED_COPPER_CHAIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.WAXED_OXIDIZED_COPPER_CHAIN, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.COPPER_TORCH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockItems.COPPER_WALL_TORCH, RenderLayer.getTranslucent());
	}
}