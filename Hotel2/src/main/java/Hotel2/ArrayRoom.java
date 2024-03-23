/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel2;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ArrayRoom {
    static Lectura mc = new Lectura();
    static ArrayList<Rooms> rooms = new ArrayList<>();
    //static int ID = mc.leerInt("Ingrese el id de la habitación que se encuentra limpiando");
        
    public static void enterRooms(){
        int ID = mc.leerInt("Ingrese el id de la habitación que se encuentra limpiando");
        int bedrooms = mc.leerInt("Ingrese la cantidad de alcohobas");
        String name = mc.leerString("Ingrese el tipo de habitación (familiar,doble,sencilla,suite)");
        Rooms room = new Rooms(ID,bedrooms,name);
        rooms.add(room);
       
    }
    
    public static void showList() {
        if (!rooms.isEmpty()) {
            for (int i = 0; i < rooms.size(); i++) {
                System.out.println(rooms.get(i));
            }
        } else {
            System.out.println("Usted no ha ingresa ninguna habitación.");
        }
    }
    
        public static ArrayList<Rooms> getRooms(){
        for (int i = 0; i < rooms.size(); i++) {
            rooms.get(i);
        }
        return rooms;
    }

}
