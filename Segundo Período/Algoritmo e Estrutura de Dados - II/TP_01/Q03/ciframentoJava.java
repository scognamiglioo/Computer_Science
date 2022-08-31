
public class ciframentoJava {

        public static boolean isFim(String s) {
            if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
                return true;
            }
    
            return false;
        }
    
        public static String isCifra(String s) {
           // int n=3;
            String charAux = "";

            for (int i = 0; i < s.length(); i++) {
                int a = (int)s.charAt(i);
                charAux +=  (char)(a+ 3);
            }

            return charAux;
        }
    
    
    
        public static void main(String[] args) {
    
         
    
            String entrada = new String();
            entrada = "";
            entrada = MyIO.readLine();

    
            while(true) {
                
                if(isFim(entrada) == true) {
                    break;
                }
               MyIO.println(isCifra(entrada));
                entrada = MyIO.readLine();
            }
        }
    
    
}
