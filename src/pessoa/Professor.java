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
public class Professor extends Pessoa{
    
    private int siape;

    public Professor(int siape, String nome, Transporte T) {
        super(nome, T);
        this.siape = siape;
    }

   
    
}
