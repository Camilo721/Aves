/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;


import org.junit.Assert;
/**
 *
 * @author camilo
 */
public class TestCase {
    
    public void canarioTestCase(){
        Canario canario = new Canario();
        Assert.assertNotNull(canario);
        
        System.out.println("canario realizaVuelo");
        canario.realizaVuelo();
        
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
        
        System.out.println("canario cambiando sonido ave");
        canario.setTipoSonido(new Grasnido());
        
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
    }
    
    
}
