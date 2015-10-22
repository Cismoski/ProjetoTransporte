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
public class Tecnico extends Pessoa{
   
    private int codigo;

    public Tecnico(int codigo, String nome, Transporte T) {
        super(nome, T);
        this.codigo = codigo;
    }

  
    
    
}
