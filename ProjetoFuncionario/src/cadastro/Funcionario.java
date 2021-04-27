
package cadastro;

import javax.servlet.http.HttpServletRequest;
import cadastro.Carreira;
import cadastro.Funcionario_DAO;


public class Funcionario {
    private String nome;
	private String cpf;
	private int idade;
	private int exp;
	private double salario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean cadastrarPessoa(HttpServletRequest request) {
		
		Funcionario f = new Funcionario();
		Carreira c = new Carreira();
		Funcionario_DAO i = new Funcionario_DAO();
		
		f.setNome(request.getParameter("nome"));
		f.setIdade(Integer.parseInt(request.getParameter("idade")));
		f.setCpf(request.getParameter("cpf"));
		f.setExp((Integer.parseInt(request.getParameter("exp"))));
		f.setSalario(c.calcularSalario(f.getExp()));
		
		if(i.inserirFuncionario(f)==true) {
			return true;
		}else{
			return false;
		}

	}
	public boolean cadastrarPessoa(String nome, int idade, String cpf, int exp) {
		
		Funcionario f = new Funcionario();
		Carreira c = new Carreira();
		Funcionario_DAO i = new Funcionario_DAO();
		
		f.setNome(nome);
		f.setIdade(idade);
		f.setCpf(cpf);
		f.setExp(exp);
		f.setSalario(c.calcularSalario(f.getExp()));
		
		if(i.inserirFuncionario(f)==true) {
			return true;
		}else{
			return false;
		}
	}

    
}
