
package testeTDD;

public class NotasAlunos {
  
    public String calculaMedia(double n1, double n2, double media, int faltas ){
        media = (n1 + n2)/2;
       
         if(media >= 7 && media <= 10 && faltas < 15){
        return "Aprovado";
        
         } 
         if(media >= 4 && media < 7 && faltas < 15){
         return "Prova Final";
         } 
           if(media < 4 && media > 0){
         return "Reprovado";
        
         }if (n1 == 0 || n2 == 0) {
         return "Segunda Chamada";
        }
           if(media >= 7 && media <= 10 && media >= 4 && media < 7 && faltas >14){
             }
        return "Reprovado por faltas";
    }
    
   /* public String segundaChamada(double n1, double n2){
        if( n1 == 0 || n2 == 0){ 
           return "Segunda Chamada"; 
        }
        return null;
    }*/
    
 }
