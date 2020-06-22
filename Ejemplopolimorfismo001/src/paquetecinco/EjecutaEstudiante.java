
package paquetecinco;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        
        System.out.println("Numero de Estudiantes a Ingresar: ");
        contador = entrada.nextInt();
        
        for(int i = 0; i < contador; i++){
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            
            if(tipoEstudiante == 1){
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                EstudiantePresencial eP = new EstudiantePresencial();
                
                eP.establecerNombresEstudiante(nombresEst);
                eP.establecerApellidoEstudiante(apellidosEst);
                eP.establecerIdentificacionEstudiante(identificacionEst);
                eP.establecerEdadEstudiante(edadEst);
                eP.establecerNumeroCreditos(numeroCreds);
                eP.establecerCostoCredito(costoCred);
                estudiantes.add(eP);
            }
            
            if(tipoEstudiante == 2){
                System.out.println("Ingrese el número de Asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada Asignatura");
                costoAsig = entrada.nextDouble();
                EstudianteDistancia eD = new EstudianteDistancia();
                
                eD.establecerNombresEstudiante(nombresEst);
                eD.establecerApellidoEstudiante(apellidosEst);
                eD.establecerIdentificacionEstudiante(identificacionEst);
                eD.establecerEdadEstudiante(edadEst);
                eD.establecerNumeroAsginaturas(numeroAsigs);
                eD.establecerCostoAsignatura(costoAsig);
                estudiantes.add(eD);
            }
        }
        
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}