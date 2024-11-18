import mypokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Dedenne("Barbeque", 50);
        Pokemon p2 = new Hariyama("Garlic", 50);
        Pokemon p3 = new Makuhita("Onion", 50);
        Pokemon p4 = new NidoranF("Cilantro", 50);
        Pokemon p5 = new Nidoqueen("Potato", 50);
        Pokemon p6 = new Nidorina("Lard", 50);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);


        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}

