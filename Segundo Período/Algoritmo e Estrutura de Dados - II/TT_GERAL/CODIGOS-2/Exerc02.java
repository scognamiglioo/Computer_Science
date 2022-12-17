class Exerc02 {

    public static void main(String[] args) {

        int monica, f1, f2, f3;

        while (true) {

        monica = MyIO.readInt();

        if (monica == 0) {
            break;
        }

        f1 =  MyIO.readInt();
        f2 =  MyIO.readInt();
        
        f3 = monica - (f1 + f2);

        //descobrindo o mais velho
            if (f1 > f2 && f1 > f3) {
                System.out.println( f1);
            } else if (f2 > f1 && f2 > f3) {
                System.out.println( f2);
            } else {
                System.out.println( f3);
            }   
         }

        }
        




}