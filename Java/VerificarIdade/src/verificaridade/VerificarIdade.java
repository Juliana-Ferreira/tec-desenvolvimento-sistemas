package verificaridade;

import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {

        int idade;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("O programa irá verificar se você é maior ou menor de idade.");
        System.out.println("Digite sua idade:");
        idade = leitor.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }
        else {
            System.out.println("Você é menor de idade.");
        }
    }
}
