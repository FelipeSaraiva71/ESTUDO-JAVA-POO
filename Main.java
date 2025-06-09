import java.util.Scanner;
//Sem array entrada única
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String nome = Util.validaNome(scanner);
         int idade =  Util.validaIdade(scanner);
      String categoria = Util.categoria(idade);
      String status = Util.status(idade);

      scanner.close();

        System.out.println("Dados: " + nome + idade + categoria + status);
        System.out.println((idade>= 18)?"APROVADO":"REPROVADO");
    }
}
