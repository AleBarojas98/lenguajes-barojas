/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;
import java.io.*; 

public class PersistenciaUsuario {
    /* PRIMER METODO DE TIPO ACCION GUARDAR */

    public void guardar(Usuario u)throws Exception{
        File file=new File("Basesita-Usuarios");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos); 
        oos.writeObject(u);
    }


}


