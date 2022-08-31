
public class isJava {
    public static boolean isFim(String s) {
        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
            return true;
        }
        return false;
    }

    public static boolean isVogal(String s) {
        int cont = 0;

        for (int i=0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'O') {
                cont++;
            }
        }
        if (cont == s.length()) {
            return true;
        }
        return false;
    }

    public static boolean isConsoante(String s) {
        int cont = 0;

        for (int i=0; i < s.length(); i++) {
            if(s.charAt(i) != 'A' || s.charAt(i) != 'E' || s.charAt(i) != 'I' || s.charAt(i) != 'O' || s.charAt(i) != 'O') {
                cont++;
            }

            if(s.charAt(i)<64 ||(s.charAt(i)>=91&&s.charAt(i)<=96)||s.charAt(i)>=123){ 
                return false;
            }
        }

        if (cont == s.length()) {
            return true;
        }

        return false;
    }

    
    
    public static boolean isInt(String s) {
        int cont = 0;

        for (int i=0; i < s.length(); i++) {
           if((s.charAt(i)>= 48 && s.charAt(i) <= 57)) {
                cont++;
           }
          
        }


        if (cont == s.length()) {
            return true;
        }

        return false;
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

            if(isVogal(entrada.toUpperCase()) == true) {
                x1 = "SIM";
            } else {
                x1 = "NAO";
            }

            if(isConsoante(entrada.toUpperCase()) == true) {
                x2 = "SIM";
            } else {
                x2 = "NAO";
            }

            if(isInt(entrada) == true) {
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
