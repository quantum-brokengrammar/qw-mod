package qwmod.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class qwmodBlocks{
  //spikes
  public static Block thoriumSpike, plastaniumSpike, titaniumSpike, copperSpike, 
  public static void load() {
    thoriumSpike = new Wall("thorium-spike"){{
            requirements(Category.defense, with(thorium, 4));
            health = 400;
            size = 1;
            envDisabled |= Env.scorching;
    }};
    plastaniumSpike = new Wall("plastanium-spike"){{
            requirements(Category.defense, with(plastanium, 4));
            health = 250;
            size = 1;
            envDisabled |= Env.scorching;
    }};
    titaniumSpike = new Wall("titanium-spike"){{
            requirements(Category.defense, with(titanium, 4));
            health = 220;
            size = 1;
            envDisabled |= Env.scorching;
    }};
    copperSpike = new Wall("copper-spike"){{
            requirements(Category.defense, with(copper, 4));
            health = 120;
            size = 1;
            envDisabled |= Env.scorching;
    }};
  }
}
