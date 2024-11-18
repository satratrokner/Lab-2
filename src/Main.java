import mypokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Dedenne dedenne = new Dedenne("Coconut", 50);

        b.addAlly(p1);


        b.addFoe(dedenne);

        b.go();
    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}

