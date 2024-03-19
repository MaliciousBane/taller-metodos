/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_Metodos;

/**
 *
 * @author farfa
 */
public class ejercicio2 {

    public int calcular_Area_Perimetro(int base, int altura, int opcion) {

        if (opcion == 1) {
            int perimetro = (base * 2) + (altura * 2);
            return perimetro;
        } else {
            int area = base * altura;
            return area;
        }
    }

    public static void main(String[] args) {
        ejercicio2 obj = new ejercicio2();
        int base = 45;
        int altura = 18;
        int opcion = 1;

        System.out.println("El Perimetro del rectangulo es: " + obj.calcular_Area_Perimetro(base, altura, opcion));

        base = 20;
        altura = 37;
        opcion = 2;
        System.out.println("El Area del rectangulo es: " + obj.calcular_Area_Perimetro(base, altura, opcion));

    }
}
