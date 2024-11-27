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

    public float baseTriangulo;
    public float alturaTriangulo;

    public TipoTriangulo tipoTriangulo;

    public Triangulo() {
    }

    public Triangulo(float basetriangulo, float alturatriangulo, TipoTriangulo tipotriangulo) {
        this.baseTriangulo = basetriangulo;
        this.alturaTriangulo = alturatriangulo;
        this.tipoTriangulo = tipotriangulo;
    }

    public void imprimir() {
        System.out.println("La base del triangulo es: " + baseTriangulo + "cm");
        System.out.println("La altura del triangulo es: " + alturaTriangulo + "cm");
        System.out.println("Es un Triangulo: " + tipoTriangulo);
    }

    public float AreaTriangulo() {
        float AreaTriangulo = 0;
        AreaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        return AreaTriangulo;
    }

    public float CalcularHipotenusa() {
        float hipotenusa = 0;

        if (null != tipoTriangulo) switch (tipoTriangulo) {

                case EQUILATERO:
                    hipotenusa = 0;
                    break;
                case ISOSCELES:
                    hipotenusa = (float) (Math.sqrt((alturaTriangulo*alturaTriangulo)+(baseTriangulo/2)*(baseTriangulo/2)));
                    break;
                case ESCALENO:
                    hipotenusa = (float) (Math.sqrt((alturaTriangulo*alturaTriangulo)+(baseTriangulo*baseTriangulo)));
                    break;
                default:
            }
        
        return  (float) hipotenusa ;
    }
    
    public float PerimetroTriangulo(){
        return(alturaTriangulo+baseTriangulo+CalcularHipotenusa());
    }

}
