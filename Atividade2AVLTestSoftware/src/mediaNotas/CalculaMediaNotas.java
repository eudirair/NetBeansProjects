
package mediaNotas;

public class CalculaMediaNotas {
    
    double nota1;
    double nota2;
    double media;
    int faltas;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia(double nota1, double  nota2, int faltas) {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        if(faltas < 15);
        this.faltas = faltas;
    }
     public String calculaMedia(double n1, double n2, int faltas ){
        if(n1 >= 7 && n2 <= 10 && n2 >= 7 && n1 <= 10 && faltas < 15){
         media = (n1 + n2)/2;
        return "Aprovado";
      }
         if(n1 >= 4 && n1 < 7 && n2 >= 4 && n2 < 7 && faltas < 15){
         media = (n1 + n2)/2;
        return "Prova Final";
         }
           if(n1 < 4 && n1 >= 0 && n2 < 4 && n2 >= 0 && faltas < 15){
         media = (n1 + n2)/2;
        return "Reprovado";
        
         }if( n1 == 0 || n2 == 0 && faltas < 15)  {
              return "Segunda Chamada";
        }
        return null;   
    }
    
    
}
