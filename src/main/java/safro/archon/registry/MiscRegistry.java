package safro.archon.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import safro.archon.Archon;
import safro.archon.client.screen.ExperiencePouchScreenHandler;
import safro.archon.client.screen.ScriptureTableScreenHandler;
import safro.archon.enchantment.ArcaneEnchantment;

public class MiscRegistry {
    // Screen Handlers
    public static ScreenHandlerType<ScriptureTableScreenHandler> SCRIPTURE_TABLE_SH;
    public static ScreenHandlerType<ExperiencePouchScreenHandler> EXPERIENCE_POUCH_SH;

    // Enchantments
    public static Enchantment ARCANE;

    // Particle Types
    public static ParticleType<DefaultParticleType> WATER_BALL_PARTICLE;

    public static void init() {
        SCRIPTURE_TABLE_SH = ScreenHandlerRegistry.registerSimple(new Identifier(Archon.MODID, "scripture_table"), ScriptureTableScreenHandler::new);
        EXPERIENCE_POUCH_SH = ScreenHandlerRegistry.registerSimple(new Identifier(Archon.MODID, "experience_pouch"), ExperiencePouchScreenHandler::new);

        ARCANE = Registry.register(Registry.ENCHANTMENT, new Identifier(Archon.MODID, "arcane"), new ArcaneEnchantment());

        WATER_BALL_PARTICLE = Registry.register(Registry.PARTICLE_TYPE, new Identifier(Archon.MODID, "water_ball"), FabricParticleTypes.simple());
    }
}
