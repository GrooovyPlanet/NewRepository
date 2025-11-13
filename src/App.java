public class App {
    public static void main(String[] args) throws Exception {
         // Create objects using both constructors
        Dog dog1 = new Dog(); // Default constructor
        Owner owner = new Owner("John Doe", "123 Main St");
        Dog dog2 = new Dog("Buddy", "Golden Retriever", 3, 30.5, true, owner); // Parameterized constructor

        // Print each object using System.out.println()
        System.out.println(dog1);
        System.out.println(dog2);

        // Call one behavior method with parameters on each object
        dog1.fetch("ball");
        dog2.performTrick("roll over");

        // Call one behavior method without parameters on each object
        dog1.bark();
        dog2.eat();
    }
}
