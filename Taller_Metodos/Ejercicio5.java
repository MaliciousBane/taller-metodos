/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negocio;

/**
 *
 * @author HP
 * 
 * Pasar de días, horas y minutos a segundos. 
 * Escribe un metodo que reciba los siguientes datos: días, horas y minutos. 
 * Y retorne con la cantidad de segundos totales que son esos datos.
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio5 obj = new Ejercicio5();
        
        int dias=3;
        int horas=0;
        int min=0;
        int opcion=1;
        System.out.println("Los dias en segundos son: "+obj.convertira_Segundos(dias, horas, min, opcion ));
        
        dias=0;
        horas=32;
        min=0;
        opcion=2;
        System.out.println("Las horas en segundos son: "+obj.convertira_Segundos(dias, horas, min, opcion ));
        
        dias=0;
        horas=0;
        min=55;
        opcion=3;
        System.out.println("Los minutos en segundos son: "+obj.convertira_Segundos(dias, horas, min, opcion ));
        
    }
    
    
    public int convertira_Segundos(int dias, int horas,int min, int opcion ){
        int segundos=0;
        switch (opcion) {
            case 1 -> segundos = dias*86400;
            case 2 -> segundos= horas*3600;
            case 3 -> segundos = min*60;
        }
        return segundos;
    
    }
}
