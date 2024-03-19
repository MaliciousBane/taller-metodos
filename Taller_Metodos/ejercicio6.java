/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_Metodos;

/**
 *
 * @author farfa
 */
public class ejercicio6 {

    public float convertir_segundos(float segundos, int tipo) {

        if (tipo == 1) {
            int dias = (int) (segundos / 86400);
            return dias;

        } else if (tipo == 2) {
            float horas = segundos / 3600;
            return horas;

        } else {
            float minutos = segundos / 60;
            return minutos;
        }

    }

    public static void main(String[] args) {
        ejercicio6 obj = new ejercicio6();

        float segundos = 45000;
        int tipo = 2;
        System.out.println("El número de días es: " + obj.convertir_segundos(segundos, tipo));

        segundos = 697434647;
        tipo = 1;
        System.out.println("el número de horas es: " + obj.convertir_segundos(segundos, tipo));

        segundos = 143;
        tipo = 3;
        System.out.println("el número de minutos es: " + obj.convertir_segundos(segundos, tipo));

    }

}
