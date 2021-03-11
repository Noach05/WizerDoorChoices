package thearknoah05.wizedoors.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import thearknoah05.wizedoors.WizeDoors;

public class WizeItems {

    public static ItemGroup MAIN = new ItemGroup("wizedoors.doors") {
        @Override
        public ItemStack createIcon() {
            //TODO: Ill fix this Icon once we have our first items.
            return null;
        }
    };

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, WizeDoors.MODID);

    //TODO: Once we have our first item thought up and stuff Ill register it.
}
