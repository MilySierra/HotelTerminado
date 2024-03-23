/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel2;

/**
 *
 * @author USUARIO
 */
public class Registro {
    public static void menu(){
    Lectura nw = new Lectura();
    int i = 0;
    int k = 0;
    while (k != 5){
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Bienvenidos al sistema de limpiza, a continuacion tendra las siguientes opciones a elegir");
            System.out.println("1. Ingresar habitación");
            System.out.println("2. Ingresar mucama");
            System.out.println("3. Mostrar las habitaciones ingresadas");
            System.out.println("4. Mostrar las mucamas que limpiaron habitaciones");
            System.out.println("5. Salir");

            i = nw.leerInt("Ingrese la opción");
            if (i > 5 || i < 1) {
                System.out.println("Usted digitó mal las opciones, prueba de nuevo");
            } else{
                switch (i){
                    case 1 -> {
                       ArrayRoom.enterRooms();
                }
                    case 2 -> {
                       ArrayHK.enterHouseKeeping();
                }
                    case 3 ->{
                        System.out.println("Hasta el momento las habitaciones registradas son: ");
                        ArrayRoom.showList();
                    }
                    case 4 -> {
                        System.out.println("Hasta el momento las mucamas que han limpiado habitaciones son: ");
                        ArrayHK.showList();
                    }
                    case 5 -> k = 5;
                }
            }
        }
    }
}
