package tn.esprit.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat); // Appeler le constructeur de la classe parente
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Dolphin{" +
                super.toString() + // Appel de la méthode toString de la classe parente (Aquatic)
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    // Getters et setters pour l'attribut spécifique à Dolphin
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
