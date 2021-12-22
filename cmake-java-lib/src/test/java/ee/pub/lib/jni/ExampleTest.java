package ee.pub.lib.jni;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @see Example
 * @author Imre Tabur <imre.tabur@eesti.ee>
 */
public class ExampleTest {

    Example instance;

    @BeforeEach
    public void setUp() {
        instance = new Example();
    }

    @Test
    public void nullTest() {
        assertNotNull(instance);
    }

    @Test
    public void testGetSomeValue() {
        assertNull(instance.getSomeValue());
    }

    @Test
    public void testSetSomeValue() {
        String someValue = "Set some value";
        instance.setSomeValue(someValue);
        assertNotNull(instance.getSomeValue());
        assertEquals(someValue, instance.getSomeValue());
    }

    @Test
    public void testSetSomeValue2() {
        String someValue = "Some value to set 2";
        assertEquals(someValue, instance.getSomeValue());
    }

    @Test
    public void nativeTest() {
        instance = new Example();
        String in = "Beavis";
        String someValue = "Cocoa " + in;
        String retval = instance.getHelloString(in);
        assertEquals(someValue, retval);
    }
}
