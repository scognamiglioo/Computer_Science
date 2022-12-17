import java.util.Scanner; 
/*• Faça um programa que leia um número inteiro N e mostre na tela os N 
primeiros números da sequência 1, 5, 12, 16, 23, 27 34.
                               0  1  2   3   4
*/
public class Exerc08 {
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        int num, cont=0, seq=1;

        System.out.println("Numero: ");
        num = input.nextInt();

        while (cont < num) {
            if (cont % 2 == 0) {
                System.out.println(" " + seq);
                seq += 4;
            } else {
                System.out.println(" " + seq);
                seq += 7;
            }
            cont ++;
        }


}
}