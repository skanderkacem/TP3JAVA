package tn.esprit.entities;

public class Animal {

    String family, name;
    int age;
    boolean isMammal;
    String test;

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public int getAge() {
        return age;
    }

    // Setter pour l'âge avec validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge d'un animal ne peut pas être négatif.");
        }
    }

    @Override
    public String toString() {
        return "tn.esprit.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
