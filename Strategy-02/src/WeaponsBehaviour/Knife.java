package WeaponsBehaviour;
/**
 * Knife
 */
public class Knife implements Weapon{
    int damage = 10;

    @Override
    public void damagePower() {
        System.err.println("Can damage upto  " + damage + " damage");
    }
    
}