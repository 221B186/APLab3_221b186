class Kaurav extends Bharatvanshi {
    private String name;

    public Kaurav(String name) {
        this.name = name;
    }

    @Override
    public void obey() {
        System.out.println(name + " does not obey!");
    }

    public void disobey() {
        System.out.println(name + " is disobeying!");
    }

    public void cruel() {
        System.out.println(name + " is cruel!");
    }
}