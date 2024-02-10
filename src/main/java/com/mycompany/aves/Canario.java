/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

/**
 *
 * @author camilo
 */
public class Canario extends Ave implements Volar{
    
    
    @Override
    public void makeSound(){
        System.out.println("Canta");
    }
   
    public void vuela(){
        System.out.println("Vuela con alas");
    }
}
