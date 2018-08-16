/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirarchivolista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author william
 */
public class ConvertirArchivoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   //obtener la ruta
   //File fichero = new File("PlacasGuia2");
   //System.out.println("La ruta del fichero es: " + fichero.getAbsolutePath());

        
        
       
    
     /*   
//Metodo para convertir archivo en lista
       List<String> lista=new ArrayList<>();
       String direccion="/home/william/Escritorio/PlacasGuia2";
        
        File txtArchivo = new File(direccion);
        BufferedReader entrada;
		try {
			entrada = new BufferedReader( new FileReader(txtArchivo) );			
			
                        while(entrada.ready()){	
				lista.add(entrada.readLine());                               
			}
                        
		}catch (IOException e) {
			e.printStackTrace();
		}
        
        
        
//recorremos la lista
        
for(int i=0;i<listaPlacas.size();i++) {
  System.out.println(listaPlacas.get(i));
}         
        
   */ 
       List<String> listaPlacas=new ArrayList<>();  
       otraforma prueba=new otraforma();
       
       listaPlacas=prueba.ConvertirTexto("/home/william/Escritorio/PlacasGuia2");
     
        
        
        
        
    }
    
}
