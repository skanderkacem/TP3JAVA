public class Main {
    public static void main(String[] args) {
        // Créer des animaux
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Mammifère", "Éléphant", 10, true);
        Animal crocodile = new Animal("Reptile", "Crocodile", 8, false);

        // Créer un zoo
        Zoo myZoo = new Zoo("Mon Zoo", "Nabeul");

        // Ajouter des animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(crocodile);

        // Afficher des informations sur le zoo
        myZoo.displayZoo();

        // Afficher la liste des animaux dans le zoo
        myZoo.displayAnimals();

        // Supprimer un animal du zoo
        myZoo.removeAnimal(elephant);





        // Afficher à nouveau la liste des animaux après la suppression
        myZoo.displayAnimals();

        // Comparer deux zoos
        Zoo anotherZoo = new Zoo("Zoo2", "Tunis");
        anotherZoo.addAnimal(new Animal("Oiseau", "Aigle", 3, false));
// Afficher des informations sur le zoo
        anotherZoo.displayZoo();
        // Afficher la liste des animaux dans le zoo
        anotherZoo.displayAnimals();

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.name);
    }
}