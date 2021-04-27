package testeUnidade;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteMediaUnama {
    
   NotasAlunos n;
    
    @Before
    public void setUp() {
        n = new NotasAlunos();
    }

   
     @Test
     public void testeMediaAprovado() {
       double n1 = 7;
       double n2 = 7;
       double media = 0.0;
         assertEquals("Aprovado",n.calculaMedia(n1, n2, media));
     }
}
