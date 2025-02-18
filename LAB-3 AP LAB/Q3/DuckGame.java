public class DuckGame {
    public static void main(String[] args) {

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.squeak();

        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuck.swim();
        woodenDuck.mute();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        redHeadDuck.quack();
        redHeadDuck.fly();

        LakeDuck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        lakeDuck.quack();
        lakeDuck.fly();
    }
}