package tn.esprit.entities;





public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat); // Appeler le constructeur de la classe parente
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return "Penguin{" +
                super.toString() + // Appel de la méthode toString de la classe parente (Aquatic)
                ", swimmingDepth=" + swimmingDepth +
                '}';
    }
    // Getters et setters pour l'attribut spécifique à Penguin
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}

