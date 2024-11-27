/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.figuras;

/**
 *
 * @author SO-LAB-PC5
 */
import ec.edu.espoch.figuras.Circulo.Circulos;
import ec.edu.espoch.figuras.Cuadrado.Cuadrados;
import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cálculo para el círculo
        System.out.print("Ingrese el radio del Círculo: ");
        double radio = scanner.nextDouble();
        Circulos circulo = new Circulos(radio);
        
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del Círculo: " + circulo.calcularPerimetro());

        // Cálculo para el cuadrado
        System.out.print("Ingrese el lado del Cuadrado: ");
        double lado = scanner.nextDouble();
        Cuadrados cuadrado = new Cuadrados(lado);
        
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del Cuadrado: " + cuadrado.calcularPerimetro());
    }
}
