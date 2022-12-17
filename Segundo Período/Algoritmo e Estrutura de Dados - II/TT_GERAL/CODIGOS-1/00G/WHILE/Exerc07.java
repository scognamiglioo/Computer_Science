import java.util.Scanner; 

public class Exerc07 {
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        int i=0;
  

        System.out.println("VETOR: ");
        int n = input.nextInt();

        int[] num = new int[n];
        
        for (i=0; i < num.length; i++) {
            System.out.println("Numero: ");
            num[i] = input.nextInt();
        }

        

        }   
    }
}