package mediavetores;

import javax.swing.JOptionPane;

public class MediaVetores {
    public static void main(String[] args) {
        int i;
        double[] nota = new double[5];
        double media = 0;
        
        for(i=0;i<5;i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i+1) + "ª nota do aluno:"));
        }
        for(i=0;i<5;i++) {
            media = media + nota[i];
        }
        
        media = media/5;
        
        if(media >= 5){
            JOptionPane.showMessageDialog(null, "A média do aluno é: " + String.format("%.2f", media)
            + "\nO aluno poderá seguir para o próximo módulo.");
        }
        else{
            JOptionPane.showMessageDialog(null, "A média do aluno é: " + media 
            + "\nO aluno não poderá seguir para o próximo módulo.");
        }
        
    }
    
}
