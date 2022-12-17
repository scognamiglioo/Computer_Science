import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("A: ");
        int a = input.nextInt();
        System.out.println("B: ");
        int b = input.nextInt();
        System.out.println("C: ");
        int c = input.nextInt();

        int maior, menor;

        //menor
        if (a < b) {
            if (a < c) {
                menor = a; 
            }else {
                menor = c;
            } 
        } else {
            if (b < c) {
                menor = b;
            } else {
                menor = c;
            }
        }

        //maior 
        if (a > b) {
            if (a > c) {
                maior = a;
            }else {
                maior = c;
            }
        } else {
            if (b > c) {
                maior = b;
            } else {
                maior = c;
            }
        }

        System.out.println("MENOR: " + menor + " MAIOR: " + maior);

    }
}
