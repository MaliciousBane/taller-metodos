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
    public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio5 obj = new Ejercicio5();
        
        int dias=3;
        System.out.println("Los dias en segundos son: "+obj.convertira_Segundos(dias ));
        
        
        int horas=32;
        System.out.println("Las horas en segundos son: "+obj.convertira_Segundos1(horas));
        
    
        int min=55;
        System.out.println("Los minutos en segundos son: "+obj.convertira_Segundos2(min ));
        
    }
    
    public int convertira_Segundos(int dias){
       
       
           int segundos = dias*86400;
           
        return segundos;
    }
    
     public int convertira_Segundos1(int horas){
       
       
           int segundos = horas*3600;
           
        return segundos;
    }
        
      public int convertira_Segundos2(int min){
       
       
           int segundos = min*60;
           
        return segundos;
    }
}

