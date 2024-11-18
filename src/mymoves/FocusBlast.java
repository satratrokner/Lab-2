package mymoves;

import ru.ifmo.se.pokemon.*;

final public class FocusBlast extends SpecialMove {
    public FocusBlast(double pow, double acc) {

        super(Type.FIGHTING, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
