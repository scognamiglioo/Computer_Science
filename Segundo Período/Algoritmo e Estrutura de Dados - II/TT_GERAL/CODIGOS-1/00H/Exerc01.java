public class Exerc01 {

    public static int naoVogal(String str, int pos)
    {
        int cont = 0;

        if(str.length() == pos) {
            return cont;
        } 

        char c = str.charAt(pos);

        if(c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            return cont = naoVogal(str, ++pos) + 1;
         } 
        else {
            return cont = naoVogal(str, ++pos);
        } 
    }

    public static int consoM(String str, int pos)   //erro
    {
        int cont = 0;

        if(str.length() == pos) return cont;

        char c = str.charAt(pos);

        if(c >= 'B' && c <= 'D' || c >= 'F' && c <= 'H' || c >= 'J' && c <= 'N' || c >= 'P' && c <= 'T' || c >= 'V' && c <= 'Z') return cont = consoM(str, ++pos);
        else return cont = consoM(str, ++pos) + 1;
    }

    public static void main(String[] args)
    {
        String str = new String();

        str = MyIO.readString("> Digite a string: ");

        System.out.println("> Não vogais = " + naoVogal(str, 0));
        System.out.println("> Não consoantes maiúsculas = " + consoM(str, 0));
    }
}

