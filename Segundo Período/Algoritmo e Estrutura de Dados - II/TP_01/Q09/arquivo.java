import java.io.RandomAccessFile;

import java.io.*;

public class arquivo {
    public static void main(String[] args) throws Exception{
        int n=0;

        double nAux = 0;
        n = MyIO.readInt();

        RandomAccessFile raf = new RandomAccessFile("arquivo.txt", "rw"); //RW digita e escreve

        for(int i = 1; i <= n; i++) {
           nAux = MyIO.readDouble();

           raf.writeDouble(nAux);
        }
        raf.close();

        raf=new RandomAccessFile("arquivo.txt","r"); 
        double numAux=0; // saida print

        for(int i=n-1;i>=0;i--){ 

            raf.seek(i*8); //bytes

            numAux=raf.readDouble(); 

            if(numAux==(int)numAux){ 

                System.out.println((int)numAux); 

            }else{

                System.out.println(numAux); 

            }

       
    
        }
        raf.close();
    }

}
