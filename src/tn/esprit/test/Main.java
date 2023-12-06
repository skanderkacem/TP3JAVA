package tn.esprit.test;
import tn.esprit.entities.*;



public class Main {
    public static void main(String[] args) {
        Aquatic aquaticAnimal = new Aquatic("AquaticFamily", "Aquatic", 10, true, "Habitat");

        // Animal terrestre
        Terrestrial terrestrialAnimal = new Terrestrial("TerrestrialFamily", "Terrestrial", 5, true, 4);

        // Dauphin (Dolphin)
        Dolphin dolphin = new Dolphin("DolphinFamily", "Dolphin", 10, true, "mer", 22.5f);

        // Pingouin (Penguin)
        Penguin penguin = new Penguin("PenguinFamily", "Penguin", 16, true, "terre", 33.0f);

        // Afficher les informations des animaux
        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();
        // Créer des animaux
        Animal tigre = new Animal("Félin", "tigre", 6, true);
        Animal elephant = new Animal("Mammifère", "Éléphant", 11, true);
        Animal crocodile = new Animal("Reptile", "Crocodile", 9, false);

        // Créer un zoo
        Zoo myZoo = new Zoo("tn.esprit.entities.Zoo", "Ariana");

        try {
            // Ajouter des animaux au zoo
            myZoo.addAnimal(tigre);
            myZoo.addAnimal(elephant);
            myZoo.addAnimal(crocodile);

            // Afficher des informations sur le zoo
            myZoo.displayZoo();

            // Afficher la liste des animaux dans le zoo
            myZoo.displayAnimals();

            // Essayer d'ajouter un animal avec un âge négatif
            Animal invalidAgeAnimal = new Animal("Mammifère", "Invalid Age Animal", -1, true);
            myZoo.addAnimal(invalidAgeAnimal);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Supprimer un animal du zoo
        myZoo.removeAnimal(elephant);





        // Afficher à nouveau la liste des animaux après la suppression
        myZoo.displayAnimals();

        // Comparer deux zoos
        Zoo anotherZoo = new Zoo("Zoooo", "ArianaSoghra");
        try {
            anotherZoo.addAnimal(new Animal("Oiseau", "Aigle", 3, false));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
// Afficher des informations sur le zoo
        anotherZoo.displayZoo();
        // Afficher la liste des animaux dans le zoo
        anotherZoo.displayAnimals();

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.getName());
        Aquatic aquatic = new Aquatic("AquaticFamily", "Aquatic", 6, true, "Habitat");
        Terrestrial terrestrial = new Terrestrial("TerrestrialFamily", "Terrestrial", 18, true, 4);

        // Test de l'interface Carnivore pour Aquatic
        aquatic.eatMeat(Food.MEAT);  // Output: Aquatic is eating meat.

        // Test de l'interface Omnivore pour Terrestrial
        terrestrial.eatPlant(Food.PLANT);  // Output: Terrestrial is eating plant.
        terrestrial.eatMeat(Food.MEAT);  // Output: Terrestrial is eating meat.
        terrestrial.eatPlantAndMeat(Food.BOTH);
    }
}