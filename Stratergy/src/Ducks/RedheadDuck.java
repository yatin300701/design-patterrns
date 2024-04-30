package Ducks;

import DuckBehaviours.Fly;

public class RedheadDuck extends Duck {
    public RedheadDuck(Fly flyBehaviour){
        super(flyBehaviour);
    }
    @Override
    public void display() {
        System.out.println("This is a redhead duck");
    }
}
