 import java.util.Scanner;
public class GestionNotes {
    public static void main (String[] args ) {
        final double POIDS_DEVOIR = 0.4 ;
        final double POIDS_EXAMEN = 0.6 ;

        final int COEF_ALGORITHME = 3;
        final int COEF_BASE_DONNEES = 2;
        final int COEF_ANGLAIS = 1;
        System.out.println("==========================");
        System.out.println("   RELEVÉ DE NOTES - L2");
        System.out.println("==========================");
        Scanner clavier = new Scanner(System.in);
        System.out.print(" Prenom :");
        String prenom = clavier.nextLine();
        System.out.print("Nom :");
        String nom = clavier.nextLine();
        System.out.print(" Age :");
        int age = clavier.nextInt();
        clavier.nextLine();
        System.out.print(" Matricule :");
        String matricule = clavier.nextLine();



        System.out.print("Donner la note du devoir d'algorithme");
         double devoirAlgo = clavier.nextDouble();
        System.out.print("Donner la note d'examen d'algorithme");
        double examenAlgo = clavier.nextDouble();
        System.out.print("Donner la note du devoir de base de donnee");
        double devoirBase = clavier.nextDouble();
        System.out.print("Donner la note d'examen de base de donnee");
        double examenBase = clavier.nextDouble();
        System.out.print("Donner la note du devoir d'anglais");
        double devoirAnglais = clavier.nextDouble();
        System.out.print("Donner la note d'examen anglais");
        double examenAnglais = clavier.nextDouble();

        double moyenneAlgo = devoirAlgo * POIDS_DEVOIR + examenAlgo *POIDS_EXAMEN ;
        double moyenneBase = devoirBase * POIDS_DEVOIR + examenBase *POIDS_EXAMEN ;
        double moyenneAnglais = devoirAnglais * POIDS_DEVOIR + examenAnglais *POIDS_EXAMEN ;

        int sommecoefs = COEF_ALGORITHME + COEF_ANGLAIS + COEF_BASE_DONNEES ;

        double moyenneGenerale = (moyenneAlgo * COEF_ALGORITHME
                + moyenneBase * COEF_BASE_DONNEES
                + moyenneAnglais * COEF_ANGLAIS) / sommecoefs;

        System.out.println();

        System.out.println("Etudiant : " + prenom + " " + nom
                + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);

        System.out.println("------------------------------");

        System.out.printf("Algorithmique (coef %d) : %.2f%n",
                COEF_ALGORITHME, moyenneAlgo);

        System.out.printf("Base de donnees (coef %d) : %.2f%n",
                COEF_BASE_DONNEES, moyenneBase);

        System.out.printf("Anglais (coef %d) : %.2f%n",
                COEF_ANGLAIS, moyenneAnglais);

        System.out.println("------------------------------");

        System.out.printf("Moyenne generale : %.2f / 20%n",
                moyenneGenerale);

        clavier.close();
    }
}