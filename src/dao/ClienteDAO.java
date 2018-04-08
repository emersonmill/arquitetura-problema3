/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import model.Cliente;
import model.Pais;

/**
 *
 * @author emerson
 */
public class ClienteDAO {

    private Connection con;
    private ResultSet rs;
    private Statement stm;

    public void adicionarCliente(Cliente cliente) throws Exception {
        String QUERY = "INSERT INTO cliente VALUES (DEFAULT,'" + cliente.getNome() + "','" + cliente.getTelefone()+ "'," + cliente.getLimiteCredito()+ "," + cliente.getIdade()+ "," + cliente.getPais().getId()+ ")";

        try {
            con = Conexao.criarConexao();
            stm = con.createStatement();
            stm.executeUpdate(QUERY);

        } catch (SQLException e) {
            System.out.println("Erro ao inserir na tabela");

        } finally {
            this.fecha(rs, stm, con);

        }

    }

    public Set<Cliente> listar() {
        Set<Cliente> lista = new HashSet<>();

        String QUERY = "SELECT * FROM cliente ORDER BY id";

        try {

            con = Conexao.criarConexao();
            stm = con.createStatement();
            rs = stm.executeQuery(QUERY);
            while (rs.next()) {

                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                double limiteCredito = rs.getDouble("limiteCredito");
                int idade = rs.getInt("idade");
                int id_pais = rs.getInt("id_pais");

                PaisDAO paisDAO = new PaisDAO();
                Pais pais = paisDAO.buscarPorID(id_pais);

                Cliente cliente = new Cliente(id, nome, telefone, limiteCredito, idade, pais);

                lista.add(cliente);
            }

        } catch (SQLException e) {

            System.out.println("Erro ao consultar tabela");

        } finally {
            this.fecha(rs, stm, con);
        }

        return lista;
    }

    public void fecha(ResultSet rs, Statement stm, Connection con) {

        if (rs != null) {

            try {

                rs.close();

            } catch (SQLException e) {

            }
        }

        if (stm != null) {

            try {

                stm.close();

            } catch (SQLException e) {

            }

        }

        if (con != null) {

            try {
                con.close();
            } catch (SQLException e) {

            }
        }
    }

}
