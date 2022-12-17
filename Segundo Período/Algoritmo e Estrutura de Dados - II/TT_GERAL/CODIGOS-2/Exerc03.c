#include <stdio.h>
#include <string.h>
#include <math.h>
#include <locale.h>


int main(int argc, char const *argv[])
{
        int ano = 0, atual = 1, x = 0;
 

        while (atual != 0) {

            scanf("%i", &atual);
            
            if (atual == 0) {
                break;
            }

            x = ((atual - 10)/76)+1; //ja passou --- 10 ano inicial
            ano = (76*x)+10;
            if (atual==ano) {
                ano += 76;
            }
            printf("%i",ano);

        }
    return 0;
}
