package panpole.smokingmod.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import panpole.smokingmod.SmokingMod;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SmokingMod.MODID);

    public static final RegistryObject<Block> SRANIE = BLOCKS.register("sranie", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
}
