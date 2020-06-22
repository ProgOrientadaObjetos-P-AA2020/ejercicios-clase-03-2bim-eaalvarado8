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
public class Cuadrado extends Figura {
    
    double lado;
    
    public Cuadrado(String n, double l){
        
        super(n);
        lado = l;
    }
    
    public void establecerLado(double n){
        lado = n;
    }
    
    @Override
    public void calcular_area(){
        area = lado * lado;
    }
    
    public double obtenerLado(){
        return lado;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Area: %.2f\n",
                cadenaFinal,
                area);
        
        return cadenaFinal;
    }
}
