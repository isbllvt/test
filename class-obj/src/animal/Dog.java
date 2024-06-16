package animal;

public class Dog {

    public String nome;
    public String raça;
    public String cor;
    public Double altura;
    public Double peso; 
    public String estadoEspirito;  

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
    if (acao.equals("carinho")){
        this.estadoEspirito = "feliz";
        return estadoEspirito;

    }else if(acao.equals("vai dormir")){
        this.estadoEspirito = "triste";

   }else{
    this.estadoEspirito = "de boa";
    
   }
   return estadoEspirito;
}
}