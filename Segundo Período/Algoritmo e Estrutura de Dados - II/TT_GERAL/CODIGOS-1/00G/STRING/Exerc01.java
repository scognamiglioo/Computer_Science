import java.util.Scanner;
/*Faça um programa para ler uma palavra. Em seguida, mostre o número de 
caracteres da mesma e seu número de caracteres maiúsculos
*/

public class Exerc01 {
    public static void main(String[] args){
        String str;
        System.out.println("Digite algo:");
        str=MyIO.readString();

        int char1;
        char1=str.length();
        int cont=0;
        
        for(int aux=0;aux<str.length();aux++){
            if((str.charAt(aux)>=65)&&(str.charAt(aux)<=90)){
                cont++;
            }
        }

        System.out.println("CARACTERES: "+char1);
        System.out.println("MAIUSCULAS "+ cont);
    }
}
