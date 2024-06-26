package animal;

public class Dog {
//atributos
    static int numeroDeDogs;
    private String nome;
    private String raça;
    private String cor;
    private Double altura;
    private Double peso; 
    private String estadoEspirito;  
    
    //contrutores
    public Dog(){}
    public Dog(String nome, String raça, String cor, Double altura, Double peso, String estadoEspirito) {
        this.nome = nome;
        this.raça = raça;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;

        numeroDeDogs ++;
    }

    //métodos
    public static int getNumeroDeDogs() {
        return numeroDeDogs;
    }
    public static void setNumeroDeDogs(int novoNumeroDeDogs) {
        Dog.numeroDeDogs = novoNumeroDeDogs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }

    public void comer(){}
    
    public String latir(){
        System.out.println("woof");
        return "";
    }
    
    public String pegar(){
        System.out.println("pegou o osso");
        return "";
    }

   public String interagir(String acao){

    switch (acao) {
        case "acariciar": this.estadoEspirito = "feliz";
        break;
        case "dormir": this.estadoEspirito = "triste";
        break;
        case "bater": this.estadoEspirito = "bravo";    
        break;
        default: this.estadoEspirito = "de boa";
    }
    return this.estadoEspirito;



//     if (acao.equals("carinho")){
//         this.estadoEspirito = "feliz";
//         return estadoEspirito;

//     }else if(acao.equals("vai dormir")){
//         this.estadoEspirito = "triste";

//    }else{
//     this.estadoEspirito = "de boa";
    
//    }
//    return estadoEspirito;
}
}