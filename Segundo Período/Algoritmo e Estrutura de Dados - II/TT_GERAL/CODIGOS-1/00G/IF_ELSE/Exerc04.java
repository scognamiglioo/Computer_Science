import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CORITHIANS(MANDANTE): ");
        int a = input.nextInt();
        System.out.println("PALMEIRAS(VISITANTE): ");
        int b = input.nextInt();
        
        if (a > b) {
            System.out.println("CORITHIANS MAIOR DO MUNDO ");
        } else  {
            System.out.println("SOU CAMPEAO DO MUNDO VOCE NAO CONSEGUIU PALMEIRAS VAI PARA PUTA QUE PARIU ");
        }
        
    }
}
