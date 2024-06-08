package jswin.smokingmod.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import jswin.smokingmod.SmokingMod;
import jswin.smokingmod.common.items.Cigar;
import jswin.smokingmod.common.items.Cigarette;
import jswin.smokingmod.common.items.Vape;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SmokingMod.MODID);

    public static final CreativeModeTab TAB = new CreativeModeTab(SmokingMod.MODID)
    {
        @Override
        public ItemStack makeIcon()
        {
            return CIGAR.get().getDefaultInstance();
        }
    };

    //ITEMS
    public static final RegistryObject<Item> CIGAR = ITEMS.register("cigar", () -> new Cigar(new Item.Properties().tab(TAB).durability(10)));
    public static final RegistryObject<Item> VAPE = ITEMS.register("vape", () -> new Vape(new Item.Properties().tab(TAB).durability(10)));
    public static final RegistryObject<Item> CIGARETTE = ITEMS.register("cigarette", () -> new Cigarette(new Item.Properties().tab(TAB).durability(10)));

    //BLOCKS
    public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new BlockItem(ModBlocks.TEST.get(), new Item.Properties().tab(TAB)));
}
