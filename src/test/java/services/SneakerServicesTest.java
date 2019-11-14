package services;

import models.Sneaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SneakerServicesTest {
private Sneaker testSneaker;

    @Before
    public void setup() {
        SneakerService sneakerService = new SneakerService();
        testSneaker =  new Sneaker(875, "Vans", "Tennis", 11.5, 1, 54D);
    }

    @Test
    public void createTest() {

        // (1)
        Integer expectedId = 1;
        String expectedBrand = "Vans";
        String expectedSport = "Tennis";
        Double expectedSize = 11.5;
        int expectedQty = 1;
        Double expectedPrice = 54.00;

        // (2)


        // (3)
        int actualId = testSneaker.getId();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        Double actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        Double actualPrice = testSneaker.getPrice();

        // (4)
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
