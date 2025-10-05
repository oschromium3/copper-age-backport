package oschromium3.copperage.backport.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

// global class for all oxidizable items, follows mojang implementation
public class OxidationPropertiesChain extends ChainBlock implements Oxidizable {
    private final OxidationLevel oxidationLevel;

    public OxidationPropertiesChain(OxidationLevel oxidationLevel, Settings settings) {
        super(settings.ticksRandomly());
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return oxidationLevel;
    }

    // tells the game to use random ticks and get the next stage in the Oxidization process
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }
}
