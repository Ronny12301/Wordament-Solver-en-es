package solver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronny12301
 */
public class LectorArchivos {
    
    public String[] leerArchivo(String archivo, String idioma) {
        ArrayList<String> palabras = new ArrayList<>();
        
        ClassLoader classLoader = LectorArchivos.class.getClassLoader();
        URL url = classLoader.getResource(idioma + "/" + archivo);
        File file = new File(url.getFile());
  
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String palabra;
            while((palabra=reader.readLine()) != null) {
                palabras.add(palabra);
            }            
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(LectorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LectorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] palabrasArreglo = palabras.toArray(new String[0]);
        return palabrasArreglo;

    }
}
