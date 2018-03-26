/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

public class Cliente {
    
    private String nome;
    
    private String telefone;
    
    private double limiteCredito;
    
    private Pais pais;
    
    private int idade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() >= 5)
            this.nome = nome;
        
        else
            throw new Exception("Nome deve ter 5 ou mais caracteres");
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) throws Exception {
        
        if (this.getPais() == null) {
            throw new Exception("País selecionado é inválido");
        }
        
        if (telefone.length() != this.getPais().getDigitos())
            throw new Exception ("O telefone não é valido. Deve ter "+this.getPais().getDigitos()+" dígitos");
            
        else
            this.telefone = telefone;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    public void setLimiteCredito(double limiteCredito) throws Exception {
         if (this.getIdade() > 35)
            this.limiteCredito = 500;
        
        else if (this.getIdade() > 18)
            this.limiteCredito = 300;
        
        else
            this.limiteCredito = 100;
        
        if (this.getPais().getSigla().equalsIgnoreCase("BR"))
            this.limiteCredito += 100;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) throws Exception {
         if (pais == null)
            throw new Exception ("País inválido!");
        
        else
            this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
