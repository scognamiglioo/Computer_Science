#include <stdio.h>
#include <string.h>
#include <stdbool.h>


bool isFim(const char *s){
                                                                                                 
    if(strlen(s) == 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M'){
        return true;
    }

        return false;
}
        
    

bool isPali(char *s){

    int cont = 0;
    bool result = false;

    for(int i = 0;i < strlen(s); i++){
        if(s[i] == s[strlen(s)-i-1]){
            cont++;
        }
    }
    if(cont==strlen(s)){
        result=true;
    }
    return result;
}


int main (){

    char entrada[1000];

    while (isFim(entrada)==false){

         scanf(" %[^\n]", entrada);

        if(isPali(entrada)==true){
               printf("SIM\n");

            }else if(isPali(entrada)==false){ //Segunda expressão foi necessária para que quando o usuário digite "FIM" a resposta nao seja exibida na tela 
                
                if(isFim(entrada)==true){
                    break;
                }

            printf("NAO\n");
        }
    }
}