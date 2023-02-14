package padariajoaquim;

import javax.swing.JOptionPane;

public class PadariaJoaquim {
    public static void main(String[] args) {

        String produto;
        double valor, novoValor;
        int i;
        
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) à Padaria do Joaquim. Entre com com os produtos da semana de promoções.");
        
        for(i=1; i<=10; i++) {
            
            produto = JOptionPane.showInputDialog("Digite o nome do produto " + i);
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais do produto " + i));
            
            novoValor = (valor*50)/100;
            
            JOptionPane.showMessageDialog(null, "O produto " + produto + " será vendido por: R$" + String.format("%.2f", novoValor));
        }
        
    }
    
}
