package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class FurySwipes extends PhysicalMove {
    public FurySwipes(double pow, double acc) {

        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
        if(Math.random() < 3/8.0d){
            super.applyOppDamage(def, damage*2);
        }
        if(Math.random() < 3/8.0d){
            super.applyOppDamage(def, damage*3);
        }
        if(Math.random() < 1/8.0d){
            super.applyOppDamage(def, damage*4);
        }
        if(Math.random() < 1/8.0d){
            super.applyOppDamage(def, damage*5);
        }

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
