import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Cadastro extends JFrame {
    private JTextField nomeField;
    private JTextField idadeField;
    private JTextArea areaTexto;
    private ArrayList<Pessoa> pessoas;

    public Cadastro() {
        pessoas = new ArrayList<>();

        setTitle("Cadastro de Pessoas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela

        // Layout básico
        setLayout(new BorderLayout());

        // Painel para entrada de dados
        JPanel painelEntrada = new JPanel(new GridLayout(3, 2, 5, 5));
        painelEntrada.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        painelEntrada.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        painelEntrada.add(nomeField);

        painelEntrada.add(new JLabel("Idade:"));
        idadeField = new JTextField();
        painelEntrada.add(idadeField);

        JButton btnCadastrar = new JButton("Cadastrar");
        painelEntrada.add(btnCadastrar);

        // Espaço vazio para alinhar o botão
        painelEntrada.add(new JLabel(""));

        add(painelEntrada, BorderLayout.NORTH);

        // Área de texto para mostrar a lista de pessoas
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        // Evento do botão cadastrar
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarPessoa();
            }
        });
    }

    private void cadastrarPessoa() {
        String nome = nomeField.getText().trim();
        String idadeStr = idadeField.getText().trim();

        // Validação simples usando métodos Util (ajuste para chamadas sem Scanner)
        if (!nome.matches("[\\p{L} -]+")) {
            JOptionPane.showMessageDialog(this, "Nome inválido! Use apenas letras e espaços.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idade;
        try {
            idade = Integer.parseInt(idadeStr);
            if (idade <= 0) {
                JOptionPane.showMessageDialog(this, "Idade deve ser maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Idade inválida! Digite um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pessoa p = new Pessoa();
        p.nome = nome;
        p.idade = idade;
        p.categoria = Util.categoria(idade);
        p.status = Util.status(idade);

        pessoas.add(p);

        atualizarAreaTexto();

        // Limpar campos para próxima entrada
        nomeField.setText("");
        idadeField.setText("");
        nomeField.requestFocus();
    }

    private void atualizarAreaTexto() {
        StringBuilder sb = new StringBuilder();
        for (Pessoa p : pessoas) {
            sb.append("Nome: ").append(p.nome)
                    .append(", Idade: ").append(p.idade)
                    .append(", Categoria: ").append(p.categoria)
                    .append(", Aprovado: ").append(p.status)
                    .append("\n");
        }
        areaTexto.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Cadastro().setVisible(true);
        });
    }
}
