class Pandav extends Bharatvanshi {
    private String name;
    
    public Pandav(String name) {
        this.name = name;
    }

    @Override
    public void obey() {
        System.out.println(name + " is obeying.");
    }

    public void kind() {
        System.out.println(name + " is kind.");
    }
}