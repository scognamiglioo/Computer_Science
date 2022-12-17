import java.util.Scanner;
class Exerc01 {
    public static void main (String[] args) {
     //System.out.println(); ------ printa um valor (printf)
     //Scanner oi = new Scanner(System.in); ---- cria um scanf 
    Scanner oi = new Scanner(System.in);

    String write, guarda; 

    System.out.println("Digite o nome do arquivo: ");
    write=oi.nextLine(); // ate a quebra de linha

    System.out.println("Digite uma frase: ");
    guarda=oi.nextLine();

    Arq.openWrite(write); //abriu colocou o nome
    Arq.println(guarda); // pega o conteudo digitado coloca no arquivo

    Arq.close();

    
    }
}