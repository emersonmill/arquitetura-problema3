/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Pais;
import dao.ClienteDAO;
import dao.PaisDAO;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author emerson
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    private PaisDAO paisDAO;
    private ClienteDAO clienteDAO;
    Set<Cliente> clientesCadastrados;
    DefaultTableModel modelo = null;
    Cliente cliente;
    
    public TelaCliente(PaisDAO paisDAO, ClienteDAO clienteDAO) {
        this.paisDAO = paisDAO;
        this.clienteDAO = clienteDAO;
        initComponents();    
        activate();
    }
    
    private void activate() {
        modelo = new DefaultTableModel();        
        tabelaClientes.setModel(modelo); 
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Idade");
        modelo.addColumn("Limite");
        modelo.addColumn("País");
        clientesCadastrados = clienteDAO.listar();
        popularComboPais();
        popularTabela();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        scrollTabela = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelIdade = new javax.swing.JLabel();
        textFieldIdade = new javax.swing.JSpinner();
        labelPais = new javax.swing.JLabel();
        comboPais = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textAlert = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        labelNome.setText("Nome:");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        botaoCadastrar.setBackground(new java.awt.Color(0, 51, 204));
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("Salvar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTabela.setViewportView(tabelaClientes);

        labelTelefone.setText("Telefone:");

        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });

        labelIdade.setText("Idade:");

        labelPais.setText("Pais:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Alertas:");

        textAlert.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar país");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Tela inicial");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrar))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(textAlert))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(labelNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(labelIdade)
                                        .addGap(3, 3, 3)))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(textFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelPais)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelTelefone)
                                        .addGap(27, 27, 27)
                                        .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdade)
                    .addComponent(textFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPais)
                    .addComponent(comboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        cliente = new Cliente();
        textAlert.setText("");
        
        try {
            cliente.setNome(textFieldNome.getText());
        } catch (Exception ex) {
             textAlert.setText(textAlert.getText() + ex.getMessage());
             return;
        }
        
        Set<Pais> paises = paisDAO.getListaPaises();
        
         for (Pais paisAtual : paisDAO.getListaPaises()) {
            if (paisAtual.getNome().equalsIgnoreCase((String) comboPais.getSelectedItem())) {
                try {
                    cliente.setPais(paisAtual);
                } catch (Exception ex) {
                    textAlert.setText(textAlert.getText() + ex.getMessage());
                    return;
                }
            }
        }
  
        try {
            cliente.setTelefone(textFieldTelefone.getText());
        } catch (Exception ex) {
            textAlert.setText(textAlert.getText() + ex.getMessage());
            return;
        }
        
        cliente.setIdade(Integer.parseInt(textFieldIdade.getValue().toString()));
        try {
            cliente.setLimiteCredito(0);
        } catch (Exception ex) {
            System.out.println("aqui");
            textAlert.setText(textAlert.getText() + ex.getMessage());
            return;
        }
        
        try {
            clienteDAO.adicionarCliente(cliente);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Cliente já cadastrado");
            return;
        }
        limparCampos();
        adicionarNaTabela(cliente);
        clientesCadastrados = clienteDAO.listar();


        
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaPais(paisDAO).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean verificaCampos() {
        
        textAlert.setText("");
        boolean valid = true;
        
        if (cliente.getPais() == null) {
            textAlert.setText(textAlert.getText() + "\nPais invalido");
            valid = false;
        }
        
        if (cliente.getNome().length() <= 5) {
            textAlert.setText(textAlert.getText() + "\nNome precisa ter mais que 05 caracteres");
            valid = false;
        }
        
        if (cliente.getIdade() <= 18 && cliente.getLimiteCredito() > 100 
                && !cliente.getPais().getNome().equals("Brasil")) {            
            textAlert.setText(textAlert.getText() + "\nLimite excedido");
            valid = false;
        }else if (cliente.getIdade() <= 18 && cliente.getLimiteCredito() > 200) {            
            textAlert.setText(textAlert.getText() + "\nLimite excedido");
            valid = false;
        }
        
        if ((cliente.getIdade() > 18 && cliente.getIdade() <= 35) && cliente.getLimiteCredito() > 300 
                && !cliente.getPais().getNome().equals("Brasil")) {            
            textAlert.setText(textAlert.getText() + "\nLimite excedido");
            valid = false;
        }else if ((cliente.getIdade() > 18 && cliente.getIdade() <= 35) && cliente.getLimiteCredito() > 400) {            
            textAlert.setText(textAlert.getText() + "\nLimite excedido");
            valid = false;
        }
        
        if (cliente.getIdade() > 35 && cliente.getLimiteCredito() > 500 
                && !cliente.getPais().getNome().equals("Brasil")) {            
            textAlert.setText(textAlert.getText() + "\nLimite excedido");
            valid = false;
        }else if (cliente.getIdade() > 35 && cliente.getLimiteCredito() > 600) {            
            textAlert.setText(textAlert.getText() + "\nLimite excedido");
            valid = false;
        }
        
        return valid;
       

    }
    
    private void limparCampos() {
        this.textFieldNome.setText("");
        this.textFieldTelefone.setText("");
        this.textFieldIdade.setValue(0);
    }
    
    private void popularComboPais() {
        Set<Pais> paises = paisDAO.getListaPaises();
        for(Pais p : paises){
            comboPais.addItem(p.getNome());
        }
        
    }
    
    private void adicionarNaTabela(Cliente cliente) {           
        
        modelo.addRow(new Object[]{cliente.getNome(),cliente.getTelefone(),
                      cliente.getIdade(),cliente.getLimiteCredito(),cliente.getPais().getNome()+ "-" + 
                      cliente.getPais().getSigla()}); 
    }
    
    public void popularTabela() {
        for(Cliente cliente : clientesCadastrados) {
        modelo.addRow(new Object[]{cliente.getNome(),cliente.getTelefone(),
                      cliente.getIdade(),cliente.getLimiteCredito(),cliente.getPais().getNome()+ "-" + 
                      cliente.getPais().getSigla()});
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JComboBox<String> comboPais;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField textAlert;
    private javax.swing.JSpinner textFieldIdade;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
