package io.basics;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Hotel implements Serializable {
    //private Room room = new Room();
    
    public static void main(String[] args) {
        Hotel h = new Hotel();
        try {
            FileOutputStream fos = new FileOutputStream("Hotel.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();
            System.out.println("Serialized");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Room {
}