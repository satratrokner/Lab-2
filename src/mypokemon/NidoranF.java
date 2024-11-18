package mypokemon;

import mymoves.AerialAce;
import mymoves.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranF extends Pokemon {
    public NidoranF(String name, int level) {
        super(name, level);

        super.setType(Type.POISON);
        super.setStats(55, 47, 52, 40, 40, 41);

        AerialAce aerialAce = new AerialAce(60, 100);
        Thunder thunder = new Thunder(110, 70);

        super.setMove(aerialAce, thunder);

    }
}
