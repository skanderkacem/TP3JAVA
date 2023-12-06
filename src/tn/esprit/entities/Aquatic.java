package tn.esprit.entities;
import java.util.Objects;
public class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "Aquatic{" +
                super.toString() + // Appel de la méthode toString de la classe parente (Animal)
                ", habitat='" + habitat + '\'' +
                '}';
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic aquatic = (Aquatic) o;
        return age == aquatic.age && Objects.equals(name, aquatic.name) && Objects.equals(habitat, aquatic.habitat);
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic is eating meat.");
        } else {
            System.out.println("Aquatic doesn't eat this type of food.");
        }
    }

}
