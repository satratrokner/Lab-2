package mypokemon;

import mymoves.StoneEdge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class Hariyama extends Makuhita {
    public Hariyama(String name, int level) {
        super(name, level);

        super.setStats(144, 120, 60, 40, 60, 50);

        StoneEdge stoneEdge = new StoneEdge(100, 80);

        super.addMove(stoneEdge);

    }
}
