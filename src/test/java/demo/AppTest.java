package demo;

import demo.controller.HelloController;
import org.junit.Assert;
import org.junit.Test;


public class AppTest {

    @Test
    public void welcomeTestSuccess() {
        HelloController controller = new HelloController();
        Assert.assertNotNull(controller.welcome("Cristiana"));
    }

    @Test
    public void welcomeTestUnsuccessful() {
        HelloController controller = new HelloController();
        Assert.assertNull(controller.welcome(null));
    }

}

