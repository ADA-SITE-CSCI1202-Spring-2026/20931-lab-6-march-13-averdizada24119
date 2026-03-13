public class Dog extends Animal {

    private String breed;

    // Constructor
    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age); // calls Animal constructor (with age validation)
        this.breed = breed;
    }

    // Getter & Setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString
    @Override
    public String toString() {
        return "Dog{" +
                "animalName='" + getAnimalName() + '\'' +
                ", ownerName='" + getOwnerName() + '\'' +
                ", age=" + getAge() +
                ", breed='" + breed + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Dog other = (Dog) obj;
        return breed.equals(other.breed);
    }
}
