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
public class Rombo extends Figura{
    
    double diagonal_menor;
    double diagonal_mayor;
    
    public Rombo(String n, double dMa, double dMe){
        super( n );
        
        diagonal_menor = dMe;
        diagonal_mayor = dMa;
        
    }
    
    public void establecerDiagonalMenor(double x){
        diagonal_menor = x;
    }
    
    public void establecerDiagonalMayor(double x){
        diagonal_mayor = x;
    }
    
    @Override
    public void calcular_area(){
        area = (diagonal_menor * diagonal_mayor)/2;
    }
    
    public double obtenerDiagonalMenor(){
        return diagonal_menor;
    }
    
    public double obtenerDiagonalMayor(){
        return diagonal_mayor;
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
