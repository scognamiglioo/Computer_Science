#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define MAXTAM 4

int main (void) {
    double M [3][3];
    double *p = M[0];

    for (int i = 0; i < pow(MAXTAM, 2); i++, p++){
	  *p=0.0;
    printf("%lf", *p );
    }



  return 0;
}

//RESULTADO
//6422220
//6422220
//6422220
//6422220
