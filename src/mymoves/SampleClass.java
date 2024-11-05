package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class SampleClass extends PhysicalMove {
    public SampleMove(double pow, double acc) {

        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}
