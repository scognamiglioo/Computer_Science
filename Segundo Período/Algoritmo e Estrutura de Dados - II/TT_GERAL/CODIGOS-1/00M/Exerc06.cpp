#include <stdio.h>
#include <stdlib.h>
#include <math.h>



    Cliente c;
    c.codigo = 5;
    Cliente *p = NULL;
    p = (Cliente*) malloc (sizeof(Cliente));
    p->codigo = 6;
    Cliente *p2 = &c;
    p2->codigo = 7;


/*
p 51h
-------
p2 33h
-------

-------

-------
c 7/?  33h
-------

-------

-------
6/?    51h
-------
*/

