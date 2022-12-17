public class Exerc05 {
    public static void main(String[] args)
    {


        int discos, 
        p_i = 1,
        p_f = 3,
        p_tmp = 2;
    
        discos = MyIO.readInt("\n> Insira a quantidade de discos desejada: ");

        int minMov = (int)Math.pow(2, discos) - 1;

        System.out.println("> Siga os movimentos descritos para finalizar o jogo:");
        
        moverDiscos(discos, p_i, p_f, p_tmp);
        
        System.out.println("\n\n> O jogo será finalizado com sucesso com " + minMov + " movimentos.\n");
    }

    public static void moverDiscos(int n, int p_in, int p_fn, int p_tp)
    {
        if(n == 1) System.out.print("\n- Mova do pino "+ p_in + " para o pino " + p_fn + ".");
        else
        {
            moverDiscos(n - 1, p_in, p_tp, p_fn);
            
            System.out.print("\n- Mova do pino "+ p_in + " para o pino " + p_fn + ".");

            moverDiscos(n - 1, p_tp, p_fn, p_in);
        }
    }
}
