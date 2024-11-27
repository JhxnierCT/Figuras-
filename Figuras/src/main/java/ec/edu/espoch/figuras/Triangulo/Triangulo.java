/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figuras.Triangulo;
//{}

/**
 *
 * @author Global Technology Ec
 */
public class Triangulo {

    public float basetriangulo;
    public float alturatriangulo;

    public TipoTriangulo tipotriangulo;

    public Triangulo() {
    }

    public Triangulo(float basetriangulo, float alturatriangulo, TipoTriangulo tipotriangulo) {
        this.basetriangulo = basetriangulo;
        this.alturatriangulo = alturatriangulo;
        this.tipotriangulo = tipotriangulo;
    }

    public void imprimir() {
        System.out.println("La base del triangulo es: " + basetriangulo + "cm");
        System.out.println("La altura del triangulo es: " + alturatriangulo + "cm");
        System.out.println("Es un Triangulo: " + tipotriangulo);
    }

    public float AreaTriangulo() {
        float AreaTriangulo = 0;
        AreaTriangulo = (basetriangulo * alturatriangulo) / 2;
        return AreaTriangulo;
    }

    public float CalcularHipotenusa() {
        float hipotenusa = 0;

        if (null != tipotriangulo) switch (tipotriangulo) {

                case EQUILATERO:
                    hipotenusa = 0;
                    break;
                case ISOSCELES:
                    hipotenusa = (float) (Math.sqrt((alturatriangulo*alturatriangulo)+(basetriangulo/2)*(basetriangulo/2)));
                    break;
                case ESCALENO:
                    hipotenusa = (float) (Math.sqrt((alturatriangulo*alturatriangulo)+(basetriangulo*basetriangulo)));
                    break;
                default:
            }
        
        return  (float) hipotenusa ;
    }
    
    public float PerimetroTriangulo(){
        return(alturatriangulo+basetriangulo+CalcularHipotenusa());
    }

}
