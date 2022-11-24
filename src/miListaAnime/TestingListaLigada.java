/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miListaAnime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gateway
 */
public class TestingListaLigada {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        String dato;
        int opcion;
        char respuesta;
        
        ListaLigada lista = new ListaLigada();
        
        System.out.println("1 - Agregar un anime");
        System.out.println("2 - Agregar una saga");
        System.out.println("3 - Imprimir el catálogo");
        System.out.println(" ¿Qué quieres hacer?");
        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);
        
        switch(opcion){
            case 1: {
                while(true){
                System.out.println("Escribe el nombre de un anime:");
                entrada = bufer.readLine();
                dato = entrada;
                lista.add(dato);
                System.out.println("Se ha agregado el anime a la lista");
                System.out.println("¿Quieres agregar más animes? (s/n): ");
                entrada = bufer.readLine();
                respuesta = entrada.charAt(0);
                if (respuesta == 'n' || respuesta == 'N')
                    break;
                }
            }
            break;
            case 2: {
                System.out.println("Creación de un archivo de texto");
                escribirArchivo(fileName);
            }
            break;
            default: System.out.println("Opción no válida");
        }
        
        
        System.out.println("-------------------------------");
        System.out.println("Contenido del Catálogo: ");
        lista.imprimirCatalogo();
        
        
    }
    
}
