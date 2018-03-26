/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashSet;
import java.util.Set;
import model.Pais;

/**
 *
 * @author emerson
 */
public class PaisDAO {
    
    private Set<Pais> listaPaises = new HashSet<>();
    
    public void adicionarPais(Pais pais) throws Exception {
         if (listaPaises.add(pais) == false)
            throw new Exception("Pais já cadastrado");
    }
    
    public Set<Pais> getListaPaises() {
        return listaPaises;
    }
    
}
