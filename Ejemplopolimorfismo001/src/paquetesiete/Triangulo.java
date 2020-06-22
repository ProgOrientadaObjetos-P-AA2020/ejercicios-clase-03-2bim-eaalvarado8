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
public class Triangulo extends Figura{
    
    double base;
    double altura;
    
    public Triangulo(String n, double b, double a){
        super( n );
        
        base = b;
        altura = a;
        
    }
    
    public void establecerBase(double n){
        base = n;
    }
    
    public void establecerAltura(double n){
        altura = n;
    }
    
    @Override
    public void calcular_area(){
        area = (base * altura)/2;
    }
    
    public double obtenerBase(){
        return base;
    }
    
    public double obtenerAltura(){
        return altura;
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
