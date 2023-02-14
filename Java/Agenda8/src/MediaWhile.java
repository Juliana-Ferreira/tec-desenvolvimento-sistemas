import javax.swing.JOptionPane;

public class MediaWhile {
    public static void main(String[] args) {
        int i = 0;
        double n, media = 0;
        
        while (i<50) {
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            media = media + n;
            i++;
        }
        
        media = media/50;
        JOptionPane.showMessageDialog(null, "A média dos números digitados é igual a " + String.format("%.2f", media));
        
    }
    
}
