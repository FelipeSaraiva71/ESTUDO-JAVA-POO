public class Util {

    public static String validaNome(String nome) throws IllegalArgumentException {
        if (nome == null || !nome.matches("[\\p{L} ]+")) {
            throw new IllegalArgumentException("Nome inválido! Use apenas letras e espaços.");
        }
        return nome.trim();
    }

public static int validaIdade(String idadeStr) throws NumberFormatException {
    int idade = Integer.parseInt(idadeStr);
    if (idade <= 0) {
        throw new NumberFormatException("Idade deve ser maior que zero.");
    }
    return idade;
}

public static String categoria(int idade) {
    return (idade < 12) ? "Infantil" :
            (idade < 18) ? "Juvenil" :
    (idade <59) ? "Adulto" : "Idoso";
}

public static String status(int idade) {
    return (idade >= 18) ? "Sim" : "Não";
}
}