#include <stdio.h>
#include <string.h>
#include <stdbool.h>


bool isFim(const char *s){
                                                                                                 
    if(strlen(s) == 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){
        return true;
    }

        return false;
}
        


bool isPali(char *s, int i){

    bool resposta=false;

     if(i==strlen(s)){

        resposta=true;
    }else if(s[i] == s[strlen(s)-i-1]){ //se a letra lida de frente n for a mesma que ao contrario, n é
        
        resposta = false;
    } else {
        
        resposta=isPali(s,i+1); 
    }
    
   
    return resposta;
}


int main (){

    char entrada[1000];
    scanf(" %[^\n]", entrada);
    while (true){

        if(isPali(entrada,0)==true){
               printf("SIM\n");

            }else if(isPali(entrada,0)==false){
                
                if(isFim(entrada)==true){
                    break;
                }

            printf("NAO\n");
        }
        scanf(" %[^\n]", entrada);
    }
}