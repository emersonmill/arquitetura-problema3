package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection criarConexao() throws SQLException {
        Connection con = null;

        String URL = "jdbc:derby:clientes;create = true;";
        con = DriverManager.getConnection(URL);
        return con;
    }
}
