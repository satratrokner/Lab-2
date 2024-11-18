package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc) {

        super(Type.FLYING, pow, acc);

    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true; // Всегда возвращает true
    }

}
