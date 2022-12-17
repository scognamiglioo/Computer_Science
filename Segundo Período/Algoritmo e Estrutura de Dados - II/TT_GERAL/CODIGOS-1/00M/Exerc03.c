#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main (void) {

    double a;
    double *p, *q;
    a = 3.14;
    printf("%f\n", a);
    p = &a;
    *p = 2.718;
    printf("%f\n", a);
    a = 5;
    printf("%f\n", *p);

    p = NULL;
    p = (double*) malloc(sizeof(double));
    *p = 20;
    q = p;
    printf("%f\n", *p);
    printf("%f\n", a);
    free(p);
    printf("%f\n", *q);

    return 0;
}

//RESULTADO 
//3.140000
//2.718000
//5.000000
//20.000000
//5.000000
//0.000000