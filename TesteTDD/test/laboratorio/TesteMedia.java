package laboratorio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteMedia {
    
   Notas n;
    
    @Before
    public void setUp() {
        n = new Notas();
    }

    
   @Test
     public void mediaAprovado() {
       assertEquals(true,n.media1(8.0, 1));
     }
      @Test
     public void mediaProvaFinal() {
       assertEquals(true,n.media2(4.0));
     }
      @Test
     public void mediaReprovado() {
       assertEquals(true,n.media3(3.0));
     }
}
