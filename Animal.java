public class Animal {

    private String animalName;
    private String ownerName;
    private int age;

    // Constructor
    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        setAge(age); // use setter to trigger validation
    }

    // Getters & Setters
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative. ");
        }
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", age=" + age +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Animal other = (Animal) obj;
        return age == other.age &&
                animalName.equals(other.animalName) &&
                ownerName.equals(other.ownerName);
    }
}
