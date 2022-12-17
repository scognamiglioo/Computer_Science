#include <stdio.h>
#include <stdlib.h>

int main (void) {
    int *x1; int x2; int *x3;

x1 = (int *) malloc (sizeof(int));
printf("\nx1(%p)(%i)(%p) x2(%i)(%p) x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

*x1 = 20;
printf("\nx1(%p)(%i)(%p) x2(%i)(%p) x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

x2 = *x1;
printf("\nx1(%p)(%i)(%p) x2(%i)(%p) x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

*x3 = x2 * *x1;
printf("\nx1(%p)(%i)(%p) x2(%i)(%p) x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

x3 = &x2;
printf("\nx1(%p)(%i)(%p) x2(%i)(%p) x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

x2 = 15;
printf("\nx1(%p)(%i)(%p) x2(%i)(%p) x3(%p)(%i)(%p)", x1, *x1, &x1, x2, &x2, x3, *x3, &x3);

    return 0;
}


//RESULTADO

//x1(0x55e4042212a0)(0)(0x7ffe8ca42b08) x2(0)(0x7ffe8ca42b04) x3(0x7ffe8ca42c10)(1)(0x7ffe8ca42b10)
//x1(0x55e4042212a0)(20)(0x7ffe8ca42b08) x2(0)(0x7ffe8ca42b04) x3(0x7ffe8ca42c10)(1)(0x7ffe8ca42b10)
//x1(0x55e4042212a0)(20)(0x7ffe8ca42b08) x2(20)(0x7ffe8ca42b04) x3(0x7ffe8ca42c10)(1)(0x7ffe8ca42b10)
//x1(0x55e4042212a0)(20)(0x7ffe8ca42b08) x2(20)(0x7ffe8ca42b04) x3(0x7ffe8ca42c10)(400)(0x7ffe8ca42b10)
//x1(0x55e4042212a0)(20)(0x7ffe8ca42b08) x2(20)(0x7ffe8ca42b04) x3(0x7ffe8ca42b04)(20)(0x7ffe8ca42b10)
//x1(0x55e4042212a0)(20)(0x7ffe8ca42b08) x2(15)(0x7ffe8ca42b04) x3(0x7ffe8ca42b04)(15)(0x7ffe8ca42b10)