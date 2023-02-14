package diadasemanaswitchcase;

import javax.swing.JOptionPane;

public class DiaDaSemanaSwitchCase {
    public static void main(String[] args) {

        int dia;
        String m;

        JOptionPane.showMessageDialog(null, "O programa irá apresentar um dia da semana de acordo com o número digitado.");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 7"));
        
        switch (dia){
        case 1:
            m = "Domingo";
            break;
        case 2:
            m = "Segunda";
            break;
        case 3:
            m = "Terça";
            break;
        case 4:
            m = "Quarta";
            break;
        case 5:
            m = "Quinta";
            break;
        case 6:
            m = "Sexta";
            break;
        case 7:
            m = "Sábado";
            break;

        default:
            m = "Dia inválido";
            break;
        }

        JOptionPane.showMessageDialog(null, "O dia escolhido foi: " + m);

    }
    
}
