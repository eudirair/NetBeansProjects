// DECLARANDO PACOTE DA CLASSE
package testTDD;

/*
  * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GATEWAY
 */
public class ProcessoAvaliacao {
    // DECLARANDO A CLASSE DE TESTE
    Notas unama;
   
    // INICIALIZANDO A CLASSE DECLARADA
    @Before
    public void setUp() {
        unama = new Notas();
    }
    
     // COMEÇO DOS TESTES DE UNIDADES.
     @Test
     public void mediaAprovado() {
         assertEquals(true,unama.media1(7));
     }
      @Test
     public void mediaProvaFinal() {
         assertEquals(true,unama.media2(4.0));
     }
      @Test
     public void mediaReprovado() {
         assertEquals(true,unama.media3(3.0));
     }
}
