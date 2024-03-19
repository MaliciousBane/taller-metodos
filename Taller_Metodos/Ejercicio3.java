/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negocio;

import java.util.Scanner;



/**
 *
 * @author HP
 * Cambio de dólares a euros. Suponiendo que 1 euro = 1.33250 dólares. 
 * Escribe un metodo que reciba un número de dólares y retorne el calculo del cambio en euros
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio3 obj = new Ejercicio3();
        Scanner kb = new Scanner(System.in);
       float euros = 0;
       float dolares=100;
        System.out.println("La cantidad de dolares a euros tiene un valor de: "+obj.convertirDolares(dolares, euros)+" euros");
        
        dolares=1000;
        System.out.println("La cantidad de dolares a euros tiene un valor de: "+obj.convertirDolares(dolares, euros)+" euros");
        
        dolares=40;
        System.out.println("La cantidad de dolares a euros tiene un valor de: "+obj.convertirDolares(dolares, euros)+" euros");
        
        dolares=666;
        System.out.println("La cantidad de dolares a euros tiene un valor de: "+obj.convertirDolares(dolares, euros)+" euros");
        
        System.out.println("Digite una cantidad de dolares");
        dolares=kb.nextFloat();
        System.out.println("La cantidad de dolares a euros tiene un valor de: "+obj.convertirDolares(dolares, euros)+" euros");
    }
    
    public float convertirDolares(float dolares, float euros){
    
        euros=(float) (dolares/1.33250);
           
    return euros;
    }
    
}

 