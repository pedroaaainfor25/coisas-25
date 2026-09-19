import javax.swing.JOptionPane;
import java.util.Scanner;

public class entradaa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);dcszd
        System.out.println("Qual e o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Bem-vindo, " + nome);

        // A linha abaixo não está correta. Vamos corrigi-la.
        // String eisso = JOptionPane.showMessageDialog("qual e o seu nome");
        JOptionPane.showMessageDialog(null, "Ola, " + nome + "! Bem-vindo ao programa.");
    }
}
