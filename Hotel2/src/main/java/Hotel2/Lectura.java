/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Lectura {
    Scanner sc = new Scanner(System.in);
    public int leerInt(String mensaje){
        System.out.println(mensaje+": ");
        int dato = sc.nextInt();
        return dato;
    }
    public String leerString(String mensaje){
        System.out.println(mensaje+": ");
        String dato = sc.next();
        return dato;
    }
   
    public double leerDoble(String mensaje){
        System.out.println("Ingrese el número: ");
        double dato = sc.nextDouble();
        return dato;
    }

    public double leerFloat(String mensaje){
        System.out.println("Ingrese un número: ");
        float dato = sc.nextFloat();
        return dato;
    }
   
    public int ValidarInt(int dato) {
        do {
            if(dato <= 0 ){
                System.out.println("Valor no valido");
                System.out.println("Ingrese de nuevo un valor valido");
                dato = sc.nextInt();
            }
        } while (dato <= 0);
        return dato;
    }
    
    public double validarDouble(double dato) {
        while (dato <= 0) {
            System.out.println("Valor no válido");
            System.out.println("Ingrese de nuevo un valor válido: ");
            dato = sc.nextDouble();
        }
        return dato;
    }
}
