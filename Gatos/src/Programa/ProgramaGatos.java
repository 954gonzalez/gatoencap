
package Programa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Gato.Gato;


public class ProgramaGatos {
  
     private ArrayList<Gato> listaGatos;
    private Map<String, Gato> mapaGatos; 
    
    // Constructor
    public ProgramaGatos() {
        listaGatos = new ArrayList<>(); 
        mapaGatos = new HashMap<>(); 
    }
    
 
    public void agregarGato(Gato gato) {
        listaGatos.add(gato);
       mapaGatos.put(gato.getNombre(), gato);
    }
    
    public void mostrarListaGatos() {
    	 for (String key : mapaGatos.keySet()) {
    		 Gato value=mapaGatos.get(key);
    	        System.out.println( key+ " " + value);
    	    }
    }
 
    public void buscarGato(String nombre) {
        for (Gato gato : listaGatos) {
            if (gato.getNombre().equals(nombre)) {
                System.out.println(gato);
                return;
            }
        }
        System.out.println("No se encontró un gato con ese nombre.");
    }
    
    public static void main(String[] args) {
        ProgramaGatos programa = new ProgramaGatos(); 
        
        
        int op;
        do {
        	String menu="Menu Principal \n";
            menu+="1. Agregar un gato \n";
            menu+="2. Mostrar lista de gatos\n";
           menu+= "3. Buscar un gato por nombre\n";
          menu+= "0. Salir\n";
          menu+= "Ingrese una opción: \n";
            
           op= Integer.parseInt(JOptionPane.showInputDialog(menu)) ;
            
        
            switch (op) {
                case 1:
                  String nombre= JOptionPane.showInputDialog("ingrese el nombre del gato");
                  
                     int edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad")); 
                   
                    
                    Gato gato = new Gato(nombre, edad);
                   
                    programa.agregarGato(gato);
                    
                    System.out.println("Gato agregado exitosamente.");
                    gato.maullar();
                    break;
                
                case 2:
                    programa.mostrarListaGatos();
                    break;
                
                case 3:
                   String nombreBuscar=JOptionPane.showInputDialog("ingrese el nombre a buscar");
                   
                    programa.buscarGato(nombreBuscar);
                    break;
               
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
            
            System.out.println();
        } while (op != 0);
        
      
    }
}
    