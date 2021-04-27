
package julnittest;

import java.util.Scanner;

public class JulnitTest {

    public static void main(String[] args) {
        // TODO code application logic here
        double n1, n2, divisao;
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Entre 1º numero: ");
        n1 = sc.nextDouble();
         System.out.println("Entre 1º numero: ");
        n2 = sc.nextDouble();
        
        divisao = n1/n2;
        System.out.println("Resultado da divisão: " +divisao);
    }
    
}
