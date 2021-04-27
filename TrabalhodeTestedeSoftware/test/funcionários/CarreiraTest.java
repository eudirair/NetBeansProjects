/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionários;

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
public class CarreiraTest {
    
    public CarreiraTest() {
         Carreira Funcoes;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularSalario method, of class Carreira.
     */
    @Test
    public void testCalcularSalario() {
        System.out.println("tempo de experiencia");
         System.out.println("idade");
        int experiencia = 0;
        int idade = 0;
       experiencia = Integer.parseInt("1 anos de experiencia");
       idade = Integer.parseInt("idade 20 anos");
        assertEquals(0.05,Funcoes.calcularSalario(experiencia, idade),0.0);
    }
    
}
