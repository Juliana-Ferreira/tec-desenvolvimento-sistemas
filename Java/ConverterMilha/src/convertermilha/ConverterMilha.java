package convertermilha;

import javax.swing.JOptionPane;

public class ConverterMilha {
    public static void main(String[] args) {

    double milha, km;

    JOptionPane.showMessageDialog(null, "O programa irá converter o valor em milhas para Km.");
    milha = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em milhas:"));

    km = milha * 1.609;

    JOptionPane.showMessageDialog(null, "O valor em Km é: " + km);

    }
    
}
