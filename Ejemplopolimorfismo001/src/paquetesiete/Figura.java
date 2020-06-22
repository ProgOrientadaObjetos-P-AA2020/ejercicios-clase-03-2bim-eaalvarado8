/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public abstract class Figura {
    
    protected String caracteristicas;
    protected double area;
    
    public Figura(String n){
        caracteristicas = n;
    }
    
    public void establecerCaracteristicas(String x){
        caracteristicas = x;
    }
    
    public abstract void calcular_area();
    
    public String obtenerCaracteristicas(){
        return caracteristicas;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public String toString(){
        String cadena = String.format("Nombre: %s\n", 
                caracteristicas);
        
        return cadena;
    }
}
