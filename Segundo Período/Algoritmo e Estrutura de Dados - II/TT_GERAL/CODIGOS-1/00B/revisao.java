class revisao {
    public static boolean questUm(int[] array, int x) { // declara variavel

      boolean resp = false; // inicia assim
      int n = array.length;

      for(int i = 0; i < n; i++){
         if(array[i] == x){
            resp = true; // se acontecer passa a ser true 
            i = n;
         }
      }
      return resp;
   }

    public static boolean questDois(int[] array, int x) {  // declara variavel
      boolean resp = false;
      int dir = (array.length - 1), esq = 0, meio;

      while (esq <= dir){
         meio = (esq + dir) / 2;
         if(x == array[meio]){
            resp = true;
            esq = dir + 1;
         } else if (x > array[meio]) {
            esq = meio + 1;
         } else {
            dir = meio - 1;
         }
      }
      return resp;
   }
   
    public static String questTres(int[] array) {
        int maior = array[0], menor = array[0];

        for (int x = 0; x != array.length; x++) {
            if (array[x] < array[menor]) {
                menor = x;
            } 
            if (array[x] > array[maior]) {
                maior = x;
            }
        }
        
        return "Maior: " + array[maior] + " ----- Menor: " + array[menor];
    }

    public static String questQuatro(int[] array) {
        int maior = array[0], menor = array[0];

        for (int x = 0; x != array.length; x++) {
            if (array[x] < array[menor]) {
                menor = x;
            } 
            if (array[x] > array[maior]) {
                maior = x;
            }
        }
        
        return "Maior: " + array[maior] + " ----- Menor: " + array[menor];
    }



    public static char toUpper(char c){
    return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) : c ;
    }

    public static boolean isVogal (char c){
    c = toUpper(c);
    return (c =='A' || c =='E' || c =='I' || c =='O' || c =='U');
    }


    public static boolean questSeis(String c) {
        for (int i = 0; i != c.length(); i++) {
            if (isVogal(c.charAt(i)))
            return false;
        }
        return true;
    }
   
//---------------------------------------------------------------------------------------------------//






public static void main (String[] args){
      int[] array = {2, 3, 5, 7, 9, 11, 15, 17, 20, 21, 30, 43, 49, 70, 71, 82};
      int x = 11;
      int z = 6, y = 7; 
      int g = 23, h = 23;

      System.out.println("1: " + questUm(array, x));
      System.out.println("2: " + questDois(array, x));
      System.out.println("3: " + questTres(array));
      System.out.println("4: " + questQuatro(array));
      System.out.println("5: Ele compara se há vogais ");
      System.out.println("6: " + questSeis("Julia"));
      System.out.println("7: O codigo é pouco limpo e cheio de informações que poderiam ser reduzidas ");
      System.out.println("8a: z-- = " + (z--) + " // z =" + (z) + "// ou seja, primeiro coloca o valor da vairavel e depois retira -1 do valor inicial.");
      System.out.println("8b: --y = " + (--y) + " // y =" + (y) + " // ou seja, ele diminui -1 do valor inicial da variavel e ela passa a valer este valor.");
      System.out.println("9: O programa da erros pois o while não tem loop infinito. " );
      System.out.println("10: [" + (g << 1) + "-" + (h >> 1) + "]  // deslocam os bytes e alteram o numero apos passar na JVM");
   }
}