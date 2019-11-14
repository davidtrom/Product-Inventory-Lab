package services;

import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService {

    private static int nextId = 1;  // (1)

    private ArrayList<Whiskey> whiskeyInventory = new ArrayList<>();  // (2)

    public Whiskey create (Integer id, String brand, String size, int quantity, Double price) {
        Whiskey createdWhiskey = new Whiskey(nextId++, brand, size, quantity, price);
        whiskeyInventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public Whiskey findWhiskey(int id) {       // should take an int and return an object with that id, if exists
        Whiskey whiskeyToFind =null;
        for (int i = 0; i < whiskeyInventory.size(); i++) {
            if (whiskeyInventory.get(i).getId().equals(id)){
                whiskeyToFind = whiskeyInventory.get(i);
            }
        }
        return whiskeyToFind;
    }


    public Whiskey[] findAll() {        // should return a basic array copy of the ArrayList
        Whiskey [] whiskeyInventoryArray = new Whiskey[whiskeyInventory.size()];
        whiskeyInventoryArray = whiskeyInventory.toArray(whiskeyInventoryArray);
        return whiskeyInventoryArray;
    }

    public boolean delete(int id) {     // should remove the object with this id from the ArrayList if exits and return true.  Otherwise return false
        boolean deleted = false;
        for (int i = 0; i < whiskeyInventory.size(); i++) {
            if (whiskeyInventory.get(i).getId().equals(id)) {
                whiskeyInventory.remove(whiskeyInventory.get(i));
                deleted = true;
            }
        }
        return deleted;
    }

}

