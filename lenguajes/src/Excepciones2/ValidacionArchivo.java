/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones2;

import java.io.File;

/**
 *
 * @author T-102
 */
public class ValidacionArchivo {
    public static void ValidarExtencion(File file)throws ExtencionNoValidaException{
        // throw new ExtencionNoValidaException();
    String nombre=file.getName(); 
    
   //Como obtener la extension 
  // int indice1= nombre.indexOf(".");
  // int indice2= nombre.length(); 
   //String extencion=nombre.substring(indice1-1, indice2); 
   
  // if(!extencion.equals("txt"))
      // throw new ExtencionNoValidaException(); 
    }
    public static void validarMayusculas(File file) throws MayusculasException {
        String nombre=file.getName();
        int indice1=nombre.indexOf(".");
        String extencion=nombre.substring(0,indice1); 
        
        String mayusculas= nombre.toUpperCase();
        if(!extencion.equals(mayusculas))
            throw new MayusculasException();
    }
}
