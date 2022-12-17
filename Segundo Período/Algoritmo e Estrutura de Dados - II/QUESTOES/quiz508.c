
#include <stdio.h>
#include <math.h>

 int somatorioPA(double a, double b, int n) {
     double soma = 0;
     for (int i = 0; i <= n; i ++) {
         soma += ((a + (i - 1)) * b);

     }
     return soma;
 }

 int main(int argc, char const *argv[])
 {
    int num;
    double soma, a, b;

    printf("A: ");
    scanf("%i", &a);
    printf("B: ");
    scanf("%i", &b);
    printf("N: ");
    scanf("%i", &num);

    soma = somatorioPA(a,b,num);

    printf("%d ", soma);

     return 0;
 }
 