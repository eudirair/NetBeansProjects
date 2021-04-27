
package testeUnidade;


public class NotasAlunos {
    
    public String calculaMedia(double n1, double n2, double media){
      if(n1 >= 7 && n2 <= 10 && n2 >= 7 && n1 <= 10){
         media = (n1 + n2)/2;
         return "Aprovado";
      }
        return null;
      
    }
}
