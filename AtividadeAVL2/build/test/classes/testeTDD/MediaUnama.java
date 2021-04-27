
package testeTDD;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MediaUnama {
    
 NotasAlunos n;
    
    @Before
    public void setUp() {
        n = new NotasAlunos();
    }

  
     @Test
    public void testeMediaAprovado() {
        int faltas = 1;
        double n1 = 4.0;
        double n2 = 10.0;
        double media = 0.0;
         assertEquals("Aprovado", n.calculaMedia(n1, n2, media, faltas));
    }
     @Test
    public void testeMediaProvaFinal() {
        int faltas = 0;
        double n1 = 2.0;
        double n2 = 6.0;
        double media = 0.0;
         assertEquals("Prova Final", n.calculaMedia(n1, n2, media,faltas));
    }
     @Test
    public void testeMediaReprovado() {
        int faltas = 0 ;
        double n1 = 3.5;
        double n2 = 4.0;
        double media = 0.0;
         assertEquals("Reprovado", n.calculaMedia(n1, n2, media, faltas));
    }
     @Test
    public void testeMediaSegundaChamada() {
        int faltas = 1;
        double n1 = 0.0;
        double n2 = 0.0;
        double media = 0;
         assertEquals("Segunda Chamada", n.calculaMedia(n1, n2, media, faltas));
    }
    @Test
    public void testeMediaReprovadoPorFaltas() {
        int faltas = 17 ;
        double n1 = 4.0;
        double n2 = 4.0;
        double media = 0.0;
         assertEquals("Reprovado por faltas", n.calculaMedia(n1, n2, media, faltas));
}

}