package panpole.smokingmod.common.items;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Vape extends Item
{
    public Vape(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
        player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 2));
        for(int i=0; i<5; i++)
        {
            world.addAlwaysVisibleParticle(ParticleTypes.CLOUD, player.getX(), player.getY()+1.5, player.getZ(), 0, 0, 0);
        }
        return super.use(world, player, hand);
    }
}
