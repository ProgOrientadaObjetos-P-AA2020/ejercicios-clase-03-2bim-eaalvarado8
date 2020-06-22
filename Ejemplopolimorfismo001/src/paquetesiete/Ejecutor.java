/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<>();
        int cC = 0, cT = 0, cR = 0, cTotal =0;
        do{
            if(cC != 4 && cT != 5 && cR !=3){
                System.out.println("Ingrese tipo de Figura: ");
                System.out.println("1) Cuadrado");
                System.out.println("2) Rombo: ");
                System.out.println("3) Triangulo: "); 
            }
            
            if(cC == 4 && cT != 5 && cR != 3){
                System.out.println("Ingrese tipo de Figura: ");
                System.out.println("2) Rombo: ");
                System.out.println("3) Triangulo: ");  
            }
            
            if(cR == 3 && cT != 5 && cC != 4){
                System.out.println("Ingrese tipo de Figura: ");
                System.out.println("1) Cuadrado");
                System.out.println("3) Triangulo: ");  
            }
            
            if(cT == 5 && cR != 3 && cC != 4){
                System.out.println("Ingrese tipo de Figura: ");
                System.out.println("1) Cuadrado");
                System.out.println("2) Rombo: ");  
            }
            
            if(cR == 3 && cT == 5 && cC != 4){
                System.out.println("Ingrese tipo de Figura: ");
                System.out.println("1) Cuadrado");  
            }
            
            if(cC == 4 && cT == 5 && cR != 3){
                System.out.println("Ingrese tipo de Figura: ");
                System.out.println("2) Rombo: "); 
            }
            
            if(cR == 3 && cT != 5 && cC == 4){
                System.out.println("Ingrese tipo de Figura: ");
                System.out.println("3) Triangulo: ");  
            }
            
            int tipoF = sc.nextInt();
            if(tipoF == 1 && cC != 4){
                System.out.println("Ingrese valor del lado: ");
                double lado = sc.nextDouble();
                Cuadrado c = new Cuadrado("Cuadrado", lado);
                figuras.add(c);
                cC++;
            }

            if(tipoF == 2 && cR != 3){
                System.out.println("Ingrese valor de la Diagonal Menor: ");
                double diagonal_menor = sc.nextDouble();
                System.out.println("Ingrese valor de la Diagonal Mayor: ");
                double diagonal_mayor = sc.nextDouble();
                Rombo r = new Rombo("Rombo", diagonal_menor, diagonal_mayor);
                figuras.add(r);
                cR++;
            }

            if(tipoF == 3 && cT != 5){
                System.out.println("Ingrese valor de la Base: ");
                double base = sc.nextDouble();
                System.out.println("Ingrese valor de la Altura: ");
                double altura = sc.nextDouble();
                Triangulo t = new Triangulo("Triangulo", base, altura);
                figuras.add(t);
                cT++;
            }
            cTotal++;
         }while(cTotal != 12);
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
