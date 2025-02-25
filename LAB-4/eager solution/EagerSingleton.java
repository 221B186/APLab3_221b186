/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class EagerSingleton {
    // Eagerly create the instance at the time of class loading
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {}

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }
}