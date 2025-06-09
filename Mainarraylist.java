import java.util.ArrayList;
import java.util.Scanner;

public class Mainarraylist {

   public static void main (String [] args){

       Scanner scanner = new Scanner(System.in);
       ArrayList<Pessoa> pessoas = new ArrayList<>();

       for (int i=0;i<2;i++ ){
           Pessoa pessoa = new Pessoa();
           pessoa.nome = Util.validaNome(scanner);
           pessoa.idade = Util.validaIdade(scanner);
           pessoa.categoria = Util.categoria(pessoa.idade);
           pessoa.status = Util.status(pessoa.idade);
           pessoas.add(pessoa);
       }

       for (Pessoa p : pessoas){

           System.out.println("DADOS: "+p.nome+"-"+p.idade+"-"+p.categoria+"-"+p.status);
       }





    }
}
