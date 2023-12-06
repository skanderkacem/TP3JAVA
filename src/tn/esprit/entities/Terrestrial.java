package tn.esprit.entities;



public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return "Terrestrial{" +
                super.toString() + // Appel de la méthode toString de la classe parente (Animal)
                ", nbrLegs=" + nbrLegs +
                '}';
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial is eating meat.");
        } else {
            System.out.println("Terrestrial doesn't eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial is eating plant.");
        } else {
            System.out.println("Terrestrial doesn't eat this type of food.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial is eating both plant and meat.");
    }
}
