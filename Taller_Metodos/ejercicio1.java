/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_Metodos;

/**
 *
 * @author farfa
 */
public class ejercicio1 {
        public double p_descuento(float precio, float descuento) {

        float precio_final = precio * descuento / 100;
        float total = precio - precio_final;

        return total;
    }

    public static void main(String[] args) {
        ejercicio1 obj = new ejercicio1();
        
         float precio = 300;
        double descuento = 20;
        System.out.println("Prueba 1");
        System.out.println("el precio final es: "+obj.p_descuento(precio, (float) descuento));
        
      
        precio = 455;
        descuento = 15;
        System.out.println("Prueba 2");
        System.out.println("el precio final es: "+obj.p_descuento(precio, (float) descuento));
    }
}
