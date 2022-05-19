package net.chromazoma.tutorialmod.item;

import net.chromazoma.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BLOB = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "blob"),
        () -> new ItemStack(ModItems.BLOBIUM_INGOT));
}
