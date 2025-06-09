import javax.xml.namespace.QName;
import java.util.Scanner;

public class Util {

    public static String validaNome(Scanner scanner) {
        String nome;
        do {
            System.out.print("NOME: ");
            nome = scanner.nextLine().trim();
            if (!nome.matches("[\\p{L} -]+")) {
                System.out.println("ENTRADA INVÁLIDA!!");
            }
        } while (!nome.matches("[\\p{L} -]+"));

        return nome;

    }

    public static int validaIdade(Scanner scanner) {

        int idade = 0;
        do {
            System.out.print("IDADE: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade <= 0) {
                    System.out.println("IDADE INVÁLIDA!!");
                }
            } else {
                System.out.println("ENTRADA INVÁLIDA!!");
                scanner.next();
            }
        } while (idade <= 0);
        scanner.nextLine();
        return idade;

    }

    public static String categoria(int idade) {

        if (idade <= 12) {
            return "criança";
        } else if (idade <= 17) {
            return "adolescente";
        } else if (idade <= 59) {
            return "adulto";

        } else {
            return "idoso";
        }
    }
    public static String status (int idade){


        if (idade >= 18){
            return "Sim";}
        else return "Não";
        }

    }


