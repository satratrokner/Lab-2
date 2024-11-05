package mypokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dedenne extends Pokemon {
    public Dedenne(String name, int level) {
        super(name, level);

        super.setType(Type.ELECTRIC, Type.FAIRY);
        super.setStats(67, 58, 57, 81, 67, 101);

    }
}
