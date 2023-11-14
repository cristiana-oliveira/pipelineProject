package demo.controller;

import org.junit.Assert;
import org.junit.Test;

public class HelloControllerTest {

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
