import java.util.Scanner;
/*Faça um programa para ler uma palavra. Em seguida, mostre os números 
de caracteres, letras, não letras, vogais e consoantes.
*/

public class Exerc03 {
    public static void main(String[] args){
        String str;
        System.out.println("Digite algo:");
        str=MyIO.readString();
        int char1;
        char1=str.length();
        int contador=0;
        int let=0;
        int naoLetras=0;
        int vogais=0;
        int consoantes=0;

        for(int aux=0;aux<str.length();aux++){

            if(((str.charAt(aux)>=65)&&(str.charAt(aux)<=90))||((str.charAt(aux)>=97)&&(str.charAt(aux)<=122))){
                let++;
                if((str.charAt(aux)=='a'||str.charAt(aux)=='e'||str.charAt(aux)=='i'||str.charAt(aux)=='o'||str.charAt(aux)=='u')||(str.charAt(aux)=='A'||str.charAt(aux)=='E'||str.charAt(aux)=='I'||str.charAt(aux)=='O'||str.charAt(aux)=='U')){
                    vogais++;
                }else{
                    consoantes++;
                }  

            }else{
                naoLetras++;
            }
        }

        
        System.out.println("CARACTERES: "+char1);
        System.out.println("LETRAS "+let);
        System.out.println("SIMBOLOS: "+naoLetras);
        System.out.println("VOGAIS: "+vogais);
        System.out.println("CONSOANTES: "+consoantes );


    }
}
