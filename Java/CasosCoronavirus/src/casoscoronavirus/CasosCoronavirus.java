package casoscoronavirus;

import java.util.Scanner;

public class CasosCoronavirus {
    public static void main(String[] args) {
        
        double casosBrasil;
        double casosRegiao;
        double percentual;
        String nomeRegiao;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("O programa irá calcular a porcentagem de casos de coronavírus em uma região do Brasil.");
        
        System.out.println("Digite o número de casos de coronavírus no Brasil:");
        casosBrasil = leitor.nextDouble();
        
        System.out.println("Digite o nome da região:");
        nomeRegiao = leitor.next();
        
        System.out.println("Digite o número de casos de coronavírus na região:");
        casosRegiao = leitor.nextDouble();
        
        percentual = (casosRegiao * 100) / casosBrasil;
                
        System.out.println("Nome da região: " + nomeRegiao);
        System.out.println("Número de casos no Brasil: " + (int)casosBrasil);
        System.out.println("Número de casos na região: " + (int)casosRegiao);
        System.out.println("Percentual da região em relação ao total no Brasil: " + String.format("%.2f", percentual) + "%");
        
    }
    
}
