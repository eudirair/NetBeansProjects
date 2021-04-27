
package teste;

public class NotasMediaAlunos {
    
    public static void main(String[] args) {
    double nota1 = 7;
    double nota2 = 6;
    double media;
    int faltas = 1;
  
    media = (nota1 + nota2)/2;
    
     if(media >=7 && media <= 10 && faltas < 15){
         System.out.println("Aprovado por media :"+ media);
        }
        if(media >=4 && media < 7 && faltas < 15){
         System.out.println("Prova Final média :"+ media); 
        }
        else if(media < 4 && media > 0){
         System.out.println("Reprovado por média :"+ media);
        }
        if (nota1 == 0 || nota2 == 0 && faltas < 15){
          System.out.println("Prova de segunda chamada  "+"Nota1 :" + nota1+ " Nota2 :" + nota2);
     } 
        if(faltas > 14){
         System.out.println("Reprovado por faltas :"+faltas);
     }
      
    }
     
}
