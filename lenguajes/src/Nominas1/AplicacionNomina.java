/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nominas1;

/**
 *
 * @author T-102
 */
public class AplicacionNomina {
    
    public static void main(String[] args) {
        
        Trabajador worker=new Trabajador();
        worker.Nombre="Pedro"; 
        worker.Paterno="Lopez"; 
        worker.SeguroSocial=90; 
        if(worker.SeguroSocial<=90)worker.SeguroSocial=100; 
        
        System.out.println("El nombre es:" + worker.Nombre);
        System.out.println("Su apellido es:" + worker.Paterno);
        System.out.println("Numero Seguro Social: " + worker.SeguroSocial);
        
        
      
      
    }
}
