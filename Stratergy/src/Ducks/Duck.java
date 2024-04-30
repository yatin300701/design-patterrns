package Ducks;

import DuckBehaviours.Fly;

/**
 * Duck
 */
public abstract class Duck {
    private Fly flyBehaviour;
    protected String type;
    Duck(Fly fly){
        this.flyBehaviour = fly;

    }

    public void quack(){
        System.out.println("I can do quack quack");
    }

    public void flyit(){
        this.flyBehaviour.fly();
    }

    public void setFlyBehaviour(Fly flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public abstract void display();

    
}