/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionários;

/**
 *
 * @author GATEWAY
 */
class Funcoes {

    static double calcularSalario(int experiencia, int idade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    double sal = 0;
    public double funcao(int experiencia, int idade){
    if(experiencia >= 1){
    sal = (experiencia + idade )*0.05;
    }
     return sal;
}
}
