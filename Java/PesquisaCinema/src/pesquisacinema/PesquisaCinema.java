package pesquisacinema;

import javax.swing.JOptionPane;

public class PesquisaCinema {
    public static void main(String[] args) {
        int idade, cont=0, otimo=0, contRuim=0, contPessimo=0;
        char opiniao;
        double media=0, porcentagem;
        
        while (cont<40) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            opiniao = JOptionPane.showInputDialog("Digite sua opinião em relação ao filme: "
                    + "\n A - Ótimo "
                    + "\n B - Bom"
                    + "\n C - Regular "
                    + "\n D - Ruim "
                    + "\n E - Péssimo").charAt(0);
            
            switch (opiniao){
                case 'a':
                case 'A':
                    otimo += 1;
                    JOptionPane.showMessageDialog(null, "Agradecemos sua opinião!");
                    break;
                    
                case 'b':
                case 'B':
                    JOptionPane.showMessageDialog(null, "Agradecemos sua opinião!");
                    break;
                    
                case 'c':
                case 'C':
                    JOptionPane.showMessageDialog(null, "Agradecemos sua opinião!");
                    break;
                    
                case 'd':
                case 'D':
                    contRuim += 1;
                    media = media + idade;
                    JOptionPane.showMessageDialog(null, "Agradecemos sua opinião!");
                    break;
                    
                case 'e':
                case 'E':
                    contPessimo += 1;
                    JOptionPane.showMessageDialog(null, "Agradecemos sua opinião!");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta.");
                    break;
            }

            cont++;
        }
        
        media = media/contRuim;
        porcentagem = (contPessimo*100)/40;
        
        JOptionPane.showMessageDialog(null, " A quantidade de respostas 'ótimo' é: " + otimo 
        + "\n A média de idade das pessoas que responderam 'ruim' é: " + (int)Math.round(media) + " anos" 
        + "\n A porcentagem de respostas 'péssimo' é: " + porcentagem + "%");
        
    }
    
}
