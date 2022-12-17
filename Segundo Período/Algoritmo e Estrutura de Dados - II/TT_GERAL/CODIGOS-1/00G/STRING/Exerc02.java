import java.util.Scanner;
/*Faça um programa para ler uma palavra. Em seguida, mostre a primeira 
ocorrência da letra A
*/

public class Exerc02 {
    public static void main(String[] args){
        String str;
        System.out.println("Digite algo:");
        str=MyIO.readString();
        int contador=0;
        
        for(int aux=0;aux<str.length();aux++){
            if(str.charAt(aux)=='A'){
                contador=aux;
                break;
            }
        }
        System.out.println("A letra A parece na posicao: " +contador+ " da string pela primeira vez.");
        

    }
    
}
