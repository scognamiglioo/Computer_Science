import java.util.Scanner;

class ABBusca {
    public static class No {
        public int elemento; //cria elemento
        public No esq, dir; //cria no (ponteiros)

        public No(int elemento) {
            this(elemento, null, null); //passa o elemento e "ponteiros" nulos
        }

        public No(int elemento, No esq, No dir) {
            this.elemento = elemento;
            this.esq = esq;
            this.dir = dir;
        }
    }

    public static class ArvoreBinaria {
        private No raiz; //raiz é criada

        public ArvoreBinaria() {
            raiz = null; 
        }
        public boolean pesquisar(int x) {
            return pesquisar(x, raiz);
        }

        public boolean pesquisar(int x, No i) {
            boolean resp;

            if(i == null) {
                resp = false;
            }

            else if (x == i.elemento) {
                resp = true;
            } 

            else if (x < i.elemento) {
                resp = pesquisar(x, i.esq);
            }

            else {
                resp = pesquisar(x, i.dir);
            }

            return resp;
        } 

        public void caminharCentral() {
            caminharCentral(raiz);
            System.out.println("");
        }

        public void caminharCentral(No i) {
            if (i != null) {
                caminharCentral(i.esq);   
                System.out.print(i.elemento + " ");
                caminharCentral(i.dir);
            }
        }

        public void caminharPre() {
            caminharPre(raiz);
            System.out.println("");
        }

        public void caminharPre(No i) {
            if (i != null) {   
                System.out.print(i.elemento + " ");
                caminharPre(i.esq);
                caminharPre(i.dir);
            }
        }


        public void caminharPos() {
            caminharPos(raiz);
            System.out.println("");
        }

        public void caminharPos(No i) {
            if (i != null) {
                caminharPos(i.esq); 
                caminharPos(i.dir);  
                System.out.print(i.elemento + " ");  
            }
        }

        public void inserir(int x) throws Exception {
            raiz = inserir(x, raiz);
        }

        private No inserir (int x, No i) throws Exception {
            if (i == null) {
                i = new No(x);
            }
            else if (x < i.elemento) {
                i.esq = inserir(x, i.esq);
            } 
            else if (x > i.elemento) {
                i.dir = inserir(x, i.dir);
            }

            else {
                throw new Exception("Erro ao inserir!");
            }

            return i;
        }

        public int getRaiz() throws Exception {
            return raiz.elemento;
        }
    }

        public static void main (String args[]) throws Exception {
            Scanner sc = new Scanner (System.in);

            int n = Integer.parseInt(sc.nextLine().trim()); //le o primeiro numero 

            for (int i = 0; i < n; i++){
                ArvoreBinaria tree = new ArvoreBinaria();
                String aux = sc.nextLine().trim(); //qauntidade de numeros

                String corta = sc.nextLine();

                String[] array = corta.split(" ");

                for (int j = 0; j < Integer.parseInt(aux); j++) {
                    tree.inserir(Integer.parseInt(array[j])); //inserindo valor de cada espaço
                }

                System.out.println("Case " + (i + 1) + ":");
                System.out.print("Pre.: ");
                tree.caminharPre();
                System.out.print("In..: ");
                tree.caminharCentral();
                System.out.print("Post: ");
                tree.caminharPos();
                System.out.println("");
            }

            sc.close();
        } 
}