import java.util.Scanner;

class Exerc07 {
    public static void main(String[] args) {
    Scanner mem = new Scanner(System.in);

    String write, cont, guarda, cripto = "";

    System.out.println("Nome do arquivo: ");
    write = mem.nextLine();

    System.out.println("Digite uma frase: ");
    guarda=mem.nextLine();

    Arq.openWrite(write);
    Arq.println(guarda);
    Arq.close();

    Arq.openRead(write);
    cont = Arq.readAll();
    Arq.close();

    
    for (int i = 0; i < cont.length(); i++) { // roda ate terminar o numero de palavras e acrescenta uma letra de acordo com o que vai rodando 
      
        cripto = cripto + (char)(cont.charAt(i)+3);  // adicionando as palavras e lendo letra por letra. o (char) é para converter ascii para char uma vez que com +3 entende como operaçao
    }

    System.out.println("Em cesar: " + cripto);
}

}
