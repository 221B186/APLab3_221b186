public class Mahabharat {
    public static void main(String[] args) {
        // Create Pandavs
        Pandav arjun = new Pandav("Arjun");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        Pandav bheem = new Pandav("Bheem");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        // Create Kauravs
        Kaurav duryodhan = new Kaurav("Duryodhan");
        duryodhan.fight();
        duryodhan.obey(); // Disobedient
        duryodhan.disobey();
        duryodhan.cruel();

        // Create Vikarn (a noble Kaurav)
        Vikarn vikarn = new Vikarn();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}