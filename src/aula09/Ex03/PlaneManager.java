package aula09.Ex03;

import java.util.ArrayList;
import java.util.HashMap;
import aula09.Ex03.Planes.*;

public class PlaneManager {
    private HashMap<String, Plane> Planes = new HashMap<>();

    public PlaneManager(){}

    public PlaneManager(HashMap<String, Plane> Planes){
        this.Planes = Planes;
    }


    public HashMap<String,Plane> getPlanes() {
        return this.Planes;
    }

    public void setPlanes(HashMap<String,Plane> Planes) {
        this.Planes = Planes;
    }

    public void addPlane(Plane plane){
        Planes.put(plane.getIdentificador(), plane);
    }

    public void removePlane(String id){
        if (Planes.containsKey(id)){
            Planes.remove(id);
        }
    }

    public Plane searchPlane(String id){
        if (Planes.containsKey(id)){
            return Planes.get(id);
        }else{
            return null;
        }
    }

    public ArrayList<Plane> getCommercialPlanes(){
        ArrayList<Plane> commercialPlanes = new ArrayList<Plane>();

        for (Plane Plane : Planes.values()) {
            if (Plane.getPlaneType().equals("Comercial")){
                commercialPlanes.add(Plane);
            }
        }

        return commercialPlanes;
    }

    public ArrayList<Plane> getMilitaryPlanes(){
        ArrayList<Plane> militaryPlanes = new ArrayList<Plane>();

        for (Plane Plane : Planes.values()) {
            if (Plane.getPlaneType().equals("Militar")){
                militaryPlanes.add(Plane);
            }
        }

        return militaryPlanes;
    }

    public void printAllPlanes(){
        for (Plane plane : Planes.values()) {
            System.out.println(plane);
        }
    }

    public Plane getFastestPlane(){
        Plane FastestPlane = new CommercialPlane(null, null, null, 0, 0, 0, 0);
        for (Plane plane : Planes.values()) {
            if (plane.getMax_vel() > FastestPlane.getMax_vel()){
                FastestPlane = plane;
            }
        }

        return FastestPlane;
    }
}
