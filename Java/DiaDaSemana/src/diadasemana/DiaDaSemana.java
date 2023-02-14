package diadasemana;

import javax.swing.JOptionPane;

public class DiaDaSemana {
    public static void main(String[] args) {

        int dia;
        
        JOptionPane.showMessageDialog(null, "O programa irá exibir o dia da semana de acordo com o número digitado.");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7"));
        
        if (dia == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu Domingo");
        }
        else{
            if (dia == 2) {
                JOptionPane.showMessageDialog(null, "Você escolheu Segunda");
            }
            else{
                if (dia == 3) {
                    JOptionPane.showMessageDialog(null, "Você escolheu Terça");
                }
                else{
                    if (dia == 4) {
                        JOptionPane.showMessageDialog(null, "Você escolheu Quarta");
                    }
                    else{
                        if (dia == 5) {
                            JOptionPane.showMessageDialog(null, "Você escolheu Quinta");
                        }
                        else{
                            if (dia == 6) {
                                JOptionPane.showMessageDialog(null, "Você escolheu Sexta");
                            }
                            else{
                                if (dia == 7) {
                                    JOptionPane.showMessageDialog(null, "Você escolheu Sábado");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Você não digitou um número de 1 a 7.");
                                }
                            }
                        }
                    }
                }
            }
        }
            
        
    }
    
}
