package calendariovacina;

import javax.swing.JOptionPane;

public class CalendarioVacina {
    public static void main(String[] args) {

        int idade;
        String nome;
        
        nome = JOptionPane.showInputDialog("Digite seu nome");
        
        try{
            
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            
            switch (idade){
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                    JOptionPane.showMessageDialog(null, nome + ", você irá se vacinar na segunda-feira.");
                    break;
                    
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                    JOptionPane.showMessageDialog(null, nome + ", você irá se vacinar na terça-feira.");
                    break;
                
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                    JOptionPane.showMessageDialog(null, nome + ", você irá se vacinar na quarta-feira.");
                    break;
                    
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    JOptionPane.showMessageDialog(null, nome + ", você irá se vacinar na quinta-feira.");
                    break;
                    
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                    JOptionPane.showMessageDialog(null, nome + ", você irá se vacinar na sexta-feira.");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, nome + ", sua idade está fora do período de vacinação. Aguarde os próximos calendários.");
                    break;
                    
            }
            
        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(null, "Entre somente com um número inteiro", 
                "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
