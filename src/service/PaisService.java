/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Pais;

/**
 *
 * @author emerson
 */
public class PaisService {
    
    private List<Pais> listaPaises = new ArrayList<Pais>();
    
    public void adicionarPais(Pais pais) {
        getListaPaises().add(pais);
        System.out.println(this.listaPaises);
    }
    
    public List<Pais> getListaPaises() {
        return listaPaises;
    }
    
}