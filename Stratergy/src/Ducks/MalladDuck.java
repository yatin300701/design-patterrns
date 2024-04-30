package Ducks;

import DuckBehaviours.Fly;

public class MalladDuck extends Duck{
    public MalladDuck(Fly flyBehaviour){
        super(flyBehaviour);
    }
    @Override
    public void display() {
        System.out.println("This is a MalladDuck");        
    }
}