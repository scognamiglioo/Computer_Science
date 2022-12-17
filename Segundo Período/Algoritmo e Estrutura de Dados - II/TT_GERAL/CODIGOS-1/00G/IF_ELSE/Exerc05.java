import java.util.Scanner; 
/* O banco do Zé abriu uma linha de crédito para os seus clientes. O valor 
máximo da prestação não poderá ultrapassar 40% do salário bruto. Fazer 
um algoritmo que permita entrar com o salário bruto e o valor da prestação 
e informar se o empréstimo será concedido. */

public class Exerc05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o salario bruto: ");
        int a = input.nextInt();
        System.out.println("Prestaçao: ");
        int parc = input.nextInt();

        double porc;
        porc = (double)(0.40)*a;

        System.out.println("Condição para conceder o emprestimo resultou em : " + porc);
        
        if (porc >= parc) {
            System.out.println("Emprestimo concedido ");
        } else if (porc <= parc)  {
            System.out.println("Emprestimo negado ");
        }
    }
}