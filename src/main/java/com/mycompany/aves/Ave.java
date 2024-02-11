/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

import com.mycompany.aves.TipoSonido;
/**
 *
 * @author camilo
 */
public abstract class Ave {
    
    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;
    
    //metodos de una ave
    
    
    
    public void setTipoSonido(TipoSonido tipoSonido){
        this.tipoSonido= tipoSonido;
    }
    
    public void setTipoVuelo(TipoVuelo tipoVuelo){
        this.tipoVuelo= tipoVuelo;
    }
    public void realizaVuelo(){
        
        tipoVuelo.vuelo();
    }
    
    public void realizaSonido(){
        
        tipoSonido.makeSound();
    }
}
