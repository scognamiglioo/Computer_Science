#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h> 

//estudar mais esse codigo
int main () {
    int n = 0;

    float nAux;

    scanf("%i",&n);

    FILE *arquivo;
    arquivo = fopen("arquivo.txt", "w+"); //leitura
    for (int i = 0; i < n; i++) {
        scanf("%f", &nAux);
        if(i != n-1) { //trata o enter entre uma linha e outra 
            fprintf(arquivo,"%g\n",nAux);
        } else{
            fprintf(arquivo,"%g",nAux); //a ultima linha
        }
    } 

    fseek(arquivo, 0, SEEK_END); //aponta o ponteiro para o final do arquivo para leitura ao contario
    int pos = 0;
    pos = ftell(arquivo); // atribui a uma posição

    float numAux;

    for(; pos > 0; pos--){ //sem zerar de novo 
       if(fgetc(arquivo) == '\n') { //procura o enter entre linhas
           fseek(arquivo, pos+2, SEEK_SET); //seta na pos + 2 para ler numero logo depois que identificar o \n 
           fscanf(arquivo,"%f",&numAux); //le e armazena
           printf("%g\n", numAux); //printa o que foi lido
       } else if (pos == 1) { //tratar pos ultima
            fseek(arquivo, pos-1, SEEK_SET); //compensa a falta de /n na primeira linha
            fscanf(arquivo,"%f", &numAux); //le e armazena
            printf("%g\n", numAux); //printa o que foi lido
       }
       fseek(arquivo, pos, SEEK_SET);  //continua loop
    }
    fclose(arquivo);

}