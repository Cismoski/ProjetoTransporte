/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import transporte.Transporte;

/**
 *
 * @author UTFPR
 */
public abstract class Pessoa {
   
   private String nome; 
   private Transporte T;

    public Pessoa(String nome, Transporte T) {
        this.nome = nome;
        this.T = T;
    }

    public void setT(Transporte T) {
        this.T = T;
    }

    public void locomover() {
        T.locomover();
    }
    
    
    
     
   
}
