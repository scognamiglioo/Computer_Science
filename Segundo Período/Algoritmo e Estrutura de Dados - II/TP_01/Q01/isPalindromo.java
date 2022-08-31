class isPalindromo {

    public static boolean isFim(String s) {
        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
            return true;
        }

        return false;
    }

    public static boolean isPali(String s) {
        int cont = 0;

        boolean result = false;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(s.length()-i-1)) {
                cont++;
            }
        }

        if(cont==s.length()) {
            result = true;
        }

        return result;
    }



    public static void main(String[] args) {

       MyIO.setCharset("utf-8");

        String entrada = "";

        while(true) {
            entrada = MyIO.readLine();
            if(isFim(entrada) == true) {
                break;
            }
            
            if(isPali(entrada) == true) {
               System.out.println("SIM");

            } else if ((isPali(entrada)== false) && (isFim(entrada) == false)) {
                System.out.println("NAO");
            }
        }
    }
}


