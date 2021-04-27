
package laboratorio;


public class Notas {
    
    double media;
    int faltas;
    
    public boolean media1(double media, int faltas){
       return (media >= 7.0 && media <= 10 && faltas < 15);
    }
     public boolean media2(double media){
       return (media >= 4.0 && media < 7.0);
    }
    public boolean media3(double media){
       return (media < 4.0);
    }
    
}
