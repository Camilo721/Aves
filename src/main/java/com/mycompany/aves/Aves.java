/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aves;

 

/**
 *
 * @author camilo
 */
public class Aves {

    public static void main(String[] args) {
        
        Canario canario= new Canario();
        
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
