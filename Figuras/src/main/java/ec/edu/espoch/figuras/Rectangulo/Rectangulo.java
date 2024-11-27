/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figuras.Rectangulo;
//{}

/**
 *
 * @author Global Technology Ec
 */
public class Rectangulo {

    public float baserectangulo;
    public float alturarectangulo;
    public float perimetrorectangulo;
    public float arearectangulo;

    public Rectangulo() {
    }

    public Rectangulo(float baserectangulo, float alturarectangulo) {
        this.baserectangulo = baserectangulo;
        this.alturarectangulo = alturarectangulo;
    }

    public float AreaRectangulo() {
        float AreaRectangulo = 0;
        AreaRectangulo = (baserectangulo * alturarectangulo) / 2;
        return AreaRectangulo;
    }

    public float PerimetroRectangulo() {
        float PerimetroRectangulo = 0;
        PerimetroRectangulo = (baserectangulo * alturarectangulo) / 2;
        return PerimetroRectangulo;
    }
    
    public void imprimir() {

        System.out.println("La altura del rectangulo es de: " + alturarectangulo + "cm");
        System.out.println("La base del rectangulo es de: " + baserectangulo + "cm"); 
    }
}
