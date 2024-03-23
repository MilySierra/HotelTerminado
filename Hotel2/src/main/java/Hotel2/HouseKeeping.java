
package Hotel2;

public class HouseKeeping {
    private String nameHk;
    private int idHk;
    private int idRoom;

    public HouseKeeping() {
    }

    public HouseKeeping (String nameHk, int idHK,  int idRoom) {
        this.nameHk = nameHk;
        this.idHk = idHK;
        this.idRoom = idRoom;
    }

    public String getNombreHK() {
        return nameHk;
    }

    public void setNombreHK(String nombreHK) {
        this.nameHk = nombreHK;
    }

    public int getIdHK(){
        return idHk;
    }

    public void setIdHk(int idHk){
        this.idHk = idHk;
    }
    public int getIdRoom(){
        return idRoom;
    }
    
    public void setIdRoom(int idRoom){
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return "Mucamas:{" + "Id Mucama = " + idHk + " , Nombre de la mucama = " + nameHk + ", Id de la habitacion que limpió = " + idRoom + '}';
    }

}
