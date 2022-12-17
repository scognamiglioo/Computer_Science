import java.util.Scanner; 

public class Exerc06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i=0;
        int[] numero = new int[10];

        for ( i=0; i < numero.length; i++) {
            System.out.println("Numero: ");
            numero[i] = input.nextInt();

        } 
        for ( i=0; i < numero.length; i++) {
            if (numero[i] >= 0) {
                System.out.println(">  " + numero[i]);
            }

        }   


    }
}
