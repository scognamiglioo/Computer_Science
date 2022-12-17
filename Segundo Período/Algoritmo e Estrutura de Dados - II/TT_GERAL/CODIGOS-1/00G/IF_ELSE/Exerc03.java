import java.util.Scanner;
/*• Leia dois números. Se um deles for maior que 45, realize a soma dos 
mesmos. Caso contrário, se os dois forem maior que 20, realize a subtração 
do maior pelo menor, senão, se um deles for menor do que 10 e o outro 
diferente de 0 realize a divisão do primeiro pelo segundo. Finalmente, se 
nenhum dos casos solicitados for válido, mostre seu nome na tela.
*/

public class Exerc03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("A: ");
        int a = input.nextInt();
        System.out.println("B: ");
        int b = input.nextInt();

        if ((a > 45) || (b > 45)) {
            int soma;
            soma = a + b;
            System.out.println("RESULTADO: " + soma);
        } else if ((a > 20) && (b > 20)) {
            int maior, menor;

            //menor
            if (a < b) {
                menor = b;
            } else {
                menor = a;
            }
    
            //maior 
            if (a > b) {
                maior = a;
            } else {
                maior = b;
            }
            
            int sub;
            sub = maior - menor;
            System.out.println("RESULTADO: " + sub);
        } else if ((a < 10) && (b != 0) || (a != 0 ) && (b < 10) ) {
            int div;
            div = a/b;
            System.out.println("RESULTADO: " + div);
        } else {
            System.out.println("PAULINHA COQUEIRA ");
        }

    }
}
