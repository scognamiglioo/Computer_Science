public class Exerc03 {
    public static int calculo(int n)
    {
        int resp = 0;

        if(n == 0) {
            resp = 1;
        } 
        else if(n == 1) {
            resp = 2;
        } 
        else {
            resp = (calculo(n - 1) * calculo(n - 2)) - calculo(n - 1);
        } 
        return resp;
    }

    public static void main(String[] args)
    {
        for(int x = 0; x != 10; x++)
        {
            System.out.println("> calculo(" + x + ") = " + calculo(x));
        }
    }
}
