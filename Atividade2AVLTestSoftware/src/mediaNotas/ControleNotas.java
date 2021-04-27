
package mediaNotas;

import java.util.Scanner;


public class ControleNotas {
    
    public static void main(String[] args) {
        double nota1 , nota2 ;
        int faltas ;
        
        CalculaMediaNotas n = new CalculaMediaNotas();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com as notas para calculo da media e número de faltas.");
        System.out.println("Nota 1 :");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2 :");
        n.nota2 = sc.nextDouble();
        System.out.println("Número de faltas :");
        n.faltas = sc.nextInt();
        
       
          
    }
    
}
