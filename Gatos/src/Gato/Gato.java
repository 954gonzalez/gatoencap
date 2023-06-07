

package Gato;

public class Gato {
 private String nombre;
 private int edad;
 
 
 public Gato(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }
 
 public String getNombre() {
     return nombre;
 }
 
 public void setNombre(String nombre) {
     this.nombre = nombre;
 }
 
 public int getEdad() {
     return edad;
 }
 
 public void setEdad(int edad) {
     this.edad = edad;
 }
 
 public void maullar() {
     System.out.println("El gato " + nombre + " está maullando.");
 }
 
 
 public String toString() {
     return "nombre=" + nombre + ", edad=" + edad + "";
 }
}
