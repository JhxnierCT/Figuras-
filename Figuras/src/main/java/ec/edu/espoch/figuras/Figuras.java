/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.figuras;
//{}

import ec.edu.espoch.figuras.Rectangulo.Rectangulo;
import ec.edu.espoch.figuras.Triangulo.TipoTriangulo;
import ec.edu.espoch.figuras.Triangulo.Triangulo;

/**
 *
 * @author SO-LAB-PC5
 */
public class Figuras {

    public static void main(String[] args) {
        
                //Presentacion del Triangulo
        Triangulo objTriangulo = new Triangulo();
        
            objTriangulo.alturatriangulo=5;
            objTriangulo.basetriangulo=10;
            objTriangulo.tipotriangulo=TipoTriangulo.EQUILATERO;

        objTriangulo.imprimir();

            float hipotenusa=objTriangulo.CalcularHipotenusa();
            if(hipotenusa==0){
                System.out.println("!!!Error al calcular la hipotenusa en el triangulo EQUILATEROO ya que todos sus lados son semejantes.!!!");
                System.out.println("!!!En estos momentos va adquirir un virus mortal en tu dispositivo!!!");
                System.out.println("    ");
            }else{
                System.out.println("La hiptenusa del triangulo es: " + hipotenusa);
            }
            
            float perimetrotriangulo=objTriangulo.PerimetroTriangulo();
            System.out.println("El perimetro del triangulo es:" + perimetrotriangulo);
            float areatriangulo=objTriangulo.AreaTriangulo();
            System.out.println("El area del triangulo es: " + areatriangulo);
            System.out.println("    ");
            System.out.println("    ");
            
                //Presentacion del Rectangulo
        Rectangulo objRectangulo = new Rectangulo();
        
            objRectangulo.alturarectangulo=5;
            objRectangulo.baserectangulo=10;
        
        objRectangulo.imprimir();
        
            float perimetrorectangulo=objRectangulo.PerimetroRectangulo();
            System.out.println("El perimetro del rectangulo es: " + perimetrorectangulo);
            float arearectangulo=objRectangulo.AreaRectangulo();
            System.out.println("El area del rectangulo: " + arearectangulo);
            System.out.println("    ");
            System.out.println("    ");
            
            
                //Presentacion del Cuadrado
                
                
                
                //Presentacion del Circulo
                
                
                
                
    }
}
