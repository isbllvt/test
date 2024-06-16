import java.util.Scanner;

//import animal.Cat;
import animal.Dog;

public class Main {
    public static void main (String[] args){
        
     Scanner entrada = new Scanner(System.in);

        Dog cachorro1 = new Dog("Spaike", "chowchow", "sujo", 24.0, 8.5, "de boa");

        System.out.println(Dog.getNumeroDeDogs());

        Dog cachorro2 = new Dog("Sheik", "chowchow", "sujo", 24.0, 8.5, "de boa");
       
        System.out.println(Dog.getNumeroDeDogs());
        System.out.println(Dog.getNumeroDeDogs());

            // System.out.println(cachorro2.getNome());
            // System.out.println(cachorro2.getCor());
            
            // System.out.println("escolha: acariciar, dormir ou bater");
            // //cachorro1.estadoEspirito = entrada.nextLine();
            // System.out.println("O doguinho está " + cachorro1.interagir(entrada.nextLine()));
        
        entrada.close();
    }
}
