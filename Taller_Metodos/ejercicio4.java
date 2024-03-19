/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_Metodos;

/**
 *
 * @author farfa
 */
public class ejercicio4 {

    public double calcular_Perímetro_Area_volumen(float radio, int tipo) {
        if (tipo == 1) {
            double perimetro = 2 * 3.1416 * radio;
            return perimetro;

        } else if (tipo == 2) {
            double area = 3.1416 * Math.pow(radio, 2);
            return area;

        } else if (tipo == 3) {
            double volumen = 4 * 3.1416 * (Math.pow(radio, 3) / 3);
            return volumen;

        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ejercicio4 obj = new ejercicio4();
        //prueba 1 
        float radio = 26;
        int tipo = 1;
        System.out.println("El perímetro de circunferencia es: " + obj.calcular_Perímetro_Area_volumen(radio, tipo));

        //prueba 2
        radio = 67;
        tipo = 2;
        System.out.println("El volumen de la esfera es: " + obj.calcular_Perímetro_Area_volumen(radio, tipo));

        //prueba 3
        radio = 13;
        tipo = 3;
        System.out.println("El volumen de la esfera es: " + obj.calcular_Perímetro_Area_volumen(radio, tipo));

    }
}
