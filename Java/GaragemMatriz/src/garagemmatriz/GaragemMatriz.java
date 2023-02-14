package garagemmatriz;

import javax.swing.JOptionPane;

public class GaragemMatriz {
    public static void main(String[] args) {
        String[][] vaga = new String[2][4];
        String exibir = "";
        
        JOptionPane.showMessageDialog(null, "Vamos cadastrar os carros em cada vaga da garagem.");
        
        for(int i=0; i<2; i++) {
            for(int j=0; j<4; j++) {
                vaga[i][j] = JOptionPane.showInputDialog((i+1) + "º Andar | Vaga nº" + (j+1) 
                        + "\nDigite a placa do carro a ser cadastrado na vaga:");
            }
        }
        for(int i=0; i<2; i++) {
            exibir = exibir + (i+1) + "º Andar = ";
            for(int j=0; j<4; j++) {
                exibir = exibir + vaga[i][j] + " | ";
            }
            exibir = exibir + "\n";
        }
        
        JOptionPane.showMessageDialog(null, "Carros cadastrados na garagem:\n" + exibir);
    }
    
}
