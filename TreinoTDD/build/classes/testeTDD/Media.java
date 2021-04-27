
package testeTDD;

public class Media {
    double nota1, nota2;
    double media;
    int faltas;
    
    public boolean mediaAprovado(double media, int faltas){
      return (media >= 7 && media <= 10 && faltas < 15);
    }
    
    public boolean segundaChamada(double nota1, double nota2){
      return (nota1 == 0 || nota2 == 0);
    }
    
}
