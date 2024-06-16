import animais.Cat;
import animais.Dog;

public class Main {
    public static void main (String[] args){

        Dog cachorro1 = new Dog();

            cachorro1.nome = "sheik";
            cachorro1.peso = 8.2;
            cachorro1.altura = 10.3;
            cachorro1.raça = "chowchow";
            cachorro1.cor = "sujo";

            System.out.println(cachorro1);

        Cat gato1 = new Cat();

        gato1.nome = "fedido";
        gato1.cor = "encardido";
        gato1.altura = 1.2;
        gato1.peso = 5.0;

        System.out.println(gato1);
    }
}
