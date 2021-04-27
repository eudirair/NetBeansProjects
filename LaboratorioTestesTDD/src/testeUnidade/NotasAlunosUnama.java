
package testeUnidade;


public class NotasAlunosUnama {
    
    public String calcularMedia(double n1, double n2, double media, int faltas){
      if(n1 >= 7 && n1 <= 10 && n2 >= 7 && n2 <= 10 && faltas < 15){
         media = (n1 + n2)/2;
         return "Aprovado";
      }
      if(n1 >= 4 && n1 < 7 && n2 >= 4 && n2 < 7){
         media = (n1 + n2)/2;
         return "Prova Final";
      }
      if(n1 < 4 && n1 >= 0 && n2 < 4 && n2 >= 0){
          media = (n1 + n2)/2;
          return "Reprovado";
      }
      if(n1 == 0 || n2 == 0 && faltas < 15){
         return "Segunda Chamada";
      }
        return null;
    }
}