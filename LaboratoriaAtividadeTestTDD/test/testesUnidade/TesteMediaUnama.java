package testesUnidade;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteMediaUnama {
  
    NotasMediaAlunos n;
  
    @Before
    public void setUp() {
        n = new NotasMediaAlunos();
    }

    
     @Test
     public void testMediaAprovado() {
        int faltas = 1; 
        double n1 = 7.0;
        double n2 = 7.0;
        double media = 0.0;
         assertEquals("Aprovado", n.calcularMedia(n1, n2, media, faltas));
     }
      @Test
     public void testMediaProvaFinal() {
        int faltas = 1; 
        double n1 = 5.0;
        double n2 = 4.0;
        double media = 0.0;
         assertEquals("Prova Final", n.calcularMedia(n1, n2, media, faltas));
     }
      @Test
     public void testMediaReprovado() {
        int faltas = 16; 
        double n1 = 3.0;
        double n2 = 3.5;
        double media = 0.0;
         assertEquals("Reprovado", n.calcularMedia(n1, n2, media, faltas));
     }
     @Test
     public void testMediaSegundaChamada() {
        int faltas = 1; 
        double n1 = 7.0;
        double n2 = 0.0;
        double media = 0.0;
         assertEquals("Segunda Chamada", n.calcularMedia(n1, n2, media, faltas));
     }
}
