package dadosFuncionario;

import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.Connection;

import java.sql.Statement;

public class DataBase {

    public static Connection con;
    static boolean conectado = false;
    static String url = "jdbc:postgresql://127.0.0.1:5432/teste";
    static String login = "adonias";
    static String senha = "@12345";
    public static Statement stmt;

    public static boolean connectar() {
        if (conectado == false) {
            try {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection(url, login, senha);
                System.out.println("Conectado com sucesso");
                conectado = true;
            } catch (Exception e) {
                System.out.println("Problema de conexão");
                e.printStackTrace();
            }
        }
        return conectado;
    }

}
