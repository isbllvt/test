import java.util.Scanner;

//import animal.Cat;
import animal.Dog;

public class Main {
    public static void main (String[] args){
        
     Scanner entrada = new Scanner(System.in);

        Dog cachorro1 = new Dog();
        Dog cachorro2 = new Dog("Sheik", "chowchow", "sujo", 24.0, 8.5, "de boa");

            System.out.println(cachorro2.getNome());
            System.out.println(cachorro2.getCor());
            // cachorro1.setNome("sheik");
            // cachorro1.setPeso(8.5);
            // cachorro1.setAltura(23.0);
            // cachorro1.setRaça("chowchow");
            // cachorro1.setCor("sujo");

            // cachorro1.latir();
            // cachorro1.pegar();

            System.out.println("escolha: acariciar, dormir ou bater");
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
