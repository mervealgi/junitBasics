package org.example;
import org.junit.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;


public class AppTest {

    App app = new App();
    Object object;

    @BeforeClass                                                          //Execute only once so shouldnt take place on memory : static
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public void beforeMethod() {
        System.out.println("Test Started");
    }
    
    //@Rule
    //public Timeout globalTimeout = Timeout.seconds(20);

    @Test //(timeout = 1000)                                            Test has to finish in 1000ms
    public void shouldAnswerWithTrue() {
        assertEquals("Values arent equal", "Hello World", app.helloWorld());
    }

    @Test
    public void checkVisible() {
        assertTrue("True wasnt return", app.checkVisible());
    }

    @Test
    public void sumTest() {
        assertEquals("Incorrect operation", 2, app.sum(-3, 5));
    }

    @Test
    public void lowerCaseTest() {
        assertEquals("Typographical error", "algı", app.toLowerCase("ALGI"));
    }

    @Test
    public void nullTest() {
        assertNull("Object is not null", object);
        //assertNotNull( "Object is not null", object);                 //Test gonna be failed
    }

    @Test
    public void sameControlTest() {
        int num1 = 5;
        int num2 = 5;                                                   //Not gonna be the same even the variable types ld be long/float/double/byte.
        Integer num3 = 5;
        int summ;

        assertSame("Objects are not same", num1, num2);
        assertSame("Objects are not same", num1, num3);
    }

    @After
    public void tearDown() {
        System.out.println("End of the test.");
    }

    @AfterClass
    public static void afterClass(){                                    //Execute only once so shouldnt take place on memory
        System.out.println("After Class");
    }


}
