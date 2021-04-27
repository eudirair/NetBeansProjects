package testeTDD;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GATEWAY
 */
public class TesteMedia {
    
    Media n;
   
    
    @Before
    public void setUp() {
        n = new Media();
    }

    // TESTANDO OS METODOS.
   
     @Test
     public void Aprovado() {
         assertEquals(true,n.mediaAprovado(7.0 , 1));
     }
     @Test
     public void SegundaChamada() {
         assertEquals(true,n.segundaChamada(2 , 0));
     }
}
