
package dadosFuncionario;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FuncionarioTest {
    
    
      Funcionario p;
    
    
    @Before
    public void setUp() {
        p = new Funcionario();
    }

    /**
     * Test of getNome method, of class Funcionario.
     */
    @Test
    public void testGetNome() {
        assertEquals("pedro",p.getNome());
    }

    /**
     * Test of setNome method, of class Funcionario.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getCpf method, of class Funcionario.
     */
    @Test
    public void testGetCpf() {
        assertEquals("12345678901",p.getCpf());
    }

    /**
     * Test of setCpf method, of class Funcionario.
     */
    @Test
    public void testSetCpf() {
    }

    /**
     * Test of getIdade method, of class Funcionario.
     */
    @Test
    public void testGetIdade() {
        assertEquals(44,p.getIdade());
    }

    /**
     * Test of setIdade method, of class Funcionario.
     */
    @Test
    public void testSetIdade() {
    }

    /**
     * Test of getExp method, of class Funcionario.
     */
    @Test
    public void testGetExp() {
        assertEquals(1,p.getExp());
    }

    /**
     * Test of setExp method, of class Funcionario.
     */
    @Test
    public void testSetExp() {
    }

    /**
     * Test of getSalario method, of class Funcionario.
     */
    @Test
    public void testGetSalario() {
        //assertEquals("6",f.getSalario());
        assertEquals(100, p.getSalario(), 0);
    }

    /**
     * Test of setSalario method, of class Funcionario.
     */
    @Test
    public void testSetSalario() {
    }

    /**
     * Test of cadastrarPessoa method, of class Funcionario.
     */
    @Test
    public void testCadastrarPessoa_HttpServletRequest() {
       // assertTrue( p.cadastrarPessoa("pedro", 44, "12345678901", 1));
    }

    /**
     * Test of cadastrarPessoa method, of class Funcionario.
     */
    @Test
    public void testCadastrarPessoa_4args() {
    }
    
}
