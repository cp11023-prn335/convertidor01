
package convertirarchivolista;

import java.util.ArrayList;
import java.util.List;




public class validacion {
    
    /*
      public String correctorTexto(String texto)
    {
        
    String []palabras=texto.split("\\s+");
    StringBuilder texto2=new StringBuilder();
    for (String palabra:palabras) {    
    texto2.append(palabra.substring(0,1).concat(palabra.substring(1,palabra.length()).concat(" ")));
    }
    return texto2.toString();
    }  
    
    */
    
  //  List<String>listaPlacas=new ArrayList<>();
    public List<String> ejecutarValidacion(List<String>listaPlacas){
    listaPlacas=new ArrayList<>();
    
        for (int i = 0; i <listaPlacas.size(); i++) {
            String []palabras=listaPlacas.get(i).split("\\s+");
            StringBuilder texto2=new StringBuilder();
            for (String palabra:palabras) {    
            texto2.append(palabra.substring(1,palabra.length()));
            //texto2.append(palabra.substring(0,1).concat(palabra.substring(1,palabra.length()).concat(" ")));
            }
     
        }
    
    
    
    
    
    return listaPlacas;
    }
    
    
    
    
}
