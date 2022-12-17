public class retang {
    public class retangulo{
        int altura;
        int base;
        public void setAltura(int alturaP){
            altura=alturaP;
        }
        public void setBase(int baseP){
            base=baseP;
        }

        public int getAltura(){
            return altura;
        }
        public int geBase(){
            return base;
        }

        public double getArea(){
            return base*altura;
        }
        public double getPerimetro(){
            return ((base*2)+(altura*2));
        }
        public double getDiagonal(){
            Math.sqrt((Math.pow(base,2))+(Math.pow(altura,2)));
        }
        public retangulo(){}
    }

    public static void main (String[] args){
        int base1;
        int altura1;
        System.out.println("Digite a base do retangulo 1:");
        base1=MyIO.readInt();
        System.out.println("Digite a altura do retangulo 1:");
        altura1=MyIO.readInt();

        retangulo ret1= new retangulo();
        ret1.setAltura(altura1);
        ret1.setBase(base1);
        int base2;
        int altura2;
        System.out.println("Digite a base do retangulo 2:");
        base2=MyIO.readInt();
        System.out.println("Digite a altura do retangulo 2:");
        altura2=MyIO.readInt();

        retangulo ret2= new retangulo();
        ret2.setAltura(altura2);
        ret2.setBase(base2);
        System.out.println("Area do retangulo 1: "+ret1.getArea());
        System.out.println("Perimetro do retangulo 1: "+ret1.getPerimetro());
        System.out.println("Diagonal do retangulo 1: "+ret1.getDiagonal());

        System.out.println("Area do retangulo 2: "+ret2.getArea());
        System.out.println("Perimetro do retangulo 2: "+ret2.getPerimetro());
        System.out.println("Diagonal do retangulo 2: "+ret2.getDiagonal());


    }

}
