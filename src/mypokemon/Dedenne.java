package mypokemon;

import mymoves.AerialAce;
import mymoves.ChargeBeam;
import mymoves.DisCharge;
import mymoves.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final public class Dedenne extends Pokemon {
    public Dedenne(String name, int level) {
        super(name, level);

        super.setType(Type.ELECTRIC, Type.FAIRY);
        super.setStats(67, 58, 57, 81, 67, 101);

        AerialAce aerialAce = new AerialAce(60, 100);
        TailWhip tailWhip = new TailWhip(0, 100);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        DisCharge disCharge = new DisCharge(80, 100);
        super.setMove(aerialAce, tailWhip, chargeBeam, disCharge);

    }

}
