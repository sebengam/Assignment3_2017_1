import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tank on 3/23/2017.
 */
public class baseballSetTest {
        baseballSet components;

        @Before
        public void setUp() throws Exception {
            components = new baseballSet("bat");
        }

        @Test
        public void testKitchenSet() throws Exception {
            Set<String> set = new HashSet<String>();

            set.add("ball");
            set.add("glove");
            set.add("helmet");
            set.add(components.getComponents());

            System.out.print("Baseball set list: " + set + "\n" );
            System.out.print("Number of components in the set is: " + set.size() + "\n");

            set.remove("ball");
            System.out.print("Baseball set after removing one component: " + set + "\n");
            System.out.print("current number of components is: " + set.size());

            Assert.assertEquals("bat", components.getComponents());
        }
}
