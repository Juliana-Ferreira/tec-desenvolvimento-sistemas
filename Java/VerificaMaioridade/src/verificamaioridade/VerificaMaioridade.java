package verificamaioridade;

import javax.swing.JOptionPane;

public class VerificaMaioridade {
    public static void main(String[] args) {
        
        String nome;
        int idade, contador;

        JOptionPane.showMessageDialog(null, "O programa irá verificar a idade de 10 pessoas.");
        
        for (contador=0; contador<10; contador++){
            
            nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa"));
            
            if (idade >= 18){
                JOptionPane.showMessageDialog(null, nome + " é maior de idade.");
            }
            else{
                JOptionPane.showMessageDialog(null, nome + " é menor de idade.");
            }
            
        }
        
    }
    
}
