package models;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SneakerTest {
private Sneaker mySneaker;

    @Before
    public void setup() {
    mySneaker = new Sneaker (8745, "Nike", "Running", 11.5, 2, 65.10);
    }


    @Test
    public void setId() {
        // given (1)
        Integer expected = 6453;

        // when (2)
        mySneaker.setId(expected);

        // then (3)
        Assert.assertEquals(expected, mySneaker.getId());
    }

    @Test
    public void setName() {
        // given (1)
        String expected = "Mr. Daniels";

        // when (2)
        mySneaker.setName(expected);

        // then (3)
        Assert.assertEquals(expected, mySneaker.getName());
    }

    @Test
    public void setSport() {
        // given (1)
        String expected = "Walking";

        // when (2)
        mySneaker.setSport(expected);

        // then (3)
        Assert.assertEquals(expected, mySneaker.getSport());
    }

    @Test
    public void setSize() {
        // given (1)
        Double expected = 9.5;

        // when (2)
        mySneaker.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, mySneaker.getSize());
    }

    @Test
    public void setQty() {
        // given (1)
        Integer expected = 6;

        // when (2)
        mySneaker.setQty(expected);

        // then (3)
        Assert.assertEquals(expected, mySneaker.getQty());
    }

    @Test
    public void setPrice() {
        // given (1)
        Double expected = 32.86;

        // when (2)
        mySneaker.setPrice(expected);

        // then (3)
        Assert.assertEquals(expected, mySneaker.getPrice());    }
}
