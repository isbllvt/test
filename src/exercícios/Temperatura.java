

public class Temperatura {
    public static void main(String[] args) {
    //Declarando variáveis
        double C, K, F, Re, Ra;
    //Calculos das temperatura pra Celsius
        C=33;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;
    //Imprimnindo na tela 
        System.out.println("Temperatura em Faireheint: " + F);
        System.out.println("Temperatura em K: " + K);
        System.out.println("Temperatura em RE: " + Re);
        System.out.println("Temperatura em RA: " + Ra);
    }
}
