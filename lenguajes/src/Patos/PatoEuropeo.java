/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patos;

/**
 *
 * @author T-102
 */
public class PatoEuropeo extends Pato implements ComportamientoVolar{
      public static String color="negro"; 
      
      public void volar(){
          System.out.println("Soy pato europeo y vuelo");
      }
}
