/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashSet;
import java.util.Set;
import model.Cliente;

/**
 *
 * @author emerson
 */
public class ClienteDAO {
    
    private Set<Cliente> listaClientes = new HashSet<>();
    
    public void adicionarCliente(Cliente cliente) throws Exception {
         if (listaClientes.add(cliente) == false)
            throw new Exception("Cliente já cadastrado");
    }
    
    public Set<Cliente> getListaClientes() {
        return listaClientes;
    }
    
}
