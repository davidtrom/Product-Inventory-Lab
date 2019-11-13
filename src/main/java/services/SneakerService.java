package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {

    private static int nextId = 1;  // (1)

    private ArrayList<Sneaker> sneakerInventory = new ArrayList<>();  // (2)

    public Sneaker create (Integer id, String brand, String sport, Double size, int quantity, Double price) {
        Sneaker createdSneaker = new Sneaker(nextId++, brand, sport, size, quantity, price);
        sneakerInventory.add(createdSneaker);
        return createdSneaker;
    }

    public Sneaker findSneaker(int id) {       // should take an int and return an object with that id, if exists
       Sneaker sneakerToFind =null;
        for (int i = 0; i < sneakerInventory.size(); i++) {
             if (sneakerInventory.get(i).getId().equals(id)){
                 sneakerToFind = sneakerInventory.get(i);
             }
        }
        return sneakerToFind;
    }


    public Sneaker[] findAll() {        // should return a basic array copy of the ArrayList
        Sneaker [] sneakerInventoryArray = new Sneaker[sneakerInventory.size()];
        sneakerInventoryArray = sneakerInventory.toArray(sneakerInventoryArray);
        return sneakerInventoryArray;
    }



        public boolean delete(int id) {     // should remove the object with this id from the ArrayList if exits and return true.  Otherwise return false
            boolean deleted = false;
            for (int i = 0; i < sneakerInventory.size(); i++) {
                if (sneakerInventory.get(i).getId().equals(id)) {
                    sneakerInventory.remove(sneakerInventory.get(i));
                    deleted = true;
                }
            }
            return deleted;
        }
}
