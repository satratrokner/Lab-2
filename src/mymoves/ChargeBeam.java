package mymoves;

import ru.ifmo.se.pokemon.*;

final public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double pow, double acc) {

        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){ //надо на своего покемона и плюс
        super.applySelfEffects(p);

        Effect effect = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, +1);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
