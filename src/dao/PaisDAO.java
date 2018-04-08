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
import javax.swing.JOptionPane;
import model.Pais;

/**
 *
 * @author emerson
 */
public class PaisDAO {

    private Connection con;
    private ResultSet rs;
    private Statement stm;

    public void adicionarPais(Pais pais) throws Exception {
        String QUERY = "INSERT INTO pais VALUES (DEFAULT,'" + pais.getNome() + "','" + pais.getSigla() + "'," + pais.getDigitos() + ")";

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

    public Set<Pais> getListaPaises() {
        Set<Pais> lista = new HashSet<>();

        String QUERY = "SELECT * FROM pais ORDER BY id";

        try {

            con = Conexao.criarConexao();
            stm = con.createStatement();
            rs = stm.executeQuery(QUERY);
            while (rs.next()) {

                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String sigla = rs.getString("sigla");
                int digitos = rs.getInt("digitos");

                Pais pais = new Pais();
                pais = new Pais(id, nome, sigla, digitos);

                lista.add(pais);
            }

        } catch (SQLException e) {

            System.out.println("Erro ao consultar tabela");

        } finally {
            this.fecha(rs, stm, con);
        }

        return lista;
    }

    public Pais buscarPorID(Integer id) {

        String QUERY = "SELECT * FROM pais WHERE id = " + id;
        Pais pais = null;

        try {
            con = Conexao.criarConexao();
            stm = con.createStatement();

            rs = stm.executeQuery(QUERY);

            if (rs.next()) {
                int id_pais = rs.getInt("id");
                String nome = rs.getString("nome");
                String sigla = rs.getString("sigla");
                int digitos = rs.getInt("digitos");

                pais = new Pais(id, nome, sigla, digitos);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar na tabela");
            e.printStackTrace();

        } finally {

            this.fecha(rs, stm, con);
        }

        return pais;

    }

    public void excluir(Pais pais) {

        String QUERY = "DELETE FROM pais WHERE id = " + pais.getId();

        try {

            con = Conexao.criarConexao();
            stm = con.createStatement();
            stm.executeUpdate(QUERY);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            this.fecha(rs, stm, con);
        }
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
