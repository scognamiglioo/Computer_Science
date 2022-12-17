class Exerc01 {

        public static boolean isFim(String s){
            return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
         }


 

        public static boolean isPali (String str) {


            for (int i=0; i != (str.length()/2)+1; i++) { //ovo 
                if (str.charAt(i) != str.charAt(str.length() - i - 1 )) {
                    return false;
                }
            }

            return true;
        }

        public static void main (String[] args) {
        String[] entrada = new String[1000];

        int in = 0;

        do 
        {
           entrada[in] = MyIO.readLine();
        } while (!isFim(entrada[in++]));
        
        in--;  // n pegar a linha final 


        for(int i = 0; i != in; i++) {
            MyIO.println(isPali(entrada[i]) ? "SIM" : "NAO");
        }
       


        }


    }

