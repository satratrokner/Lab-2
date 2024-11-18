package mypokemon;

import mymoves.FocusBlast;
import mymoves.FocusEnergy;
import mymoves.RockSlide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Makuhita extends Pokemon {
    public Makuhita(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING);
        super.setStats(72, 60, 30, 20, 30, 25);

        FocusBlast focusBlast = new FocusBlast(120, 70);
        FocusEnergy focusEnergy =  new FocusEnergy(0, 100);
        RockSlide rockSlide = new RockSlide(75, 90);


        super.setMove(focusBlast, focusEnergy, rockSlide);

    }
}
