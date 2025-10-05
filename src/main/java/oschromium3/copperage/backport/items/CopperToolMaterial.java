package oschromium3.copperage.backport.items;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

// Class should not be abstract, as you want to create an instance of it.
public class CopperToolMaterial implements ToolMaterial {

    // The INSTANCE can be created directly from the concrete class.
    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

    @Override
    public float getAttackDamage() {
        return 1F;
    }
    @Override
    public int getDurability() {
        return 190;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        // Copper tools can only mine the same things as stone, should be OK
        return BlockTags.INCORRECT_FOR_STONE_TOOL;
    }
    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}
