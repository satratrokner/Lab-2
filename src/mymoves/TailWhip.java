package mymoves;

import ru.ifmo.se.pokemon.*;

final public class TailWhip extends StatusMove {
    public TailWhip(double pow, double acc) {

        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect effect = new Effect().stat(Stat.DEFENSE, -1);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }
}
