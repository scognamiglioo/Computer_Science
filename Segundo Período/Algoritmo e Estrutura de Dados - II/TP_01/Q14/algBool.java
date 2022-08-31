class algBool {
    
    public static int inicio(String s) {
        return inicio(s,0);
    }

    //para pegar a quantidade de num que aparece 
    public static int inicio(String s, int posInicial){

        for(int i=posInicial; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                return i;
            }
        
        }
        return 0;
    }

    //verifica 
    public static int fim(String s) {
        int or = s.lastIndexOf("or");
        int not = s.lastIndexOf("not");
        int and = s.lastIndexOf("and");

        if(not > and && not > or) {
            return not;
        } else if (and > not && and > or ) {
            return and;
        } else if(or > and && or > not) {
            return or;
        }

        return 0;
    }

    public static void main(String[] args) {

        while(true) {

            int n = MyIO.readInt(); //leitura quantidade de bi

            if (n == 0) {
                break;
            }

             int[] array = new int[n];

            for (int i=0; i < n; i++) { //leitura/armazena do array 
                array[i] = MyIO.readInt();
            }

            String entrada = MyIO.readLine(); //leitura da string

            entrada = entrada.replace(" ", ""); 


            //tratar not, and, or

            for (int i=0; i < n; i++) {

                if(i == 0) {
                    entrada = entrada.replace("not(A)", array[0] == 0 ? "1" : "0");
                    entrada = entrada.replace("A", array[0] == 0 ? "0" : "1");
                }   
                else if(i == 1) {
                    entrada = entrada.replace("not(B)", array[1] == 0 ? "1" : "0");
                    entrada = entrada.replace("B", array[1] == 0 ? "0" : "1");
                }   
                else if(i == 2) {
                    entrada = entrada.replace("not(C)", array[2] == 0 ? "1" : "0");
                    entrada = entrada.replace("C", array[2] == 0 ? "0" : "1");
                }   
            }


            while (entrada.length() > 1) {
                int ultimo = fim(entrada);
                String aux = entrada.substring(ultimo, entrada.indexOf(")", ultimo) + 1); //lendo ate o )

                if(aux.charAt(0) != 'n') { //diferente de not
                    int cont = 1;
                    for (int i = 0; i < aux.length(); i++) {
                        if (aux.charAt(i) == ','){
                            cont++;

                        }
                    }

                    int[] parAux = new int[cont];
                    int posAux = 0;

                    for  (int i = 0; i < cont; i++) { //armazenar os numeros 
                        posAux = inicio(aux, posAux);
                        String numero = aux.substring(posAux, ++posAux);
                        parAux[i] = Integer.parseInt(numero);
                    }

                    if(aux.charAt(0) == 'a') { //and
                        String tot = "1"; //modifica as letras

                        if(cont == 1) {
                            tot = String.format("%i", parAux[0]);
                        } else {
                            for(int i=0; i < cont; i++) {
                                if(parAux[i] == 0) {
                                 tot = "0"; // retorna 0
                                 break; // error
                                }
                            }
                        }

                        entrada = entrada.replace(aux, tot);
                    } else if(aux.charAt(0) == 'o'){
                        String tot = "0";
                        if(cont == 1) {
                            tot = String.format("%i", parAux[0]);
                        } else {
                            for(int i=0; i < cont; i++) {
                                if(parAux[i] == 1) {
                                 tot = "1"; // retorna 1
                                 break; // error
                                }
                            }
                        }

                        entrada = entrada.replace(aux, tot);
                    } 
                } else {
                    if(aux.equals("not(0)")){
                        entrada = entrada.replace("not(0)", "1");
                    } else if(aux.equals("not(1)")) {
                        entrada = entrada.replace("not(1)", "0");
                    }
                }
            }
            MyIO.println(entrada);
        }
       
    }
}
