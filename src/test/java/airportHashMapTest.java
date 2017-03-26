import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Tank on 3/23/2017.
 */
public class airportHashMapTest {
    airportsHashMaps airport1;
    airportsHashMaps airport2;
    airportsHashMaps airport3;

    @Before
    public void setUp() throws Exception {
        airport1 = new airportsHashMaps("CA", "cape town");
        airport2 = new airportsHashMaps("jhb", "johannesburg");
        airport3 = new airportsHashMaps("dbn", "durban");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStatesHashMaps() throws Exception {
        HashMap<String, String> airports = new HashMap<String, String>();

        airports.put(airport1.getAirportCode(), airport1.getAirportName());
        airports.put(airport2.getAirportCode(), airport2.getAirportName());
        airports.put(airport3.getAirportCode(), airport3.getAirportName());

        System.out.print("airport names " + airports + "\n");
        System.out.print("The number of airports is: " + airports.size() + "\n");

        airports.remove("CA");
        System.out.print("List of airports after removing capetown " + airports + "\n");
        System.out.print("The number of aiports is now: " + airports.size() + "\n");

        airports.clear();
        System.out.print("When all airports are removes: " + airports + "\n");
        System.out.print("The number of airports is now: " + airports.size() + "\n");

        Assert.assertEquals("jhb", airport2.getAirportCode());
    }
}
