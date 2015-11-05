package AeroportTest;

import Airport.Aeroport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by kecaron on 04/11/2015.
 */
public class TestAeroport {
    private Aeroport name;
    @BeforeMethod
    public void setUp() throws Exception {
        name = new Aeroport("DEN");
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
    @Test
    public void test () throws Exception {
        

    }
    @Test
    public void testGetCode() throws Exception {

    }
}