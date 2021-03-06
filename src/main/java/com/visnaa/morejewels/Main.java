package com.visnaa.morejewels;

import com.visnaa.morejewels.init.ModBlocks;
import com.visnaa.morejewels.init.ModItems;
import com.visnaa.morejewels.tabs.MoreJewelsTab;
import com.visnaa.morejewels.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
public class Main
{
    public static final String MOD_ID = "morejewels";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup ITEM_GROUP = new MoreJewelsTab("morejewels_tab");

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGHEST, OreGeneration::registerOres);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
