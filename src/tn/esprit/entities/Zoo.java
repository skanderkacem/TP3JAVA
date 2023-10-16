package tn.esprit.entities;

public class Zoo {

    Animal[] animals;
    String name, city;
    final int nbrCages=25;

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

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("tn.esprit.entities.Animal already exists in the zoo.");
            return false;
        }

        if (isZooFull()) {
            System.out.println("The zoo is already full. Cannot add more animals.");
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
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
}