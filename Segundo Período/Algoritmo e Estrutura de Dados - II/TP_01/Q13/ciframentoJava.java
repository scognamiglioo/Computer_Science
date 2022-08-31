
public class ciframentoJava {

        public static boolean isFim(String s) {
            if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
                return true;
            }
    
            return false;
        }

        public static String isCifra(String s, int n){
            return isCifra (s,n,0);
        }
        
        public static String isCifra(String s, int n, int i){ 
            String cifra="";
           
            if(i<s.length()){
                cifra+=(char)(s.charAt(i)+n);
                cifra+=isCifra(s,n,i+1);
            }
            
            return cifra;  
        }
    
    
    
        public static void main(String[] args) {
    
         
            int n = 3;
            String entrada = new String();
            entrada = "";
            entrada = MyIO.readLine();

    
            while(true) {
                
                if(isFim(entrada) == true) {
                    break;
                }
               MyIO.println(isCifra(entrada,n,0));
                entrada = MyIO.readLine();
            }
        }
    
    
}
