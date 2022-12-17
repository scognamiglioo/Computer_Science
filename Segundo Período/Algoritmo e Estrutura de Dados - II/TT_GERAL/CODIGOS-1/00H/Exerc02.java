public class Exerc02 {
    public static void ordenar(int vet[], int n)
    {
        if(n == 1) return;
      
        for(int x = 0; x < n - 1; x++)
        {
            if(vet[x] > vet[x + 1])
            {
                int temp = vet[x];

                vet[x] = vet[x + 1];
                vet[x + 1] = temp;
            }
        }

        ordenar(vet, n - 1);
    }

    public static void main(String[] args)
    {
        int vet[] = {2, 9, 5, 3, 15, 86, 4};

        System.out.println("> Vetor original = " + Arrays.toString(vet));

        ordenar(vet, vet.length);

        System.out.println("> Vetor ordenada = " + Arrays.toString(vet));
    }
}
