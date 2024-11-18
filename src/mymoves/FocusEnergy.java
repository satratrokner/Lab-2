package mymoves;

import ru.ifmo.se.pokemon.*;

final public class FocusEnergy extends StatusMove {
    public FocusEnergy(double pow, double acc) {

        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().chance(1).stat(Stat.SPEED, +1);
        p.addEffect(e);
    }

    @Override
    protected boolean checkAccuracy(Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
