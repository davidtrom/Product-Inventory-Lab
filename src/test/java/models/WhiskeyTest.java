package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhiskeyTest {
private Whiskey testWhiskey;

    @Before
        public void setUp() {
       testWhiskey = new Whiskey(5821, "JD", "1.75L", 3, 45D);
    }

    @Test
    public void constructorTest() {
        Integer expectedId = 5821;
        String expectedBrand = "JD";
        String expectedSize = "1.75L";
        Integer expectedQty = 3;
        Double expectedPrice = 45.00;

        Assert.assertEquals(expectedId, testWhiskey.getId());
        Assert.assertEquals(expectedBrand, testWhiskey.getName());
        Assert.assertEquals(expectedSize, testWhiskey.getSize());
        Assert.assertEquals(expectedQty, testWhiskey.getQty());
        Assert.assertEquals(expectedPrice, testWhiskey.getPrice());
    }
    

    @Test
    public void setId() {
        // given (1)
        Integer expected = 6453;

        // when (2)
        testWhiskey.setId(expected);

        // then (3)
        Assert.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setName() {
        // given (1)
        String expected = "Mr. Daniels";

        // when (2)
        testWhiskey.setName(expected);

        // then (3)
        Assert.assertEquals(expected, testWhiskey.getName());
    }


    @Test
    public void setSize() {
        // given (1)
       String expected = "0.5L";

        // when (2)
        testWhiskey.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, testWhiskey.getSize());
    }


    @Test
    public void setQty() {
        // given (1)
        Integer expected = 6;

        // when (2)
        testWhiskey.setQty(expected);

        // then (3)
        Assert.assertEquals(expected, testWhiskey.getQty());
    }


    @Test
    public void setPrice() {
        // given (1)
        Double expected = 32.86;

        // when (2)
        testWhiskey.setPrice(expected);

        // then (3)
        Assert.assertEquals(expected, testWhiskey.getPrice());
    }
}
