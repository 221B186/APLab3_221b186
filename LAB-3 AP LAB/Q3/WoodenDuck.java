class WoodenDuck implements SwimBehavior, MuteBehavior {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is swimming.");
    }

    @Override
    public void mute() {
        System.out.println("Wooden Duck is mute.");
    }
}