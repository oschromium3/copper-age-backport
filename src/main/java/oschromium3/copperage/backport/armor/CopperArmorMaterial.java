package oschromium3.copperage.backport.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import oschromium3.copperage.backport.TheCopperAgeBackport;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class CopperArmorMaterial {

    public static final RegistryEntry<ArmorMaterial> COPPER = registerArmorMaterial("copper",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.HELMET, 2);
                        map.put(ArmorItem.Type.CHESTPLATE, 4);
                        map.put(ArmorItem.Type.LEGGINGS, 3);
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.BODY, 4);
                    }),  8, // enchantability
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // Corrected the problem
            () -> Ingredient.ofItems(Items.COPPER_INGOT), // repair ingredient, copper ingot obviously
                    List.of(new ArmorMaterial.Layer(Identifier.of(TheCopperAgeBackport.MOD_ID, "copper"))), 0 , 0)); //toughness and knockback resistance

        public static RegistryEntry<ArmorMaterial> registerArmorMaterial (String name, Supplier<ArmorMaterial> material) {
            return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(TheCopperAgeBackport.MOD_ID, name), material.get());
        }
}
