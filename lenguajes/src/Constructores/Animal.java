/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author T-102
 */
public class Animal {
    
    private String nombre; 
    private float edad; 
    
    public Animal(){
        
    }
    
    public String getNombre(){
        return nombre; 
        
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre; 
    }
    
    public float getEdad(){
        return edad; 
    }
    public void setEdad(float edad){
        this.edad=edad; 
    }
}
