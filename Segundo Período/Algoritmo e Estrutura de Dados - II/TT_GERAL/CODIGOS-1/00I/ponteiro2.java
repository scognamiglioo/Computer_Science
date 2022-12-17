public class ponteiro2 {
    public static void main (String[] args){
        Animal a = new Animal ("Cao", 32, 'a');
        Animal b = new Animal ("Cao", 'x');
        Animal c = b;
        c.nome = "Gato";
        System.out.println(b.nome);
        c.setIdade(45);
       }
}


/* Possivelmente, a Classe Animal tem três 
 ou mais atributos. Além disso, no construtor
 com três parâmetros, o atributo que recebe 
 o valor do primeiro parâmetro pode ser do tipo
 String e os que recebem os outros dois 
 podem ser do tipo in

 O comando System.out.println(b.nome) imprime a palavra "Gato"
 */