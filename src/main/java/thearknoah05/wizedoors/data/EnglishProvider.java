package thearknoah05.wizedoors.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import thearknoah05.wizedoors.WizeDoors;

/* Created by Noah on 11/03/2021 */
public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, WizeDoors.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Blocks
        //add(WizeBlocks.PLACEHOLDER_BLOCK.get(), "Placeholder Block");

        //Items
        //add(WizeItems.PLACEHOLDER_ITEM.get(), "Placeholder Item");

        //Tabs
        add("itemGroup.wizedoors.doors", "Wize Doors");

    }
}
