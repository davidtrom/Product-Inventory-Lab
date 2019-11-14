package services;

import models.Whiskey;
import models.Whiskey;
import models.Whiskey;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class WhiskeyServiceTest {
    private Whiskey testWhiskey, testWhiskey1, testWhiskey2, testWhiskey3;
    private WhiskeyService whiskeyService;

    @Before
    public void setup() {
        WhiskeyService whiskeyService = new WhiskeyService();
        testWhiskey = whiskeyService.create(875, "Johnny", "1L", 3, 58.50);
        testWhiskey1 = whiskeyService.create(876, "Jim Beam", "1L", 2, 68.50);
        testWhiskey2 = whiskeyService.create(877, "Jack", "1L", 1, 52.50);
        testWhiskey3 = whiskeyService.create(878, "Gentleman Jack", "1L", 4, 78.50);
    }

    @Test
    public void createTest() {

        // (1)
        Integer expectedId = 875;
        String expectedBrand = "Johnny";
        String expectedSize = "1L";
        Integer expectedQty = 3;
        Double expectedPrice = 58.50;

        // (2)
        Integer actualId = testWhiskey.getId();
        String actualBrand = testWhiskey.getBrand();
        String actualSize = testWhiskey.getSize();
        Integer actualQty = testWhiskey.getQty();
        Double actualPrice = testWhiskey.getPrice();

        // (3)
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void findWhiskey() {
        Whiskey expected = testWhiskey3;
        Whiskey actual = whiskeyService.findWhiskey(878);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void delete() {
    }
}