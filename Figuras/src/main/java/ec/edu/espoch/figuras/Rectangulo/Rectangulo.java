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

    public float baseRectangulo;
    public float alturaRectangulo;

    public Rectangulo() {
    }

    public Rectangulo(float baseRectangulo, float alturaRectangulo) {
        this.baseRectangulo = baseRectangulo;
        this.alturaRectangulo = alturaRectangulo;
    }

    public float AreaRectangulo() {
        float AreaRectangulo = 0;
        AreaRectangulo = (baseRectangulo * alturaRectangulo) / 2;
        return AreaRectangulo;
    }

    public float PerimetroRectangulo() {
        float PerimetroRectangulo = 0;
        PerimetroRectangulo = (baseRectangulo * alturaRectangulo) / 2;
        return PerimetroRectangulo;
    }
    
    public void imprimir() {

        System.out.println("La altura del rectangulo es de: " + alturaRectangulo + "cm");
        System.out.println("La base del rectangulo es de: " + baseRectangulo + "cm"); 
    }
}
