/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import pessoa.Aluno;
import pessoa.Pessoa;
import transporte.*;

/**
 *
 * @author UTFPR
 */
public class App {
    
    //para criar o metodo main 
    //psvm e tab
    
    public static void main(String[] args) {
        
        //para criar um novo objeto
        //newo e tab
        
        Pessoa pessoa = new Aluno(123,"Aluno 1",new Bicicleta());
        
        pessoa.locomover();
        pessoa.setT(new Carro());
        pessoa.locomover();
    }
}
