class Main {  // Removed the 'public' modifier here
    int age;
    String name;

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Main m1 = new Main();

        // Set the name and age before printing
        m1.setName("Jahanvi");
        m1.setAge(20);

        // Print both the name and the age
        System.out.println(m1.getName() + " " + m1.getAge());  // Output: Jahanvi 20
    }
}
