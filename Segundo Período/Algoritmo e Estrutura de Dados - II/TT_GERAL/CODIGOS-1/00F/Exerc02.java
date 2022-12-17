import java.util.Scanner;

class Exerc02 {
     public static void main(String[] args) {
    Scanner arq = new Scanner(System.in);

    String write, guarda;

    System.out.println("Digite o nome do arquivo: ");
    write=arq.nextLine(); // ate a quebra de linha
    
    System.out.println("Conteudo do arquivo: ");
    guarda=arq.nextLine();

    Arq.openWrite(write);
    Arq.println(guarda);

    Arq.close();

    String mostra; // para mostrar

    Arq.openRead(write); // para ler 

    mostra = Arq.readAll(); // ele vai atribuir ao mostra 

    Arq.close();

    System.out.println("DENTRO DO ARQUIVO ----------- " + mostra);




}

}