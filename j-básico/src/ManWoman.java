package exercícios;

import java.util.Scanner;

public class ManWoman {
    public static void main(String[] args) {
        //variável inteiras sexo, qtMulheres e qtHomens e as variáveis do tipo float como altura, soma, mediaHomens, maior e menor; 
        int sexo, qtMulheres=0, qtHomens=0;
         float mediaH = 0, altura = 0, maior = 0, menor = 10, somaH = 0;

        //entrada de dados chamando classe Scanner e fechando o campo de entrada já no final do código
         Scanner entrada = new Scanner(System.in);

        //laço de repetição(for) com 10 voltas que irá armazenar a altura e sexo digitados pelo usuário
         for(int i=0; i<10; i++){   
            System.out.println("escolha: 1-mulher 2-homem");
            sexo = entrada.nextInt();
            System.out.print("Digite a altura (ex.: 1,63): ");
            altura = entrada.nextFloat();
            //verificar se o sexo foi de Homem ou Mulher; condicional if testando os valor para 1, para 2 e para 3
            if(sexo == 1){
                qtMulheres++;

            }else if (sexo == 2){
                qtHomens++;
                somaH = somaH + altura;
            }else {
            System.out.println("Opção de sexo não encontrada");
            }
            //if para verificar qual é a maior e menor altura
            if(altura > maior){
                maior = altura;
            } else if (altura < menor ){
                menor = altura;

            }
        }
         mediaH = somaH / qtHomens;

         System.out.printf("A maior altura do grupo é de %f metros, e a menor é de %f metros. ", maior, menor);
         System.out.println("A média de altura dos homens é " + mediaH + " m");
         System.out.println("O número de mulheres é " + qtMulheres);
         
         entrada.close();
    } 
}
