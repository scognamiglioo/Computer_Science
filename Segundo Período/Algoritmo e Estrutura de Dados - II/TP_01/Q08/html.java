import java.io.*;
import java.net.*;

public class html {

    public static boolean isFim(String s) {
        if (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
            return true;
        }

        return false;
    }

    // --------------------------------------CONTAR
    // VOGAIS------------------------------------------------------------------------------
    public static int contA(String s) {
        boolean resp = false;
        int contA = 0;
        int contAux = 0;

        for(int i=0; i < s.length(); i++){

            if((int)s.charAt(i) == 97){

                contA++;
            }

              // detecta se é diferente de table
              if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 116 && (int)s.charAt(i + 2) == 97 &&
              (int)s.charAt(i + 3) == 98 && (int)s.charAt(i + 4) == 108 && (int)s.charAt(i + 5) == 101 &&
              (int)s.charAt(i + 6) == 62) {
  
                  contAux++;
                  resp = true;
              }

        }

        if(resp == true){

            contA -= contAux;
        }

        return contA;
    }

    // E

    public static int contE(String s) {
        boolean resp = false;
        int contE = 0;
        int contAux = 0;

        for(int i=0; i < s.length(); i++){

            if((int)s.charAt(i) == 101){

                contE++;
            }

              // detecta se é diferente de table
              if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 116 && (int)s.charAt(i + 2) == 97 &&
              (int)s.charAt(i + 3) == 98 && (int)s.charAt(i + 4) == 108 && (int)s.charAt(i + 5) == 101 &&
              (int)s.charAt(i + 6) == 62) {
  
                  contAux++;
                  resp = true;
              }

        }

        if(resp == true){

            contE -= contAux;
        }

        return contE;
    }

    // I

    public static int contI(String s) {
        boolean resp = false;

        int contaI = 0;
        int contAux = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 105) {
                contaI++;
            }

             // detecta se é diferente de table
             if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 116 && (int)s.charAt(i + 2) == 97 &&
             (int)s.charAt(i + 3) == 98 && (int)s.charAt(i + 4) == 108 && (int)s.charAt(i + 5) == 101 &&
             (int)s.charAt(i + 6) == 62) {
 
                 contAux++;
                 resp = true;
             }

     }

     if(resp == true){

         contaI -= contAux;
     }

     return contaI;
    }

    // O

    public static int contO(String s) {
        boolean resp = false;

        int contaO = 0;
        int contAux = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 111) {
                contaO++;
            }

                  // detecta se é diferente de table
            if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 116 && (int)s.charAt(i + 2) == 97 &&
            (int)s.charAt(i + 3) == 98 && (int)s.charAt(i + 4) == 108 && (int)s.charAt(i + 5) == 101 &&
            (int)s.charAt(i + 6) == 62) {

                contAux++;
                resp = true;
            }
       
            }
       
            if(resp == true){
       
                contaO -= contAux;
            }
       
            return contaO;
        }

    // U

    public static int contU(String s) {
        boolean resp = false;

        int contaU = 0;
        int contAux = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 117) {
                contaU++;
            }

             // detecta se é diferente de table
             if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 116 && (int)s.charAt(i + 2) == 97 &&
             (int)s.charAt(i + 3) == 98 && (int)s.charAt(i + 4) == 108 && (int)s.charAt(i + 5) == 101 &&
             (int)s.charAt(i + 6) == 62) {
 
                 contAux++;
                 resp = true;
             }
        
             }
        
             if(resp == true){
        
                 contaU -= contAux;
             }
        
             return contaU;
         }
    

    // ----------------------------CONTAR
    // ACENTOS--------------------------------------------------------

    // ------------------------------------------------------
    // ´
    // A
    public static int contAcentA(String s) {

        int contaA = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 160) {
                contaA++;
            }

            // detecta se é diferente de table
            

        }

        return contaA;
    }

    // I
    public static int contAcentI(String s) {

        int contaAI = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) ==  161) {
                contaAI++;
            }

        }

        return contaAI;
    }

    // E
    public static int contAcentE(String s) {
        boolean resp = false;

        int contaAE = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 130) {
                contaAE++;
            }

        }

        return contaAE;
    }

    // O

    public static int contAcentO(String s) {
        boolean resp = false;

        int contaAO = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 162) {
                contaAO++;
            }

        }

        return contaAO;
    }

    // U

    public static int contAcentU(String s) {
        boolean resp = false;

        int contaAU = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 163) {
                contaAU++;
            }

        }

        return contaAU;
    }

    // ------------------------------------------------------

    // `
    public static int contAcentCA(String s) {

        int contaA = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 133) {
                contaA++;
            }

        }

        return contaA;
    }

    // I
    public static int contAcentCI(String s) {

        int contaAI = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 141) {
                contaAI++;
            }

        }

        return contaAI;
    }

    // E
    public static int contAcentCE(String s) {

        int contaAE = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 138) {
                contaAE++;
            }

        }

        return contaAE;
    }

    // O

    public static int contAcentCO(String s) {
        boolean resp = false;

        int contaAO = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 149) {
                contaAO++;
            }

        }

        return contaAO;
    }

    // U

    public static int contAcentCU(String s) {
        boolean resp = false;

        int contaAU = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 151) {
                contaAU++;
            }

        }

        return contaAU;
    }

    // ------------------------------------------------------

    // ~
    public static int contAcentTA(String s){//retorna o valor da letra ã

        int a = 0;
        for(int i=0; i < s.length(); i++){
            if((int)s.charAt(i) == 198){

                a++;
            }
        }
        return a;
    }

    public static int contAcentTO(String s){//retorna o valor da letra õ

        int o = 0;
        for(int i=0; i < s.length(); i++){

            if((int)s.charAt(i) == 228){
                o++;
            }
        }
        return o;
    }

    // ------------------------------------------------------

    // `
    public static int contAcentCircA(String s) {

        int contaA = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 131) {
                contaA++;
            }

        }

        return contaA;
    }

    // I
    public static int contAcentCircI(String s) {

        int contaAI = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 215) {
                contaAI++;
            }

        }

        return contaAI;
    }

    // E
    public static int contAcentCircE(String s) {

        int contaAE = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 136) {
                contaAE++;
            }

        }

        return contaAE;
    }

    // O

    public static int contAcentCircO(String s) {
        boolean resp = false;

        int contaAO = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 147) {
                contaAO++;
            }

        }

        return contaAO;
    }

    // U

    public static int contAcentCircU(String s) {
        boolean resp = false;

        int contaAU = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 150) {
                contaAU++;
            }

        }

        return contaAU;
    }

    // ----------------------------CONTAR
    // CONSOANTE--------------------------------------------------
    public static int contaCosoante(String s) {

        int contaConsoante = 0;
        int contAux = 0;
        int contAux2 = 0;

        boolean resp = false;
        boolean respAux = false;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 98  || (int)s.charAt(i) == 99 || 
            (int)s.charAt(i) == 100 || (int)s.charAt(i) == 102 || 
            (int)s.charAt(i) == 103  || (int)s.charAt(i) == 104 || 
            (int)s.charAt(i) == 106  || (int)s.charAt(i) == 107 || 
            (int)s.charAt(i) == 108 || (int)s.charAt(i) == 109 || 
            (int)s.charAt(i) == 110|| (int)s.charAt(i) == 112 || 
            (int)s.charAt(i) == 113  || (int)s.charAt(i) == 114 || 
            (int)s.charAt(i) == 115 || (int)s.charAt(i) == 116 || 
            (int)s.charAt(i) == 118 || (int)s.charAt(i) == 119 || 
            (int)s.charAt(i) == 120 || (int)s.charAt(i) == 121 ||
            (int)s.charAt(i) == 122) {

                contaConsoante++;
            }

            // detecta se é diferente de table
            if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 116 && (int)s.charAt(i + 2) == 97 &&
            (int)s.charAt(i + 3) == 98 && (int)s.charAt(i + 4) == 108 && (int)s.charAt(i + 5) == 101 &&
            (int)s.charAt(i + 6) == 62) {

                contAux++;
                resp = true;
            }

            if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 98 && (int)s.charAt(i + 2) == 114 && (int)s.charAt(i + 3) == 62) {

                contAux2++;
                respAux = true;
            }
        }

        if (resp == true) {

            contaConsoante -= (contAux * 3);
        }

        if (respAux == true) {

            contaConsoante -= (contAux2 * 2);
        }
        
        return contaConsoante;
        
    }
    
    

    // ----------------------------CONTAR
    // PADROES-------------------------------

    public static int contaBr(String s) {
        int br = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 98 && (int)s.charAt(i + 2) == 114 && (int)s.charAt(i + 3) == 62) {

                br++;

            }
        }

        return br;
    }

    public static int contaT(String s) {
        int t = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 60 && (int)s.charAt(i + 1) == 116 && (int)s.charAt(i + 2) == 97 &&
            (int)s.charAt(i + 3) == 98 && (int)s.charAt(i + 4) == 108 && (int)s.charAt(i + 5) == 101 &&
            (int)s.charAt(i + 6) == 62) {
                t++;
            }
        }
        return t;
    }

    
    // -------------HTML--------------
    
    public static String getHtml(String endereco) {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;

        try {
            url = new URL(endereco);
            is = url.openStream(); // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                resp += line + "\n";
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            is.close();
        } catch (IOException ioe) {
            // nothing to see here

        }

        return resp;
    }

     // -------------HTML--------------

     public static void main(String[] args){

       MyIO.setCharset("utf-8");
        
        String entrada = new String();
        String endereco = new String();
        String html = new String();
        
        while(isFim(entrada) == false){

            entrada = MyIO.readLine();

            if(isFim(entrada) == true){

                break;
            }

            endereco = MyIO.readLine();
            html = getHtml(endereco);

            MyIO.println("a(" + contA(html) + ") e(" + contE(html) + ") i(" + contI(html) + ") o(" + contO(html) + ") u(" + contU(html) + 
                         ") á(" + contAcentA(html) + ") é(" + contAcentE(html) + ") í(" + contAcentI(html) + ") ó(" + contAcentO(html) + ") ú(" + contAcentU(html) + 
                         ") à(" + contAcentCA(html) + ") è(" + contAcentCE(html) + ") ì(" + contAcentCI(html) + ") ò(" + contAcentCO(html) + ") ù(" + contAcentCU(html) + 
                         ") ã(" + contAcentTA(html) + ") õ(" + contAcentTO(html) + 
                         ") â(" + contAcentCircA(html) + ") ê(" + contAcentCircE(html) + ") î(" + contAcentCircI(html) + ") ô(" + contAcentCircO(html) + ") û(" + contAcentCircU(html) + 
                         ") consoante(" + contaCosoante(html) + 
                         ") <br>(" + contaBr(html) + ") <table>(" + contaT(html) + ") " + entrada);
        }
    }
}
