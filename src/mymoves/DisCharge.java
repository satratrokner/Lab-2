package mymoves;

import ru.ifmo.se.pokemon.*;

final public class DisCharge extends SpecialMove {
    public DisCharge(double pow, double acc) {

        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() < 0.3) {
            Effect.paralyze(p);
        }
        }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
