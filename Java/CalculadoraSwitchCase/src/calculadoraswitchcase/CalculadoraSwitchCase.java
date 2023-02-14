package calculadoraswitchcase;

import javax.swing.JOptionPane;

public class CalculadoraSwitchCase {
    public static void main(String[] args) {

        double num1, num2, resultado;
        int opcao;

        JOptionPane.showMessageDialog(null, "O programa irá realizar cálculos com os números digitados.");
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção de operação:" + 
                "\n1 - Soma" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão" +
                "\n5 - Resto da divisão"));

        switch (opcao){
            case 1: {
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "O resultado para a operação soma é: " + resultado);
            }
            break;

            case 2: {
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "O resultado para a operação subtração é: " + resultado);
            }
            break;

            case 3: {
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "O resultado para a operação multiplicação é: " + resultado);
            }
            break;

            case 4: {
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "O resultado para a operação divisão é: " + String.format("%.3f", resultado));
            }
            break;

            case 5: {
                resultado = num1 % num2;
                JOptionPane.showMessageDialog(null, "O resultado para a operação resto da divisão é: " + resultado);
            }
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
            break;

        }

    }
    
}
