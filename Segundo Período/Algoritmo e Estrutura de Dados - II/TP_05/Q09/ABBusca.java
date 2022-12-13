import java.util.Scanner;

class ABBusca {
    public static class No {
        public char elemento;
        public No esq, dir;

        public No(char elemento) {
            this(elemento, null, null);
        }

        public No(char elemento, No esq, No dir) {
            this.elemento = elemento;
            this.esq = esq;
            this.dir = dir;
        }
    }

    public static class ArvoreBinaria {
        private No raiz;

        public ArvoreBinaria() {
            raiz = null;
        }

        public boolean pesquisar(char x) {
            return pesquisar(x, raiz);
        }

        private boolean pesquisar(char x, No i) {
            boolean resp;
            if (i == null) {
                resp = false;

            } else if (x == i.elemento) {
                resp = true;

            } else if (x < i.elemento) {
                resp = pesquisar(x, i.esq);

            } else {
                resp = pesquisar(x, i.dir);
            }
            return resp;
        }

        public void caminharCentral() {
            caminharCentral(raiz);
            System.out.println("");
        }

        private void caminharCentral(No i) {
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

        private void caminharPre(No i) {
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

        private void caminharPos(No i) {
            if (i != null) {
                caminharPos(i.esq);
                caminharPos(i.dir);
                System.out.print(i.elemento + " ");
            }
        }

        public void inserir(char x) throws Exception {
            raiz = inserir(x, raiz);
        }

        private No inserir(char x, No i) throws Exception {
            if (i == null) {
                i = new No(x);

            } else if (x < i.elemento) {
                i.esq = inserir(x, i.esq);

            } else if (x > i.elemento) {
                i.dir = inserir(x, i.dir);

            } else {
                throw new Exception("Erro ao inserir!");
            }

            return i;
        }
    }
        public static void main (String args[]) throws Exception {
            Scanner sc = new Scanner (System.in);
            ArvoreBinaria arvore = new ArvoreBinaria();
            
            String entrada;
            char inicial, resultado; 

            while (sc.hasNext()) {
                entrada = sc.nextLine();
                inicial = entrada.charAt(0);
                resultado = entrada.charAt(2);

                if (inicial == 'I' && entrada.charAt(1) == ' ') {
                    arvore.inserir(resultado);
                } else if (inicial == 'P' && entrada.charAt(1) == ' ') {
                    if (arvore.pesquisar(resultado)) {
                        System.out.println(resultado + " existe");
                    } else {
                        System.out.println("nao existe");
                    }
                } else if (inicial == 'I' && resultado == 'F') {
                    arvore.caminharCentral();
                }
                else if (inicial == 'P' && resultado == 'E') {
                    arvore.caminharPre();
                }
                else if (inicial == 'P' && resultado == 'S') {
                    arvore.caminharPos();
                }
            }

            sc.close();
        } 
}