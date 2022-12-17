import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, menor;

        System.out.println("Numero: ");
        n = input.nextInt();
        
        int vet[] = new int[n];

        for (int i = 0; i < n; i++){
            vet[i] = input.nextInt(); 
        }

        menor = vet[0];

        for (int i = 1; i < n; i++){

            if (vet[i] < menor){
            menor = vet[i];
        }
       }
            System.out.println("Menor :" + menor);


    }
}



