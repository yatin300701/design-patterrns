public class App {
    public static void main(String[] args) throws Exception {
        Duck mallDuck = new MalladDuck();
        mallDuck.display();
        mallDuck.quack();

        Duck redHeadDuck = new RedheadDuck();
        redHeadDuck.display();
        redHeadDuck.quack();
    }
}
