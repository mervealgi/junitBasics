package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest {
    App app = new App();

    @Test
    public void shouldAnswerWithTrue() {
        assertEquals("Verilen ifadeler uyuştu", "Hello World", app.helloWorld());
    }

    @Test
    public void checkVisible() {
        assertTrue("True değer gelmedi" , app.checkVisible());
    }

    @Test
    public void sumTest(){
        assertEquals("Toplama işlemi hatalı", 2 , app.sum(-3,5));
    }


}
