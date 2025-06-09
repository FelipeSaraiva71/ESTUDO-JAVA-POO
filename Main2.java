import java.util.Scanner;
//array fixo
public class Main2 {

    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);
        Pessoa [] pessoas = new Pessoa[3];

        for (int i=0;i< pessoas.length;i++){
            pessoas [i] = new Pessoa();

            pessoas[i].nome =Util.validaNome(scanner);
            pessoas[i].idade = Util.validaIdade(scanner);
            pessoas[i].categoria = Util.categoria(pessoas[i].idade);
            pessoas[i].status = Util.status(pessoas[i].idade);
        }

        for (Pessoa pessoa : pessoas){

            System.out.println("NOME: " + pessoa.nome);
            System.out.println("IDADE: " + pessoa.idade);
            System.out.println("CATEGORIA: " + pessoa.categoria);
            System.out.println("APROVADO: " + pessoa.status);
        }






    }
}
