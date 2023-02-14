package agenda10;

import javax.swing.JOptionPane;

public class Agenda10 {
    public static void main(String[] args) {
        int[][] valores = new int[10][10];
        int soma = 0;
        String matriz = "";
        
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro na posição [" + i + "][" + j + "] da matriz:"));
                soma = soma + valores[i][j];
            }
        }
        for(int i=0; i<10; i++) {
            matriz = matriz + "| ";
            for(int j=0; j<10; j++) {
                matriz = matriz + valores[i][j] + " | ";
            }
            matriz = matriz + "\n";
        }
        
        JOptionPane.showMessageDialog(null, "Matriz digitada:\n" + matriz + "\nA soma dos números digitados é igual a " + soma);
        
    }
    
}
