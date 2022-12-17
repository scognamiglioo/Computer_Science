class Exerc03 {

    public static void main(String[] args) {
        int ano = 0, atual = 1, x = 0;
 

        while (atual != 0) {

            atual = MyIO.readInt();
            
            if (atual == 0) {
                break;
            }

            x = ((atual - 10)/76)+1; //ja passou --- 10 ano inicial
            ano = (76*x)+10;
            if (atual==ano) {
                ano += 76;
            }
            System.out.print(ano);

        }
    }
}