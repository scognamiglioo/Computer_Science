import java.util.Scanner; 

public class Exerc10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        long pos, i = 0, prim = 1, ant = 0, atual = 0;

        System.out.println("Posicao: ");
        pos = input.nextInt();

        while (i < pos) {
            atual = prim + ant;
            prim = ant;
            ant = atual;

            i++;
        }
        System.out.println("> " + atual);


    }
}
