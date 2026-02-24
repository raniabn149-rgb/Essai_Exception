import java.util.InputMismatchException;
import java.util.Scanner;

public class EssaiException {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        try {
            System.out.print("Donner a : ");
            int a = clavier.nextInt();

            System.out.print("Donner b : ");
            int b = clavier.nextInt();

            int res = a / b;
            System.out.println("Le résultat de " + a + " divisé par " + b + " est " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro !");
        }
        catch (InputMismatchException e) {
            System.out.println("Erreur : veuillez saisir des nombres entiers !");
        }
        finally {
            System.out.println("Le bloc finally sera toujours exécuté");
            clavier.close();
        }

        System.out.println("Fin du programme");
    }
}