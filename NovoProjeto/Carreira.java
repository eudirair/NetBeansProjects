package model;

public class Carreira {
	public double calcularSalario(int exp) {
		double salario = 954;
		
		/*if(exp>=1 && exp<5) {
			return salario + (salario * 5/100);
		}else if (exp>=5 && exp<10) {
			return salario + (salario * 10/100);
		}else if (exp>=10 && exp<15) {
			return salario + (salario * 15/100);
		}else if (exp>=15 && exp<20) {
			return salario + (salario * 20/100);
		}else if (exp>=20) {
			return salario + (salario * 25/100);
		}else {
			return salario;
		}
		*/
		if(exp==1) {
			return salario + (salario * 5/100);
		}else if (exp==5) {
			return salario + (salario * 10/100);
		}else if (exp==10) {
			return salario + (salario * 15/100);
		}else if (exp==15) {
			return salario + (salario * 20/100);
		}else if (exp>=20) {
			return salario + (salario * 25/100);
		}else {
			return salario;
		}
	}
}
