import java.util.Scanner;

/*• Faça um programa que leia um número inteiro N indicando a nota máxima 
em uma prova P. Em seguida, leia a nota de 20 alunos (entre 0 e N) e 
mostre na tela: (i) a média da turma, (ii) o número de alunos cuja nota foi 
menor que a média da Universidade (suponha 60%) e (iii) a quantidade de 
alunos com conceito A (mais de 90%).
*/

public class Exerc09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int nota,soma,media;
        int[] aluno = new int[20];


        System.out.println("Nota maxima: ");
        nota = input.nextInt();

        for (int i=0; i < 20; i++) {
            System.out.println("Notas: ");
            aluno[i] = input.nextInt();
        }
        for (int i=0; i < 20; i++) {

            soma += aluno[i];
            media = soma/20;
            System.out.println("Media: " + media);

            double uni;
            uni = 0.60;
            if (aluno[i] > (aluno[i]*uni))  {
                System.out.println("Acima da media " + aluno[i]);
            } else {
                System.out.println("Abaixo da media " + aluno[i]);
            }

            if (aluno[i] > (aluno[i]*0.90))  {
                System.out.println("90% > " + aluno[i]);
            } else {
                System.out.println("Abaixo da media " + aluno[i]);
            }

        }

    }
    
}
