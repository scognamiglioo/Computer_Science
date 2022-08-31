import java.util.Random;

public class altalt {
    public static boolean isFim(String s) { return s.compareTo("FIM") == 0; }

    public static String randomString(String s, char w, char z) {
        char[] aux = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(aux[i] == w) {
                aux[i] = z;
            }
        }

        return String.valueOf(aux);
    }


    public static void main(String[] args) {
        MyIO.setCharset("utf-8");
        String entrada = "";
        Random gerador= new Random(); //Cria um gerador e a semente indicada (4 neste caso)
        gerador.setSeed(4);
        char w;
        char z;

        entrada = MyIO.readLine();

        while(true){

            if(isFim(entrada) == true) {
                break;
            }
            w=(char)('a'+(Math.abs(gerador.nextInt())%26)); 
            z=(char)('a'+(Math.abs(gerador.nextInt())%26));

            System.out.println(randomString(entrada,w,z));
            entrada = MyIO.readLine();
        }


    }
}
