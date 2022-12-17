/*Palíndromo - Faça um programa recebe várias frases e identifica se elas são palíndromos

Entrada : composta por várias linhas sendo que a última contém a palavra FIM

Saída: para cada linha de entrada, escreva SIM / NÃO, indicando se a linha é um palíndromo
*/

#include <stdio.h>
#include <string.h>
#include <locale.h>
#include <ctype.h>
#include <stdlib.h>
#include <stdbool.h>



bool isFim(char *str)
{
    bool fim = false;

    if (!strcmp(str, "FIM"))
    {
        fim = true;
    }

    return fim;
}

bool isPalid(char *str) {


    for (int i= 0; i < strlen(str)/2; i++) { //
  

        if(str[i] != str[strlen(str) - i - 1]) {

            return false;
        }
        
        
    }

    return true;
}

int main(int argc, char const *argv[])
{
    char entrada[1000];


    scanf(" %[^\n]s", entrada);
   
    while(isFim(entrada) == false) {
       
        //entrada[strlen(entrada)-1] = '\0';
        
        if (isPalid(entrada) == true) {
            printf("SIM\n");
        }else if (isPalid(entrada) == false) {
            if (isFim(entrada)==true) {
                break;
            }
            else {
                printf("NAO\n");
            }
        }
        scanf(" %[^\n]s", entrada);
    } 
    

    return 0;
}

