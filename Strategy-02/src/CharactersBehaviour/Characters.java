package CharactersBehaviour;

import WeaponsBehaviour.Weapon;

public abstract class Characters {
   Weapon weapon;
    Characters(Weapon w){
        weapon = w;
    }

    public void setWeapon(Weapon w){
        this.weapon = w;
    }

    public void   fight(){
        this.weapon.damagePower();
    }
}
