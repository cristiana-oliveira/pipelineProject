package demo;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {

    @Test
    public void testSumSuccess() {
        App appTest = new App();
        Assert.assertTrue(appTest.sumAmount(7, 11) == 18);
    }
    @Test
    public void testSum() {
        App appTest = new App();
        Assert.assertFalse(appTest.sumAmount(7, 11) == 11);
    }
}

