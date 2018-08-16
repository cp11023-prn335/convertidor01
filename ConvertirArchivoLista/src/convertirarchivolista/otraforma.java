/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirarchivolista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author william
 */
public class otraforma {
    
  //desde aqui
  FileReader archivo;
  BufferedReader lector;
  List<String> lista=new ArrayList<>();
 //otro metodo para convertir archivo de texto en lista
    public List<String>ConvertirTexto (String direccion){
        try {
            archivo=new FileReader(direccion);
            
            if(archivo.ready()){
               lector=new BufferedReader(archivo);
               String cadena;
                while ( (cadena=lector.readLine()) !=null  ){
                    //System.out.println(cadena);
                    lista.add(cadena);
                }
            }else{
                System.out.println("El archivo no esta listo para ser leído");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        }
     return lista;
    }
    
    
    
}
