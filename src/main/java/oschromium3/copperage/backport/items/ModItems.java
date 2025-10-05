package oschromium3.copperage.backport.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import oschromium3.copperage.backport.TheCopperAgeBackport;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import oschromium3.copperage.backport.armor.CopperArmorMaterial;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(
                    CopperToolMaterial.INSTANCE,
                    new Item.Settings()
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(
                                            CopperToolMaterial.INSTANCE, // material
                                            3, // attack damage bonus
                                            -2.4f // attack speed
                                    )
                            )
            )
    );
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(
                    CopperToolMaterial.INSTANCE,
                    new Item.Settings()
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(
                                            CopperToolMaterial.INSTANCE, // material
                                            7, // attack damage bonus
                                            -3.2f // attack speed
                                    )
                            )
            )
    );
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(
                    CopperToolMaterial.INSTANCE,
                    new Item.Settings()
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(
                                            CopperToolMaterial.INSTANCE, // material
                                            1, // attack damage bonus
                                            -2.8f // attack speed
                                    )
                            )
            )
    );
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(
                    CopperToolMaterial.INSTANCE,
                    new Item.Settings()
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(
                                            CopperToolMaterial.INSTANCE, // material
                                            1, // attack damage bonus
                                            -3.0f // attack speed
                                    )
                            )
            )
    );
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(
                    CopperToolMaterial.INSTANCE,
                    new Item.Settings()
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(
                                            CopperToolMaterial.INSTANCE, // material
                                            -1, // attack damage bonus
                                            -3.0f // attack speed
                                    )
                            )
            )
    );

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(CopperArmorMaterial.COPPER, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(11))));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(CopperArmorMaterial.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(11))));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(CopperArmorMaterial.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(11))));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(CopperArmorMaterial.COPPER, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(11))));

    public static final Item COPPER_HORSE_ARMOR = registerItem("copper_horse_armor",
            new AnimalArmorItem(CopperArmorMaterial.COPPER, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item){ return Registry.register(Registries.ITEM, Identifier.of(TheCopperAgeBackport.MOD_ID, name), item); }

    public static void registerModItems(){
        TheCopperAgeBackport.LOGGER.info("Registering Mod Items for " + TheCopperAgeBackport.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(COPPER_NUGGET);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->{
            entries.add(COPPER_SWORD);
            entries.add(COPPER_AXE);
            entries.add(COPPER_HELMET);
            entries.add(COPPER_CHESTPLATE);
            entries.add(COPPER_LEGGINGS);
            entries.add(COPPER_BOOTS);
            entries.add(COPPER_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries ->{
            entries.add(COPPER_SHOVEL);
            entries.add(COPPER_HOE);
            entries.add(COPPER_PICKAXE);
        });
    }
}