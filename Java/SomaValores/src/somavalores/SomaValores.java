package somavalores;

// importação da biblioteca com a ferramenta de leitura Scanner
import java.util.Scanner;

public class SomaValores {
    public static void main(String[] args) {
        
        // declaração de variáveis
        int numero1;
        int numero2;
        int soma;
        
        // habilitação do leitor Scanner
        Scanner leitor = new Scanner(System.in);
        
        // início do programa e leitura de valores
        System.out.println("Programa Soma irá calcular a soma entre dois números");
        
        System.out.println("Digite o primeiro valor:");
        numero1 = leitor.nextInt();
        
        System.out.println("Digite o segundo valor:");
        numero2 = leitor.nextInt();
        
        // processamento do programa
        soma = numero1 + numero2;
        
        // saída de dados com o resultado do processamento
        System.out.println("O resultado da soma é " + soma);
        
    }
    
}
