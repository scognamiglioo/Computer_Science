#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (void) {
    int *x1; int x2; int *x3;
    x1 = (int*) malloc(sizeof(int));
    *x1 = 20;
    x2 = *x1;
    *x3 = x2 * *x1;
    x3 = &x2;
    x2 = 15;
    x2 = 13 & 3;
    x2 = 13 | 3;
    x2 = 13 >> 1;
    x2 = 13 << 1;
}

//RESULTADO
//x1=14363360
//*x1=20
//x2=26
//*x3=26
//x3=6422292
//x2=26
//x2=26
//x2=26
//x2=26
//x2=26