import CharactersBehaviour.*;
import WeaponsBehaviour.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Characters king = new King(new Knife());
        Characters queen = new Queen(new Bow());

        king.fight();

        queen.fight();

        queen = new Queen(new Knife());

        queen.fight();

    }
}
