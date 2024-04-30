/**
 * Duck
 */
public abstract class Duck {
    protected String type;
    Duck(String duck){
        this.type = duck;
    }

    public void quack(){
        System.out.println("I can do quack quack");
    }

    public abstract void display();

    
}