class isPalindromo {

    public static boolean isFim(String s) {
        if(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
            return true;
        }

        return false;
    }

    public static boolean isPali(String s){ 
        return isPali(s,0);
    }
    
    public static boolean isPali(String s, int i){ 
        boolean resposta;

        if(i==s.length()){  

            resposta=true;

        }else if(s.charAt(i)!=s.charAt(s.length()-i-1)){ 

            resposta=false;
        }else{

            resposta=isPali(s,i+1); 
        }
        return resposta;
    }
    
    public static void main (String[] args){
        String entrada="";

        while(isFim(entrada)==false){

            entrada=MyIO.readLine();

            if(isPali(entrada)==true){
                
                System.out.println("SIM");

            }
            else if ((isPali(entrada)==false) && (isFim(entrada)==false)){ 
                System.out.println("NAO");

            }
        }
    }
}


