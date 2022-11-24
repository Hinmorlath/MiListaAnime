/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miListaAnime;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Gateway
 */
public class crearAnime<T> {
    FileWriter archivo = null;
    PrintWriter pw = null;
    BufferedReader bufer2 = new BufferedReader(new InputStreamReader(System.in));
    String entrada;
    char respuesta;
        
    public crearAnime(T name){
        try{
            archivo = new FileWriter("C:\\Prueba\\" + name + ".txt");
            pw = new PrintWriter(archivo);
            
            
            System.out.println("Escribe información del anime: ");
            pw.println("Nombre del anime: ");
            pw.println(name);
            pw.println("");
            System.out.println("Nombre original del anime: ");
            entrada = bufer2.readLine();
            pw.println("Nombre original del anime: ");
            pw.println(entrada);
            pw.println("");
            System.out.println("Año de emisión: ");
            entrada = bufer2.readLine();
            pw.println("Año de emisión: ");
            pw.println(entrada);
            pw.println("");
            System.out.println("Géneros: ");
            entrada = bufer2.readLine();
            pw.println("Géneros: ");
            pw.println(entrada);
            pw.println("");
            System.out.println("Sinopsis: ");
            entrada = bufer2.readLine();
            pw.println("Sinopsis: ");
            pw.println(entrada);
            pw.println("");
            System.out.println("Director: ");
            entrada = bufer2.readLine();
            pw.println("Director: ");
            pw.println(entrada);
            pw.println("");
            
        }catch(Exception e){
            System.out.println("Error al escribir en archivo: " + name);
        } finally {
            try {
                if(null != archivo){
                    archivo.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar archivo " + name);
            }
        }
    }
    
}
