package areatriangulo;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
            
        float base;
        float altura;
        float area;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("O programa irá calcular a área de um triângulo com base nos dados fornecidos");
        System.out.println("Digite o valor da base:");
        base = leitor.nextFloat();
        
        System.out.println("Digite o valor da altura:");
        altura = leitor.nextFloat();
        
        area = (base * altura)/2;
        
        System.out.println("A área do triângulo é " + area);
        
       
    }
}
