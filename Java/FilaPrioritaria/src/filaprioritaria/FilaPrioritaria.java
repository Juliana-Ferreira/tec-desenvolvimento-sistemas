package filaprioritaria;

import javax.swing.JOptionPane;

public class FilaPrioritaria {
    public static void main(String[] args) {

        int idade;
        
        JOptionPane.showMessageDialog(null, "O programa irá te encaminhar para a fila de atendimento de acordo com sua idade.");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            
        if (idade<60){
            JOptionPane.showMessageDialog(null, "Encaminhe-se para a fila comum.");
        }
        else{
            if (idade>=60 && idade<=80){
                    JOptionPane.showMessageDialog(null, "Encaminhe-se para a fila prioritária.");                    
            }
            else{
                    JOptionPane.showMessageDialog(null, "Encaminhe-se para a fila 80+."); 
            }

        }

    }
    
}
