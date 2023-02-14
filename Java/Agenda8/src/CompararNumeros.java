import javax.swing.JOptionPane;

public class CompararNumeros {
    public static void main(String[] args) {
        int cont, x = 0;
        double num, maior = 0;
        
        cont = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números a ser informado:"));
        
        while (x < cont){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
            
            if (num > maior){
                maior = num;
            }
            x++;
        }
        
        JOptionPane.showMessageDialog(null, "O maior valor digitado foi " + maior);
        
    }
    
}
