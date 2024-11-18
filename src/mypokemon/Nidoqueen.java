package mypokemon;

import mymoves.Scratch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class Nidoqueen extends Nidorina{
    public Nidoqueen(String name, int level) {
        super(name, level);

        super.setType(Type.POISON, Type.GROUND);
        super.setStats(90, 92, 87, 75, 85, 76);

        Scratch scratch = new Scratch(40, 100);


        super.addMove(scratch);

    }
}
