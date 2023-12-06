import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList S = new SocieteArrayList();
        Employee e1 = new Employee(1, "kacem", "skander", "J", 16);
        Employee e2 = new Employee(2, "gassem", "skandar", "G", 13);
        Employee e3 = new Employee(3, "gacem", "ska", "A", 15);
        Employee e4 = new Employee(4, "kacm", "skon", "M", 18);

        S.ajouterEmploye(e4);
        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println(S.rechercherEmploye(e1));
        S.displayEmploye();
        System.out.println("\n");
        S.supprimerEmploye(e1);
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("kacm"));
        System.out.println("\n");
        S.trierEmployeParId();
        S.displayEmploye();
        System.out.println("\n");
        S.trierEmployeParNomDepartementEtGrade();
        S.displayEmploye();


        DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(3, "J", 15));
        D.ajouterDepartement(new Departement(2, "B", 15));
        D.ajouterDepartement(new Departement(1, "D", 15));
        D.displayDepartement();
        System.out.println(D.rechercherDepartement("J"));
        System.out.println(D.trierDepartementById());


        AffectationHashMap AHM = new AffectationHashMap();
        Departement d1 = new Departement(1, "J", 10);
        Departement d2 = new Departement(2, "G", 10);

        AHM.ajouterEmployeDepartement(e1, d1);
        AHM.ajouterEmployeDepartement(e2, d1);
        AHM.ajouterEmployeDepartement(e3, d2);
        AHM.afficherEmployesEtDepartements();
        AHM.supprimerEmploye(e2);
        AHM.afficherEmployes();
        AHM.afficherDepartments();
        System.out.println(AHM.rechercherEmploye(e2));
        System.out.println(AHM.rechercherDepartement(d1));
        System.out.println(AHM.trierMap());
        AHM.supprimerEmployeEtDepartement(e3, d2);
        AHM.afficherEmployesEtDepartements();


        List<Etudiant> etudiants = new ArrayList<>();
        EtudiantManagement EM = new EtudiantManagement();
        Etudiant ee1 = new Etudiant(1, "skander", 21);
        Etudiant ee2 = new Etudiant(2, "skandar", 22);
        Consumer<Etudiant> con = etudiant -> System.out.println(etudiant.toString());
        Predicate<Etudiant> pre = etudiant -> etudiant.getNom().startsWith("s");
        Function<Etudiant, String> fun = Etudiant::getNom;
        Supplier<Etudiant> sup = Etudiant::new;
        Comparator<Etudiant> comp = Comparator.comparingInt(Etudiant::getId);

        EM.addEtudiant(etudiants, ee2);
        EM.addEtudiant(etudiants, ee1);

        System.out.println("cool!");
    }
}