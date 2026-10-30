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
        System.out.print("donner le prenom");
        String prenom = clavier.nextLine();
        System.out.print("donner le nom");
        String nom = clavier.nextLine();
        System.out.print("donner l'age");
        int age = clavier.nextInt();
        clavier.nextLine();
        System.out.print("donner le matricule ");
        String matricule = clavier.nextLine();

        System.out.println("Etudiant :" + " " + prenom + " " +   nom + " " + "(" +age + " ans)" );
        System.out.println("Matricule :" + " " +matricule );

        clavier.close();
    }
}