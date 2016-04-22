import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by yablanch on 22/04/2016.
 */
public class DictionaryTest {
    Dictionary dict;

    @org.junit.Before
    public void setUp() throws Exception {
        dict = new Dictionary("Example");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        dict = null;
    }

    @Test public void testDictionaryName(){
        //Dictionary dict = new Dictionary("Example");
        assertEquals(dict.getName(),"Example");
    }



    @Test public void testDictionaryEmpty(){
        //Dictionary dict = new Dictionary();
        assertTrue(dict.isEmpty());
    }


    @Test public void testOneTranslation () throws ClassNotFoundException {
        //Dictionary dict = new Dictionary("Example");
        dict.addTranslation("contre", "against");
        assertEquals(dict.getTranslation("contre"), "against");
    }

    @Test public void testOneTranslation2 () throws ClassNotFoundException {
       // Dictionary dict = new Dictionary("Example");
        dict.addTranslation("oui", "yes");
        assertEquals(dict.getTranslation("oui"), "yes");
    }



}