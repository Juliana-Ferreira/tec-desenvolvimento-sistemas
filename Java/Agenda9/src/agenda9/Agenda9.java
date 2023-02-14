package agenda9;

import javax.swing.JOptionPane;

public class Agenda9 {
    public static void main(String[] args) {
        int i;
        double[] salario = new double[2000];
        double media = 0;
        
        for (i=0; i<2000; i++) {
            salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do " + (i+1) + "º funcionário:"));
        }
        
        for (i=0; i<2000; i++) {
            media = media + salario[i];
        }
        
        media = media/2000;
        
        JOptionPane.showMessageDialog(null, "A média de salário dos funcionários é: R$" + String.format("%.2f", media));
    }
    
}
