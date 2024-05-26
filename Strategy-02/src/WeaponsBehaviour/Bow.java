package WeaponsBehaviour;

public class Bow implements Weapon {
    int damage = 20;
    @Override
    public void damagePower() {
        System.err.println("Can damage upto "+ damage +" damage");
    }
}
