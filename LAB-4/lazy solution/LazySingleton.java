public class LazySingleton {
    // Private static variable of the instance
    private static volatile LazySingleton instance;

    // Private constructor to prevent instantiation
    private LazySingleton() {}

    // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Lazy Singleton!");
    }
}