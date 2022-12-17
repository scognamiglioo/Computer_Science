public class Exerc04 {
    public static int calculo(int n)
    {
        int resp = 0;

        if(n == 0) resp = 1;
        else resp = (int)Math.pow(calculo(n - 1), 2);
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
