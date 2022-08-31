
public class isJava {
    public static boolean isFim(String s) {
        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
            return true;
        }
        return false;
    }
    
    public static int isVogal(String s){
        return isVogal(s, 0);
    }


    public static int isVogal(String s, int i) {
        int cont = 0;

        if (i < s.length()){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'O') {
                cont += 0;
                cont += isVogal(s, i + 1);
            } else {
                cont += 1;
            }
        }

        return cont;
        
    }

    public static int isConsoante(String s){

        return isConsoante(s, 0);
    }

    public static int isConsoante(String s, int i) {

        int cont = 0;

        if(i < s.length()){

            if(s.charAt(i) == 'b' || s.charAt(i) == 'B' || s.charAt(i) == 'c' || s.charAt(i) == 'C' ||
               s.charAt(i) == 'd' || s.charAt(i) == 'D' || s.charAt(i) == 'f' || s.charAt(i) == 'F' ||
               s.charAt(i) == 'g' || s.charAt(i) == 'G' || s.charAt(i) == 'h' || s.charAt(i) == 'H' ||
               s.charAt(i) == 'j' || s.charAt(i) == 'J' || s.charAt(i) == 'k' || s.charAt(i) == 'K' ||
               s.charAt(i) == 'l' || s.charAt(i) == 'L' || s.charAt(i) == 'm' || s.charAt(i) == 'M' ||
               s.charAt(i) == 'n' || s.charAt(i) == 'N' || s.charAt(i) == 'p' || s.charAt(i) == 'P' ||
               s.charAt(i) == 'q' || s.charAt(i) == 'Q' || s.charAt(i) == 'r' || s.charAt(i) == 'R' ||
               s.charAt(i) == 's' || s.charAt(i) == 'S' || s.charAt(i) == 't' || s.charAt(i) == 'T' ||
               s.charAt(i) == 'v' || s.charAt(i) == 'V' || s.charAt(i) == 'w' || s.charAt(i) == 'W' ||
               s.charAt(i) == 'x' || s.charAt(i) == 'X' || s.charAt(i) == 'y' || s.charAt(i) == 'Y' ||
               s.charAt(i) == 'z' || s.charAt(i) == 'Z'){
                
                cont += 0;
                cont += isConsoante(s, i +1);

            }else{

                cont += 1;
            }
        }

            return cont;
    }

    public static int isInt(String s){

        return isInt(s, 0);
    }

    
    public static int isInt(String s, int i) {
        int cont = 0;

        if (i < s.length()) {
           if((s.charAt(i)>= 48 && s.charAt(i) <= 57)) {
            cont += 0;
            cont += isInt(s, i +1);

        }else{

            cont += 1;
        }
    }

        return cont;
    }


    public static boolean isReal(String s) {
        int cont = 0, contVAR = 0;

        for (int i=0; i < s.length(); i++) {
           if((s.charAt(i)>= 48 && s.charAt(i) <= 57) || (s.charAt(i) == '.' ||  s.charAt(i) == ',')) {
                cont++;
           }
           if ((s.charAt(i) == '.' ||  s.charAt(i) == ',')) {
                contVAR ++;
           }
        }

        if (contVAR > 1) {
            return false;
        }

        if (cont == s.length()) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        String entrada = new String();
        entrada = "";
        entrada = MyIO.readLine();

        String x1 = "";
        String x2 = "";
        String x3 = "";
        String x4 = "";

        while(true) {
            if(isFim(entrada) == true) {
                break;
            }

            if(isVogal(entrada.toUpperCase()) == 0) {
                x1 = "SIM";
            } else {
                x1 = "NAO";
            }

            if(isConsoante(entrada.toUpperCase()) == 0) {
                x2 = "SIM";
            } else {
                x2 = "NAO";
            }

            if(isInt(entrada) == 0) {
                x3 = "SIM";
            } else {
                x3 = "NAO";
            }

            if(isReal(entrada) == true) {
                x4 = "SIM";
            } else {
                x4 = "NAO";
            }


            MyIO.println(x1 + " " + x2 + " " + x3 + " " + x4);
            entrada = MyIO.readLine();

        }
    }

}
