 import java.util.Scanner;
public class GestionNotes {
    public static void main (String[] args ) {
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