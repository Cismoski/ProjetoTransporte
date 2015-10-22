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
public class Aluno extends Pessoa{
   
    private int ra;

    public Aluno(int ra, String nome, Transporte T) {
        super(nome, T);
        this.ra = ra;
    }



  


    
    
}
