package thearknoah05.wizedoors;


import net.minecraft.data.DataGenerator;
import net.minecraft.data.RecipeProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import thearknoah05.wizedoors.blocks.WizeBlocks;
import thearknoah05.wizedoors.data.EnglishProvider;
import thearknoah05.wizedoors.data.RecipeGenerator;
import thearknoah05.wizedoors.items.WizeItems;


@Mod("wizedoors")
public class WizeDoors {

    //Here I define the MODID of the mod for easy use later on in development. Note the access modifiers (public, static and final) Learn these!!
    public static final String MODID = "wizedoors";
    //Allows us to easily log things to the console.
    public static final Logger LOGGER = LogManager.getLogger();

    //Main Method:
    public WizeDoors() {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        //Not sure if we'll need the following, but Ill add and comment it out just in case.
        //MinecraftForge.EVENT_BUS.register(this);
    }

    //Note the different access modifier "private".
    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("[WizeDoors} Setup Method Registered");
    }

    //This is for once we have an item registry
    //This way of a registry is called a deferred registry
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onNewRegistries(RegistryEvent.NewRegistry e) {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        WizeItems.ITEMS.register(bus);
        WizeBlocks.BLOCKS.register(bus);
       // WizeBlocks.BLOCK_ITEMS.register(bus);
    }

    @SubscribeEvent
    public void onGatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        generator.addProvider(new EnglishProvider(generator));
        generator.addProvider(new RecipeGenerator(generator));
    }
}
