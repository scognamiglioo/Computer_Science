#include <stdio.h>
#include <string.h>
#include <math.h>
#include <locale.h>


int main(int argc, char const *argv[])
{
    int monica = 1, f1, f2, f3;

    while (monica != 0) {

        scanf("%i", &monica);

        if (monica == 0) {
            break;
        }

        scanf("%i", &f1);
        scanf("%i", &f2);

        f3 = monica - (f1 + f2);

        if (f1 > f2 && f1 > f3) {
            printf("%i", f1);
        } else if (f2 > f1 && f2 > f3) {
            printf("%i", f2);
        } else {
            printf("%i", f3);
        } 
        
    }
    return 0;
}
