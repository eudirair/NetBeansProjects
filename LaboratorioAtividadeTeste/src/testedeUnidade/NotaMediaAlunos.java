
package testedeUnidade;


public class NotaMediaAlunos {
    
    public String calcularMedia(double nota1, double nota2, double  media, int faltas){
       media = (nota1 + nota2)/2;
       if(media >= 7 && media<= 10 && faltas <15){
          return "Aprovado";
       }
       if(media >= 4 && media < 7 && faltas < 15){
          return "Prova Final";
       }
       if(media < 4 && media > 0){
          return "Reprovado";
       }
       if(nota1 == 0 || nota2 == 0){
          return "Segunda Chamada";
       }
       if(media >= 7 && media <=10 && media >= 4 && media < 7 && faltas > 14){
       }
        return "Reprovado por faltas";
    }
    
}
