/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

/**
 *
 * @author camilo
 */
public class Gallina extends Ave{
    
    public Gallina(){
        
        this.tipoSonido = (new Grasnido());
        this.tipoVuelo  = (new VueloConAlas());
    }
  
}

