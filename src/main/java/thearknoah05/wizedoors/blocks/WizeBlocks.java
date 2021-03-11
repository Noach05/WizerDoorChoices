package thearknoah05.wizedoors.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import thearknoah05.wizedoors.WizeDoors;

public class WizeBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, WizeDoors.MODID);



   /* @SubscribeEvent
    public static void regBlockItems(RegistryEvent.Register<Item> e) {
        genBlockItems(Blocks.BLOCKS.getEntries());
    } */

    public static Block setUpBlock(Block block) {
        return block;
    }
}
