/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel2;

/**
 *
 * @author USUARIO
 */
public class Rooms {
    private int idRoom;
    private int numBedrooms;
    private String typeRoom;

    public Rooms() {
    }

    public Rooms(int idRoom, int numBedrooms, String typeRoom) {
        this.idRoom = idRoom;
        this.numBedrooms = numBedrooms;
        this.typeRoom = typeRoom;
    }

    /**
     * @return the idRoom
     */
    public int getIdRoom() {
        return idRoom;
    }

    /**
     * @param idRoom the idRoom to set
     */
    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    /**
     * @return the numBedrooms
     */
    public int getNumBedrooms() {
        return numBedrooms;
    }

    /**
     * @param numBedrooms the numBedrooms to set
     */
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    /**
     * @return the typeRoom
     */
    public String getTypeRoom() {
        return typeRoom;
    }

    /**
     * @param typeRoom the typeRoom to set
     */
    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    @Override
    public String toString() {
        return "Roomss{" + "idRoom=" + idRoom + ", numBedrooms=" + numBedrooms + ", typeRoom=" + typeRoom + '}';
    }

    
}
