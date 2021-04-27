package testedeUnidade;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteMediaAlunoUnama {
    
   NotaMediaAlunos n;
    
    @Before
    public void setUp() {
        n = new NotaMediaAlunos();
    }

    
     @Test
     public void testeAprovado() {
      int faltas = 1;   
      double nota1 = 7.0;
      double nota2 = 7.0;
      double media = 0;
         assertEquals("Aprovado", n.calcularMedia(nota1, nota2, media, faltas));
     }
      @Test
     public void testeProvaFinal() {
      int faltas = 2;   
      double nota1 = 2.0;
      double nota2 = 6.0;
      double media = 0;
         assertEquals("Prova Final", n.calcularMedia(nota1, nota2, media, faltas));
     }
     @Test
     public void testeReprovado() {
      int faltas = 2;   
      double nota1 = 3.5;
      double nota2 = 4.0;
      double media = 0;
         assertEquals("Reprovado", n.calcularMedia(nota1, nota2, media, faltas));
     }
     @Test
     public void testeSegundaChamada() {
      int faltas = 2;   
      double nota1 = 0.0;
      double nota2 = 0.0;
      double media = 0;
         assertEquals("Segunda Chamada", n.calcularMedia(nota1, nota2, media, faltas));
     }
     @Test
     public void testeReprovadoPorFaltas() {
      int faltas = 16;   
      double nota1 = 4.0;
      double nota2 = 4.0;
      double media = 0;
         assertEquals("Reprovado por faltas", n.calcularMedia(nota1, nota2, media, faltas));
     }
}
