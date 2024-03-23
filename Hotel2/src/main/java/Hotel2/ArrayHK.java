package Hotel2;
import java.util.ArrayList;

public class ArrayHK {
    static Lectura mc = new Lectura();
    static ArrayList<HouseKeeping> HouseKeeping = new ArrayList<>();
    static ArrayList<Rooms> rooms = ArrayRoom.getRooms();
    public static void enterHouseKeeping(){
        int idRoom = mc.leerInt("Ingrese el id de la habitacion a limpiar");
        boolean verificarIdRoom = Tracker( rooms , idRoom);
        if (verificarIdRoom) {
            String nombreHK = mc.leerString("Ingrese el nombre de la mucama que esta limpiando");
            int idHK = mc.leerInt("Ingrese el id de la mucama que esta limpiando");
            HouseKeeping houseKeeping = new HouseKeeping(nombreHK,idHK,idRoom);
            HouseKeeping.add(houseKeeping);
            System.out.println("La mucama " + nombreHK + " con Id " + idHK
                    + " limpió la habitación con una id = " + idRoom );
        }else{
            System.out.println("El id de la habitacion que ingresó no existe");
        }
    }

    public static void showList() {
        if (!HouseKeeping.isEmpty()) {
            for (int i = 0; i < HouseKeeping.size(); i++) {
                System.out.println(HouseKeeping.get(i));
            }
        } else {
            System.out.println("No ha ingresado ninguna mucama hasta el momento");
        }
    }
    public static boolean Tracker(ArrayList<Rooms> rooms, int iDRoom){

        for (Rooms room : rooms) {
            if (room.getIdRoom() == iDRoom) {
                return true;
            }
        }
        return false;
    }
}

