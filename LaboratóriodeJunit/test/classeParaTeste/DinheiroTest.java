
package classeParaTeste;

import org.junit.Test;
import static org.junit.Assert.*;

public class DinheiroTest {
  
    public DinheiroTest() {
        
    }

    @Test
    public void testSomeMethod(int quantidade, String moeda) {
           
        Dinheiro d = new Dinheiro(quantidade, moeda);
        assertEquals(quantidade, d.getQuantidade());
        assertEquals(moeda, d.getMoeda());
    }


    }
       

