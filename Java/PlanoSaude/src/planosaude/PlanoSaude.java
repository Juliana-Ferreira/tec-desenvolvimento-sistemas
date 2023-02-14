package planosaude;

import javax.swing.JOptionPane;

public class PlanoSaude {
    public static void main(String[] args) {
    
    int idade;

    JOptionPane.showMessageDialog(null, "O programa irá apresentar o valor do plano de saúde a ser pago.");

    try{
        idade = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção de idade em que você se encaixa:" + 
                "\n1 - Entre 0 e 9 anos" +
                "\n2 - Entre 10 e 30 anos" +
                "\n3 - Entre 30 e 60 anos" +
                "\n4 - Mais de 60 anos"));

        switch (idade){
            case 1:
                JOptionPane.showMessageDialog(null, "O valor a ser pago será R$280,00");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O valor a ser pago será R$250,00");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O valor a ser pago será R$295,00");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O valor a ser pago será R$330,00");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entre somente com um número inteiro", 
                "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
