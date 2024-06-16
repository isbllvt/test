import java.util.Scanner;

//import animal.Cat;
import animal.Dog;

public class Main {
    public static void main (String[] args){
        
     Scanner entrada = new Scanner(System.in);
        Dog cachorro1 = new Dog();

            cachorro1.nome = "sheik";
            cachorro1.peso = 8.2;
            cachorro1.altura = 10.3;
            cachorro1.raça = "chowchow";
            cachorro1.cor = "sujo";

            cachorro1.latir();
            cachorro1.pegar();

            System.out.println("escolha: carinho ou vai dormir");
            //cachorro1.estadoEspirito = entrada.nextLine();
            System.out.println("O doguinho está " + cachorro1.interagir(entrada.nextLine()));

        //Cat gato1 = new Cat();

        // gato1.nome = "fedido";
        // gato1.cor = "encardido";
        // gato1.altura = 1.2;
        // gato1.peso = 5.0;
        
        entrada.close();
    }
}
