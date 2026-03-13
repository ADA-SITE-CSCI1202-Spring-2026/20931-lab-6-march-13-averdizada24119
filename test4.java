public class Main {
    public static void main(String[] args) {

        // --- Valid Animal ---
        Animal cat = new Animal("Whiskers", "Alice", 3);
        System.out.println(cat);

        // --- Valid Dog ---
        Dog dog1 = new Dog("Buddy", "Bob", 5, "Labrador");
        Dog dog2 = new Dog("Buddy", "Bob", 5, "Labrador");
        System.out.println(dog1);

        // --- equals check ---
        System.out.println("dog1 equals dog2: " + dog1.equals(dog2)); // true

        // --- Exception handling: negative age on Animal ---
        try {
            Animal invalid = new Animal("Ghost", "Eve", -2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for Animal: " + e.getMessage());
        }

        // --- Exception handling: negative age on Dog ---
        try {
            Dog badDog = new Dog("Rex", "Tom", -5, "Poodle");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for Dog: " + e.getMessage());
        }

        // --- Exception handling: using setter ---
        try {
            dog1.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception on setAge(): " + e.getMessage());
        }
    }
}
