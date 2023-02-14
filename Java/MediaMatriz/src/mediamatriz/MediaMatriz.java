package mediamatriz;

import javax.swing.JOptionPane;

public class MediaMatriz {
    public static void main(String[] args) {
        double nota[][] = new double[10][4];
        double media = 0;
        String exibir = "";
        int i, j;
        
        for(i=0; i<10; i++) {
            for(j=0; j<3; j++) {
                nota[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (j+1) + "ª nota do aluno " + (i+1) + ":"));
            }
        }
        
        for(i=0; i<10; i++) {
            for(j=0; j<3; j++) {
                media = media + nota[i][j];
            }
            nota[i][3] = media/3;
            nota[i][3] = Math.round(nota[i][3]*10)/10.0;

            media = 0;
        }
        for(i=0; i<10; i++) {
            exibir = exibir + "Aluno " + (i+1) + " = ";
            for(j=0; j<4; j++) {
                exibir = exibir + nota[i][j] + " | ";
            }
            exibir = exibir + "\n";
        }
        
        JOptionPane.showMessageDialog(null, exibir);
    }
    
}
