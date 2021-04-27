
package testTDD;
/**
 *
 * @author GATEWAY
 */
public class Notas {
 
   double media; 
   
   public boolean media1(double media){
      return (media >= 7.0 && media <= 10.0);
   }
   public boolean media2(double media){
      return (media >= 4.0 && media < 7.0);
   }
   public boolean media3(double media){
      return (media < 4.0); 
   }
       /*
       if(media >= 7.0 && media <= 10.0){
           System.out.println("Aprovado");
       }
      if(media >= 4.0 && media < 7.0){
          System.out.println("Prova Final");
      }
      if(media < 4.0){
          System.out.println("Reprovado");
      }
       return 0;
   }*/
           

}

