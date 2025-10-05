package oschromium3.copperage.backport.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import oschromium3.copperage.backport.TheCopperAgeBackport;
import oschromium3.copperage.backport.particle.ModParticles;

import static net.minecraft.block.Oxidizable.OxidationLevel.*;

public class BlockItems {

    // copper torches
    public static final Block COPPER_WALL_TORCH = Registry.register(Registries.BLOCK,
            Identifier.of(TheCopperAgeBackport.MOD_ID, "copper_wall_torch"),
            new WallTorchBlock(
                    ModParticles.COPPER_FIRE_FLAME,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY))
    );

    public static final Block COPPER_TORCH = registerBlock("copper_torch",
            new TorchBlock(
                    ModParticles.COPPER_FIRE_FLAME,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY))
    );

// copper lanterns
    public static final Block COPPER_LANTERN = registerBlockWithItem("copper_lantern",
            new OxidationPropertiesLantern(UNAFFECTED, AbstractBlock.Settings.create().strength(3.5F).requiresTool().luminance(state -> 15).nonOpaque().sounds(BlockSoundGroup.LANTERN).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block EXPOSED_COPPER_LANTERN = registerBlockWithItem("exposed_copper_lantern",
            new OxidationPropertiesLantern(EXPOSED, AbstractBlock.Settings.copy(COPPER_LANTERN).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));

    public static final Block WEATHERED_COPPER_LANTERN = registerBlockWithItem("weathered_copper_lantern",
            new OxidationPropertiesLantern(WEATHERED, AbstractBlock.Settings.copy(COPPER_LANTERN).mapColor(MapColor.DARK_AQUA)));

    public static final Block OXIDIZED_COPPER_LANTERN = registerBlockWithItem("oxidized_copper_lantern",
            new OxidationPropertiesLantern(OXIDIZED, AbstractBlock.Settings.copy(COPPER_LANTERN).mapColor(MapColor.TEAL)));



    // waxed copper lanterns
    public static final Block WAXED_COPPER_LANTERN = registerBlockWithItem("waxed_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(COPPER_LANTERN)));

    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlockWithItem("waxed_exposed_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_LANTERN)));

    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlockWithItem("waxed_weathered_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_LANTERN)));

    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlockWithItem("waxed_oxidized_copper_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_LANTERN)));


    // oxidizable copper chains
    public static final Block COPPER_CHAIN = registerBlockWithItem("copper_chain",
            new OxidationPropertiesChain(UNAFFECTED, AbstractBlock.Settings.create().strength(3.5F).requiresTool().sounds(BlockSoundGroup.CHAIN).nonOpaque()));

    public static final Block EXPOSED_COPPER_CHAIN = registerBlockWithItem("exposed_copper_chain",
            new OxidationPropertiesChain(EXPOSED, AbstractBlock.Settings.copy(COPPER_CHAIN)));

    public static final Block WEATHERED_COPPER_CHAIN = registerBlockWithItem("weathered_copper_chain",
            new OxidationPropertiesChain(WEATHERED, AbstractBlock.Settings.copy(COPPER_CHAIN)));

    public static final Block OXIDIZED_COPPER_CHAIN = registerBlockWithItem("oxidized_copper_chain",
            new OxidationPropertiesChain(OXIDIZED, AbstractBlock.Settings.copy(COPPER_CHAIN)));


    // waxed copper chains
    public static final Block WAXED_COPPER_CHAIN = registerBlockWithItem("waxed_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(COPPER_CHAIN)));

    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlockWithItem("waxed_exposed_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_CHAIN)));

    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlockWithItem("waxed_weathered_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_CHAIN)));

    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlockWithItem("waxed_oxidized_copper_chain",
            new ChainBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_CHAIN)));



/*
    // Lightning Rod Oxidation States, add on to the existing one.
     // take mojang's official settings for the lightning rod but add oxidation
    public static final Block LIGHTNING_ROD = registerBlock("lightning_rod",
            new LightningRodOxidization(UNAFFECTED, AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).solid().requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER).nonOpaque()));
    // replace the vanilla lightning block with one that supports it


    public static final Block EXPOSED_LIGHTNING_ROD = registerBlock("exposed_lightning_rod",
            new LightningRodOxidization(EXPOSED, AbstractBlock.Settings.copy(LIGHTNING_ROD).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));

    public static final Block WEATHERED_LIGHTNING_ROD = registerBlock("weathered_lightning_rod",
            new LightningRodOxidization(WEATHERED, AbstractBlock.Settings.copy(LIGHTNING_ROD).mapColor(MapColor.DARK_AQUA)));

    public static final Block OXIDIZED_LIGHTNING_ROD = registerBlock("oxidized_lightning_rod",
           new LightningRodOxidization(OXIDIZED, AbstractBlock.Settings.copy(LIGHTNING_ROD).mapColor(MapColor.TEAL)));


     // WAXED Lightning Rods, simple implementation
    public static final Block WAXED_LIGHTNING_ROD = registerBlock("waxed_lightning_rod",
            new LightningRodBlock(AbstractBlock.Settings.copy(LIGHTNING_ROD)));

      public static final Block WAXED_EXPOSED_LIGHTNING_ROD = registerBlock("waxed_exposed_lightning_rod",
              new LightningRodBlock(AbstractBlock.Settings.copy(EXPOSED_LIGHTNING_ROD)));

      public static final Block WAXED_WEATHERED_LIGHTNING_ROD = registerBlock("waxed_weathered_lightning_rod",
              new LightningRodBlock(AbstractBlock.Settings.copy(WEATHERED_LIGHTNING_ROD)));

      public static final Block WAXED_OXIDIZED_LIGHTNING_ROD = registerBlock("waxed_oxidized_lightning_rod",
            new LightningRodBlock(AbstractBlock.Settings.copy(OXIDIZED_LIGHTNING_ROD)));
*/
    // --- Helper Methods ---

    // Renamed helper method for clarity
    private static Block registerBlockWithItem(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheCopperAgeBackport.MOD_ID, name), block);
    }
    // fix helper function for registering blocks
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheCopperAgeBackport.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheCopperAgeBackport.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    // This helper method is for blocks like torches where the item registers a regular block that knows its wall variant.
    private static void registerWallBlockItem(String name, Block block, Block wallBlock) {
        Registry.register(Registries.ITEM, Identifier.of(TheCopperAgeBackport.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlockItems(){
        TheCopperAgeBackport.LOGGER.info("Registering BlockItems for " + TheCopperAgeBackport.MOD_ID);

        // --- Register Oxidizable and Waxable relationships via Fabric API ---
        // Registering Oxidizable blocks
        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_LANTERN, EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_LANTERN, WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_LANTERN, OXIDIZED_COPPER_LANTERN);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_CHAIN, EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_CHAIN, WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_CHAIN, OXIDIZED_COPPER_CHAIN);
/*
// add oxidizable blocks for Lightning rods, for anyone reading this in the future, just know it was a hard time to try to get the lightning rod to work for some reason.
        OxidizableBlocksRegistry.registerOxidizableBlockPair(LIGHTNING_ROD, EXPOSED_LIGHTNING_ROD);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_LIGHTNING_ROD, WEATHERED_LIGHTNING_ROD);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_LIGHTNING_ROD, OXIDIZED_LIGHTNING_ROD);
*/
        // Registering Waxable blocks
        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_LANTERN, WAXED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_LANTERN, WAXED_EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_LANTERN, WAXED_WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_LANTERN, WAXED_OXIDIZED_COPPER_LANTERN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_CHAIN, WAXED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_CHAIN, WAXED_OXIDIZED_COPPER_CHAIN);
/*
        // lightning rod implementation for register, remember lightning rods are a beta feature
        OxidizableBlocksRegistry.registerWaxableBlockPair(LIGHTNING_ROD, WAXED_LIGHTNING_ROD);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_LIGHTNING_ROD, WAXED_EXPOSED_LIGHTNING_ROD);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_LIGHTNING_ROD, WAXED_WEATHERED_LIGHTNING_ROD);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_LIGHTNING_ROD, WAXED_OXIDIZED_LIGHTNING_ROD);
*/
        // Add items to a creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(COPPER_CHAIN.asItem());
            content.add(EXPOSED_COPPER_CHAIN.asItem());
            content.add(WEATHERED_COPPER_CHAIN.asItem());
            content.add(OXIDIZED_COPPER_CHAIN.asItem());
            content.add(WAXED_COPPER_CHAIN.asItem());
            content.add(WAXED_EXPOSED_COPPER_CHAIN.asItem());
            content.add(WAXED_WEATHERED_COPPER_CHAIN.asItem());
            content.add(WAXED_OXIDIZED_COPPER_CHAIN.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.add(COPPER_CHAIN.asItem());
            content.add(EXPOSED_COPPER_CHAIN.asItem());
            content.add(WEATHERED_COPPER_CHAIN.asItem());
            content.add(OXIDIZED_COPPER_CHAIN.asItem());
            content.add(WAXED_COPPER_CHAIN.asItem());
            content.add(WAXED_EXPOSED_COPPER_CHAIN.asItem());
            content.add(WAXED_WEATHERED_COPPER_CHAIN.asItem());
            content.add(WAXED_OXIDIZED_COPPER_CHAIN.asItem());
            content.add(COPPER_LANTERN.asItem());
            content.add(EXPOSED_COPPER_LANTERN.asItem());
            content.add(WEATHERED_COPPER_LANTERN.asItem());
            content.add(OXIDIZED_COPPER_LANTERN.asItem());
            content.add(WAXED_COPPER_LANTERN.asItem());
            content.add(WAXED_EXPOSED_COPPER_LANTERN.asItem());
            content.add(WAXED_WEATHERED_COPPER_LANTERN.asItem());
            content.add(WAXED_OXIDIZED_COPPER_LANTERN.asItem());
            content.add(COPPER_CHAIN.asItem());
            content.add(EXPOSED_COPPER_CHAIN.asItem());
            content.add(WEATHERED_COPPER_CHAIN.asItem());
            content.add(OXIDIZED_COPPER_CHAIN.asItem());
            content.add(WAXED_COPPER_CHAIN.asItem());
            content.add(WAXED_EXPOSED_COPPER_CHAIN.asItem());
            content.add(WAXED_WEATHERED_COPPER_CHAIN.asItem());
            content.add(WAXED_OXIDIZED_COPPER_CHAIN.asItem());
            content.add(COPPER_TORCH.asItem());
        });
    }
}
