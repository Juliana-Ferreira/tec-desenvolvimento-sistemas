package lernumerosvetor;

import javax.swing.JOptionPane;

public class LerNumerosVetor {
    public static void main(String[] args) {
        int i;
        int[] valor = new int[10];
        String lista = "";
        
        for(i=0;i<10;i++) {
            valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor inteiro:"));
            
            if(i%2==0) {
                valor[i] = valor[i]*2;
            }
        }
        
        for(i=0;i<10;i++) {
            lista = lista + String.valueOf(valor[i]) + "\n";
        }
        
        JOptionPane.showMessageDialog(null, lista);
        
    }
    
}
