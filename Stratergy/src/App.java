import DuckBehaviours.FlyWithWings;
import DuckBehaviours.FlyWithoutWings;
import Ducks.Duck;
import Ducks.MalladDuck;
import Ducks.RedheadDuck;

public class App {
    public static void main(String[] args) throws Exception {
        Duck mallDuck = new MalladDuck(new FlyWithWings());
        mallDuck.display();
        mallDuck.flyit();

        Duck redHeadDuck = new RedheadDuck(new FlyWithoutWings());
        redHeadDuck.display();
        redHeadDuck.flyit();

        // changed dynamically
        
        redHeadDuck.setFlyBehaviour(new FlyWithWings());
        redHeadDuck.flyit();
    }
}
