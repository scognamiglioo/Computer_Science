
//questao 01 
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("LADO 1: ");
        int a = input.nextInt();
        System.out.println("LADO 2: ");
        int b = input.nextInt();
        System.out.println("LADO 3: ");
        int c = input.nextInt();

        if ((a == b) && (a == c) && (b == c)) {
            System.out.println("O TRIANGULO É EQUILATERO");
        } else if ((a == b) && (a != c) && (b != c) || (a != b) && (a == c) && (b != c) || (a != b) && (a != c) && (b == c) ) {
            System.out.println("O TRIANGULO É ISOCELES");
        } else if ((a != b) && (a != c) && (b != c)) {
            System.out.println("O TRIANGULO É ESCALENO");
        }
    }


}
