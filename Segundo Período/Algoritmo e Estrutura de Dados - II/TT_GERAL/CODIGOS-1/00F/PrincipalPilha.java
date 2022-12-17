 class PrincipalPilha {
    public static void main(String[] args) {
        try {
            System.out.println(" ==== PILHA FLEXIVEL ====");
            Pilha pilha = new Pilha();
            int x1=0;
            int x2=0;
            int x3=0;

            int resp=0;
            System.out.println("------------MENU------------");
            System.out.println("1-Inserir");
            System.out.println("2-Remover");
            System.out.println("3-Listar");
            System.out.println("4-Sair");
            resp=MyIO.readInt();

            switch (resp){
                case 1:
                pilha.inserir(0);
                pilha.inserir(1);
                pilha.inserir(2);
                pilha.inserir(3);
                pilha.inserir(4);
                pilha.inserir(5);
                break;

                case 2:

                x1 = pilha.remover();
                x2 = pilha.remover();
                x3 = pilha.remover();
                System.out.print("Apos as remocoes (" + x1 + "," + x2 + "," + x3 + "): ");
                pilha.mostrar();

                break;
                case 3:

                System.out.print("Apos insercoes: ");
                pilha.mostrar();
                break;

                case 4:
                break;

            default:
            System.out.print("Erro");
            }



        }
        catch(Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}