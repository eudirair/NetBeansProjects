
package cadastro;

//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;


public class Funcionario_DAO {
    
    public boolean inserirFuncionario(Funcionario f) {
		DataBase banco = new DataBase();
		try {
			String inserirStr = "insert into funcionarios (func_nome, func_idade, func_cpf, func_salario, func_exp)"
					+ " values ('"+f.getNome()+"','"+f.getIdade()+"','"+f.getCpf()+"','"+f.getSalario()+"','"+f.getExp()+"')";
			banco.connectar();
			Statement stmt;
			stmt = banco.con.createStatement();
			int numInserir = stmt.executeUpdate(inserirStr);
			return true;
		} catch (SQLException e) {
			System.out.println("Problema de Execução da Instrução SQL.");
			e.printStackTrace();
			return false;
		}		
	}

    
}
