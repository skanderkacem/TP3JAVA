package tn.esprit.entities;

public class Zoo {

    Animal[] animals;
    String name, city;
    final int nbrCages=25;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    int nbrAnimals;

    public Zoo() {
        animals = new Animal[nbrCages];
    }

    public Zoo(String name, String city) {


        animals = new Animal[this.nbrCages];
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    // Setter pour le nom du zoo avec validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom d'un zoo ne peut pas être vide.");
        }
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (searchAnimal(animal) != -1) {
            throw new ZooFullException("L'animal existe déjà dans le zoo.");
        }

        if (isZooFull()) {
            throw new ZooFullException("Le zoo est déjà plein. Impossible d'ajouter plus d'animaux.");
        }

        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }


    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }
    public void makeAquaticAnimalsSwim() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }
    boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {

            return z1;
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int numDolphins = 0;
        int numPenguins = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                numDolphins++;
            } else if (aquatic instanceof Penguin) {
                numPenguins++;
            }
        }
        System.out.println("Number of Dolphins: " + numDolphins);
        System.out.println("Number of Penguins: " + numPenguins);
    }


}