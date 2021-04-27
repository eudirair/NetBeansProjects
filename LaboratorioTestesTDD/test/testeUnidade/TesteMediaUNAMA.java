package testeUnidade;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteMediaUNAMA {
    
  NotasAlunosUnama n;
    
    @Before
    public void setUp() {
        n = new NotasAlunosUnama();
    }

  
     @Test
     public void testeMediaAprovado() {
       int faltas = 14;  
       double n1 = 7.0;
       double n2 = 7.0;
       double media = 0.0;
         assertEquals("Aprovado", n.calcularMedia(n1, n2, media, faltas));
     }
      @Test
     public void testeMediaProvaFinal() {
       int faltas = 0;  
       double n1 = 4.0;
       double n2 = 4.0;
       double media = 0.0;
         assertEquals("Prova Final", n.calcularMedia(n1, n2, media, faltas));
     }
      @Test
     public void testeMediaReprovado() {
       int faltas = 3;
       double n1 = 3.0;
       double n2 = 3.0;
       double media = 0.0;
         assertEquals("Reprovado", n.calcularMedia(n1, n2, media, faltas));
     }
     @Test
     public void testeMediaSegundaChamada() {
       int faltas = 3;
       double n1 = 4.0;
       double n2 = 0.0;
       double media = 0.0;
         assertEquals("Segunda Chamada", n.calcularMedia(n1, n2, media, faltas));
     }
}
