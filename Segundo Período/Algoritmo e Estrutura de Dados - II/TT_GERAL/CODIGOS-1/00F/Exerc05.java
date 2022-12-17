import java.util.Scanner;

class Exerc05 {
    public static void main(String[] args) {
    Scanner arq = new Scanner(System.in);

    String write, guarda, write2, copia;

    System.out.println("Digite o nome do arquivo: ");
    write=arq.nextLine(); // ate a quebra de linha
    
    System.out.println("Conteudo do arquivo: ");
    guarda=arq.nextLine();

    System.out.println("Digite o nome do arquivo dois: ");
    write2=arq.nextLine(); // ate a quebra de linha

    Arq.openWrite(write);
    Arq.println(guarda);
    Arq.close();

    Arq.openRead(write);
    copia = Arq.readAll();
    Arq.close();

    Arq.openWrite(write2);
    Arq.println(copia);
    Arq.close();
    
    System.out.println("DENTRO DO ARQUIVO ----------- " + copia);
    
    System.out.println("DENTRO DO ARQUIVO ----------- " + copia.toUpperCase());
    
}

}