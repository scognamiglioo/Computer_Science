import java.util.Scanner;

class Exerc04 {
    public static void main(String[] args) {
    Scanner mem = new Scanner(System.in);

    String write, guarda, write2, copia;

    System.out.println("Digite o nome do arquivo: ");
    write=mem.nextLine(); // ate a quebra de linha
    
    System.out.println("Conteudo do arquivo: ");
    guarda=mem.nextLine();

    System.out.println("Digite o nome do arquivo dois: ");
    write2=mem.nextLine(); // ate a quebra de linha

    Arq.openWrite(write);
    Arq.println(guarda);
    Arq.close();

    Arq.openRead(write);
    copia = Arq.readAll();
    Arq.close();
    
    Arq.openWrite(write2);
    Arq.println(copia.toUpperCase());
    Arq.close();
    
}

}