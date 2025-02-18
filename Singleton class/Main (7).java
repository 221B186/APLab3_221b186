public class Main {
    public static void main(String[] args) {
        // Get the single instance of the Singleton class
        Singleton single = Singleton.getInstance();
        
        // Call an example method on the instance
        single.showMessage();
    }
}
