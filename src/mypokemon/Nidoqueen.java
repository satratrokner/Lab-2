package mypokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class Nidoqueen extends Pokemon {
    public Nidoqueen(String name, int level) {
        super(name, level);

        super.setType(Type.POISON, Type.GROUND);
        super.setStats(90, 92, 87, 75, 85, 76);


        super.setMove();

    }
}
