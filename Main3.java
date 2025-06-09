import java.util.ArrayList;
import java.util.Scanner;
//array list
public class Main3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList <Pessoa> pessoas = new ArrayList<>();


        System.out.print("Quantas pessoas deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        for (int i=0; i< quantidade; i++){

            Pessoa pessoa = new Pessoa();

            pessoa.nome = Util.validaNome(scanner);
            pessoa.idade = Util.validaIdade(scanner);
            pessoa.categoria = Util.categoria(pessoa.idade);
            pessoa.status = Util.status(pessoa.idade);
            pessoas.add(pessoa);
        }
        scanner.close();

        for (Pessoa p : pessoas){
            System.out.println(p.nome+"-"+p.idade+"-"+p.categoria+"-"+p.status);

        }




    }
}
