/**
 * Represents a Dog with various attributes and behaviors.
 */
public class Dog {
    // Instance variables
    private String name;
    private String breed;
    private int age;
    private double weight;
    private boolean isTrained;
    private Owner owner; // Object from a secondary class

    // Overloaded constructors
    /**
     * Default constructor to create a Dog object with default values.
     */
    public Dog() {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
        this.weight = 0.0;
        this.isTrained = false;
        this.owner = new Owner(); // Default owner
    }

    /**
     * Parameterized constructor to create a Dog object with specific values.
     * 
     * @param name      The name of the dog.
     * @param breed     The breed of the dog.
     * @param age       The age of the dog.
     * @param weight    The weight of the dog.
     * @param isTrained Whether the dog is trained.
     * @param owner     The owner of the dog.
     */
    public Dog(String name, String breed, int age, double weight, boolean isTrained, Owner owner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.isTrained = isTrained;
        this.owner = owner;
    }

    // Accessor (getter) and mutator (setter) methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Behavior methods
    /**
     * Makes the dog bark.
     */
    public void bark() {
        System.out.println(name + " is barking!");
    }

    /**
     * Makes the dog fetch an item.
     * 
     * @param item The item to fetch.
     */
    public void fetch(String item) {
        System.out.println(name + " is fetching the " + item + "!");
    }

    /**
     * Makes the dog eat.
     */
    public void eat() {
        System.out.println(name + " is eating.");
    }

    /**
     * Makes the dog perform a trick.
     * 
     * @param trick The trick to perform.
     */
    public void performTrick(String trick) {
        System.out.println(name + " is performing the trick: " + trick + "!");
    }

    /**
     * Returns a string representation of the Dog object.
     * 
     * @return A string describing the dog.
     */
    @Override
    public String toString() {
        return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", weight=" + weight + ", isTrained="
                + isTrained + ", owner=" + owner + "]";
    }
}

/**
 * Represents the Owner of a Dog.
 */
class Owner {
    private String name;
    private String address;

    /**
     * Default constructor to create an Owner object with default values.
     */
    public Owner() {
        this.name = "Unknown";
        this.address = "Unknown";
    }

    /**
     * Parameterized constructor to create an Owner object with specific values.
     * 
     * @param name    The name of the owner.
     * @param address The address of the owner.
     */
    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Accessor (getter) and mutator (setter) methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the Owner object.
     * 
     * @return A string describing the owner.
     */
    @Override
    public String toString() {
        return "Owner [name=" + name + ", address=" + address + "]";
    }
}