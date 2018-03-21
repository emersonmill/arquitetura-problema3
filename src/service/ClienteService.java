/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author emerson
 */
public class ClienteService {
    
    private static List<Cliente> listaClientes = new ArrayList<Cliente>();
    
    public void adicionarCliente(Cliente cliente) {
        getListaClientes().add(cliente);
        System.out.println(this.listaClientes);
    }
    
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
}
