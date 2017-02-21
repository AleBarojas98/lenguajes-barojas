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
   int indice1= nombre.indexOf(".");
   int indice2= nombre.length(); 
   String extencion
    }
    
}
