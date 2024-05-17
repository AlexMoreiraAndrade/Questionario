/* Cabeçario */
package trabalhodejava;

import javax.swing.JOptionPane;

public class Cabecario {
    public static void escrevaCabecario() {
        String Nome = JOptionPane.showInputDialog("Nome: ");
        JOptionPane.showMessageDialog(null,
                "Nome Completo: " + Nome + "\n" +
                        "Univesidade: UNIFAN\n" +
                        "Disciplina: Algoritmos e Programação II \n" +
                        "Professor: Brenno\n" +
                        "Projeto: Questionário java\n" +
                        "Boa sorte jogador " + Nome.substring(0, Nome.length()));
    }
}
