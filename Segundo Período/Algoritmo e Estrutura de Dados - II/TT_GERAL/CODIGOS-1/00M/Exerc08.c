#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    FILE *f1;
    int i1 = 58;
    int i2 = 69;
    int i3 = 45;
    int i4 = 8;

    if ((f1 = fopen("teste.txt", "rb")) == NULL) {
        printf ("\nArquivo nao pode ser aberto");
        exit(1);
    }
    fread (&i1, sizeof(int), 1, f1);
    fread (&i2, sizeof(int), 1, f1);
    fread (&i3, sizeof(int), 1, f1);
    fread (&i4, sizeof(int), 1, f1);
    printf("%i %i %i %i", i1, i2, i3, i4);
    fclose(f1);
    return 0;

}


//RESULTADO
//58 69 45 8