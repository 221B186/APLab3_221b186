class LakeDuck implements SwimBehavior, QuackBehavior, FlyBehavior {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck flies!");
    }
}