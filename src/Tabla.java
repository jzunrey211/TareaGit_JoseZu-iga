/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Tabla {
    
    private int numeroTablita;

    public int getNumeroTablita() {
        return numeroTablita;
    }

    public void setNumeroTablita(int numeroTablita) {
        this.numeroTablita = numeroTablita;
    }
    
   public Tabla(int numeroTablita){
       this.numeroTablita= numeroTablita;
   } 
    
   public String pintarTabla(){
       StringBuilder tabla = new StringBuilder();
       for (int i = 0; i < 11; i++) {
       int resultado= this.numeroTablita;
       tabla.append(this.numeroTablita+" * "+i+"="+resultado+"\n");
       }
         return tabla.toString();
   }
   
}
