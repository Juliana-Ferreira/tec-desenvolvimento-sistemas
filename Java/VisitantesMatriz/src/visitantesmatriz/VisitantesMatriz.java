package visitantesmatriz;

import javax.swing.JOptionPane;

public class VisitantesMatriz {
    public static void main(String[] args) {
        String[][] cadastro = new String[10][3];
        String lista = "";
        int i, j;
        
        for(i=0; i<10; i++) {
                JOptionPane.showMessageDialog(null, "Vamos cadastrar o " + (i+1) + "º visitante!");
                cadastro[i][0] = JOptionPane.showInputDialog("Nome completo do visitante: ");
                cadastro[i][1] = JOptionPane.showInputDialog("Cidade do visitante: ");
                cadastro[i][2] = JOptionPane.showInputDialog("Estado do visitante: ");
        }
        
        for(i=0; i<10; i++) {
            lista = lista + "Visitante nº" + (i+1) + ": ";
            for(j=0; j<3; j++) {
                lista = lista + cadastro[i][j] + " | ";
            }
            lista = lista + "\n";
        }
        
        JOptionPane.showMessageDialog(null, "Dados dos visitantes cadastrados: \n" + lista);
    }
    
}
