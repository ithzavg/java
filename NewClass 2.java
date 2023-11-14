/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4arreglosbidimensionales;

/**
 *
 * @author ithzamary.vilchis
 */
public class NewClass {
    
    

    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };
        
        String[][] colores = { //arreglo bidimensional o matriz
            {"rojo", "verde", "azul"}, //arreglo
            {"red", "green", "pink"}, //arreglo
            {"rouge", "vert","bleu"} //arreglo
        };
        
        String[] coloresIngles = {"red", "green", "pink"}; //arreglo unidimensional
        
        
        for (int i = 0; i < 3 ; i++) { //colores.length
            for (int j = 0; j < 3; j++) { //colores[0].length
                System.out.println(colores[i][j]);
            }
        }
        
        System.out.println("Prom por asignatura");
        double[] promAsig = NewClass.calcularPromedioAsignaturas(calificaciones, 3, 4);
        for (double c : promAsig) {
            System.out.println(c);
        }
        
        System.out.println("Prom por estudiante");
        double[] promEstudiante = NewClass.calcularPromedioEstudiante(calificaciones);
        for (int i = 0; i < promEstudiante.length; i++) {
            System.out.println(promEstudiante[i]); 
        }
        
        //System.out.println(NewClass.calcularPromedioEstudiante(calificaciones));
        //Imprime la direccion de memoria
    }
    
    public static double[] calcularPromedioEstudiante(double[][] calificaciones) {
        
        double[] promedio = new double[3];
        
        //System.out.println(calificaciones.length); //Longitud de filas 3
        //System.out.println(calificaciones[0].length); //Longitud de columna 4
        
        for (int i = 0; i < 3; i++) { //Control de filas
            double suma = 0.0;
            for (int j = 0; j < 4; j++) { //Control de columnas 
                suma += calificaciones[i][j];
            }
            
           promedio[i] = suma / 4; 
            
        }
        
        return promedio;
    }    
    
    public static double[] calcularPromedioAsignaturas(double[][] calificaciones, int numEstudiantes, int numAsignaturas) {
        double[] promedioAsignaturas = new double[numAsignaturas];
        for (int columnas = 0; columnas < 4; columnas++) { //Controla Columnas //4
            double suma = 0.0;
            for (int filas = 0; filas < 3; filas++) {//Controla Filas //3
                suma += calificaciones[filas][columnas];
            }
            promedioAsignaturas[columnas] = suma / numEstudiantes;
        }
        return promedioAsignaturas;
    }
}
