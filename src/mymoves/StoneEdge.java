package mymoves;

import ru.ifmo.se.pokemon.Messages;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class StoneEdge extends PhysicalMove {
    public StoneEdge(double pow, double acc) {

        super(Type.ROCK, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (Math.random() < 1/8.0d){
            System.out.println("Critical hit!");
            return 2.0;
        }
        else { return 1.0; }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
