#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h> 

bool isFim(char *s){

    bool resp = false;

    if(strlen(s) == 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){

        resp = true;
    }

    return resp;
}

bool isVogal(char *s){

    bool resp = false;

    for(int i=0; i < strlen(s); i++){

        if(s[i] == 'a' || s[i] == 'A' || s[i] == 'e' || s[i] == 'E' || s[i] == 'i' ||
           s[i] == 'I' || s[i] == 'o' || s[i] == 'O' || s[i] == 'u' || s[i] == 'U'){

               resp = true;
           }else{

               return false;
           }
    }

    return resp;
}

bool isConsoante(char *s){

    bool resp = false;

    for(int i=0; i < strlen(s); i++){

        if(s[i] == 'b' || s[i] == 'B' || s[i] == 'c' || s[i] == 'C' ||
           s[i] == 'd' || s[i] == 'D' || s[i] == 'f' || s[i] == 'F' ||
           s[i] == 'g' || s[i] == 'G' || s[i] == 'h' || s[i] == 'H' ||
           s[i] == 'j' || s[i] == 'J' || s[i] == 'k' || s[i] == 'K' ||
           s[i] == 'l' || s[i] == 'L' || s[i] == 'm' || s[i] == 'M' ||
           s[i] == 'n' || s[i] == 'N' || s[i] == 'p' || s[i] == 'P' ||
           s[i] == 'q' || s[i] == 'Q' || s[i] == 'r' || s[i] == 'R' ||
           s[i] == 's' || s[i] == 'S' || s[i] == 't' || s[i] == 'T' ||
           s[i] == 'v' || s[i] == 'V' || s[i] == 'w' || s[i] == 'W' ||
           s[i] == 'x' || s[i] == 'X' || s[i] == 'y' || s[i] == 'Y' ||
           s[i] == 'z' || s[i] == 'Z'){

            resp = true;
        }else{

            return false;
        }
    }

    return resp;
}

bool isInt(char *s){

    bool resp = false;

    for(int i=0; i < strlen(s); i++){

        if(s[i] == '0' || s[i] == '1' || s[i] == '2' || s[i] == '3' || s[i] == '4' ||
           s[i] == '5' || s[i] == '6' || s[i] == '7' || s[i] == '8' || s[i] == '9'){

            resp = true;
        }else{

            return false;
        }
    }

    return resp;
}

bool isReal(char *s){

    bool resp = false;
    int count = 0;
        
    for(int i=0; i < strlen(s); i++){

        if((s[i] == '0' || s[i] == '1' || s[i] == '2' || s[i] == '3' || s[i] == '4' ||
            s[i] == '5' || s[i] == '6' || s[i] == '7' || s[i] == '8' || s[i] == '9' ||
            s[i] == ',' || s[i] == '.')){
                
            resp = true;

            if(s[i] == ','|| s[i] == '.') {

                count++;
            }
            if(count > 1){

                return false;
            } 

            }else

                return false;
            }
        
    return resp;
}

    int main (){
        char entrada[1000];
        scanf(" %[^\n]", entrada); 
       
        char x1[3];
        char x2[3];
        char x3[3];
        char x4[3];

        while(true){
            if(isFim(entrada)==true){
                break;
            }

            if((isVogal(entrada))==true){ 
                printf("SIM ");
            }else if((isVogal(entrada))==false){
                printf("NAO ");
            }
    
            if((isConsoante(entrada))==true){
                printf("SIM ");
            }else {
                printf("NAO ");
            }
    
            if(isInt(entrada)==true){
               printf("SIM ");
            }else if(isInt(entrada)==false){
                printf("NAO ");
            }
    
            if(isReal(entrada)==true){
                printf("SIM ");
            }else if(isReal(entrada)==false){
                printf("NAO ");
            }
            printf("\n");
            scanf(" %[^\n]", entrada);
        }
        
    }