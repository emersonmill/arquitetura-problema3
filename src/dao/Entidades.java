package dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Entidades {

    private Connection con;
    private ResultSet rs;
    private Statement stm;

    public Entidades() {

        try {

            con = Conexao.criarConexao();

            DatabaseMetaData dbmd = con.getMetaData();

            rs = dbmd.getTables(null, null, "PAIS", new String[]{"TABLE"});

            if (!rs.next()) {
                stm = con.createStatement();

                stm.executeUpdate(
                        "CREATE TABLE pais (id int not null generated always as identity primary key, nome VARCHAR(50), sigla VARCHAR(2), digitos int)");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane meuJOPane = new JOptionPane("Software ou BD já esta em aberto em outra janela", JOptionPane.ERROR_MESSAGE);//
            final JDialog dialog = meuJOPane.createDialog(null, "Atenção!");

            dialog.setModal(true);

            Timer timer = new Timer(3 * 1000, new ActionListener() {

                public void actionPerformed(ActionEvent ev) {
                    dialog.dispose();

                }

            });
            timer.start();
            dialog.setVisible(true);
            timer.stop();

            System.exit(0);

        } finally {

            this.fecha(rs, stm, con);
        }

        try {

            con = Conexao.criarConexao();
            DatabaseMetaData dbmd = con.getMetaData();

            rs = dbmd.getTables(null, null, "CLIENTE", new String[]{"TABLE"});

            if (!rs.next()) {

                stm = con.createStatement();
                String QUERY = "CREATE TABLE cliente (id int generated always as identity primary key, nome VARCHAR(100), telefone VARCHAR(50), limiteCredito double, idade int, id_pais INT REFERENCES pais)";

                stm.executeUpdate(QUERY);

            }

        } catch (SQLException e) {
            System.out.println("livro\n");
            System.out.println(e.getMessage());

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
                e.printStackTrace();

            }
        }
    }

}
/*
package dao;

import java.util.HashSet;
import java.util.Set;
import model.Cliente;
import model.Pais;


public class Entidades {
    
    private Set<Cliente> listaClientes = new HashSet<>();
    private Set<Pais> listaPaises = new HashSet<>();

   
    public Set<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Set<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

  
    public Set<Pais> getListaPaises() {
        return listaPaises;
    }

    
    public void setListaPaises(Set<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }
    
    
    
}
*/
