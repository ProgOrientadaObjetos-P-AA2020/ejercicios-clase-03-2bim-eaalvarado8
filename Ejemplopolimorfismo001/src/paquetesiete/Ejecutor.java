/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        
        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Cuadrado c1 = new Cuadrado("Cuadrado", 2.4);
        figuras.add(c1);
        Cuadrado c2 = new Cuadrado("Cuadrado", 5);
        figuras.add(c2);
        Cuadrado c3 = new Cuadrado("Cuadrado", 3.2);
        figuras.add(c3);
        Cuadrado c4 = new Cuadrado("Cuadrado", 1.1);
        figuras.add(c4);
        
        Rombo r1 = new Rombo("Rombo", 4.3, 5.2);
        figuras.add(r1);
        Rombo r2 = new Rombo("Rombo", 2.1, 2.5);
        figuras.add(r2);
        Rombo r3 = new Rombo("Rombo", 1, 5);
        figuras.add(r3);
        
        Triangulo t1 = new Triangulo("Triangulo", 2, 4);
        figuras.add(t1);
        Triangulo t2 = new Triangulo("Triangulo", 4, 4);
        figuras.add(t2);
        Triangulo t3 = new Triangulo("Triangulo", 1.5, 2);
        figuras.add(t3);
        Triangulo t4 = new Triangulo("Triangulo", 7.1, 3);
        figuras.add(t4);
        Triangulo t5 = new Triangulo("Triangulo", 3.7, 8);
        figuras.add(t5);
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}
