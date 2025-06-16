public class Pessoa {

    private String nome;
    private int idade ;
    private  String categoria;
    private String status ;

public Pessoa (String nome , String idade){

  this.nome = Util.validaNome(nome);
  this.idade = Util.validaIdade(idade);
  this.categoria = Util.categoria(this.idade);
  this.status = Util.status(this.idade);

}
    public String getNome (){
        return nome;
    }
    public int getIdade (){
        return idade;
    }
    public String getCategoria (){
        return categoria;
    }
    public String getStatus (){
        return status;
    }
public String exibirDados(){

   return "Nome: "+nome+"\nIdade: "+idade+"\nCategoria: "+categoria+"\nStatus:"+status+"\n";
}
}