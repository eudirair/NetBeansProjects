
package cadastro;


public class CadastroFuncionario {
   private String nome;
    int idade;
    double cpf;
    String experience;
    double salario;
    
    public CadastroFuncionario(String nome,int idade,double cpf,String experience,double salario){
          //this.nome = nome;
          this.idade = idade;
          this.cpf = cpf;
          this.experience = experience;
          this.salario = salario;
    }

  

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public boolean cadastrarPessoa(String nome,int idade, double cpf){
        return true;
    
    }
}
