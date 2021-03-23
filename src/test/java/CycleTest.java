

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CycleTest {

    private Cycle cycle;

    @BeforeEach
    public void setUp() throws Exception {
        cycle = new Cycle();
    }

    @Test
    @DisplayName("check cycle price after 2016")
    public void testCalculateTyrePrice() {
        String price="{\n" +
                "    \"id\":1,\n" +
                "    \"date\":\"10-2017\",\n" +
                "    \"frame\":\"steel\",\n" +
                "    \"handlebar\":\"smooth\",\n" +
                "    \"wheels\":\"steel\",\n" +
                "    \"spokes\":400,\n" +
                "    \"rim\":200,\n" +
                "    \"tube\":300,\n" +
                "    \"seating\":1,\n" +
                "    \"chain\":1,\n" +
                "    \"tyre\":\"tubeless\"\n" +
                "  }";
        Gson gson = new Gson();
        cycle = gson.fromJson( price, Cycle.class );
        ToReturnValue output= cycle.calculatePrice();

        assertEquals(2200, output.tyrePrice,
                "tyre price mismatch because price should be 230 after 2016");
    }


    @Test
    @DisplayName("check cycle price in 2016")
    public void testCalculateTyrePrice2() {
        String price="{\n" +
                "    \"id\":1,\n" +
                "    \"date\":\"10-2016\",\n" +
                "    \"frame\":\"steel\",\n" +
                "    \"handlebar\":\"smooth\",\n" +
                "    \"wheels\":\"steel\",\n" +
                "    \"spokes\":400,\n" +
                "    \"rim\":200,\n" +
                "    \"tube\":300,\n" +
                "    \"seating\":1,\n" +
                "    \"chain\":1,\n" +
                "    \"tyre\":\"tubeless\"\n" +
                "  }";
        Gson gson = new Gson();
        cycle = gson.fromJson( price, Cycle.class );
        ToReturnValue output= cycle.calculatePrice();

        assertEquals(200, output.tyrePrice,
                "tyre price matched for 2016");
    }

    @Test
    @DisplayName("check frame price  price for steel")
    public void testframePrice1() {
        String price="{\n" +
                "    \"id\":1,\n" +
                "    \"date\":\"10-2016\",\n" +
                "    \"frame\":\"steel\",\n" +
                "    \"handlebar\":\"smooth\",\n" +
                "    \"wheels\":\"steel\",\n" +
                "    \"spokes\":400,\n" +
                "    \"rim\":200,\n" +
                "    \"tube\":300,\n" +
                "    \"seating\":1,\n" +
                "    \"chain\":1,\n" +
                "    \"tyre\":\"tubeless\"\n" +
                "  }";
        Gson gson = new Gson();
        cycle = gson.fromJson( price, Cycle.class );
        ToReturnValue output= cycle.calculatePrice();

        assertEquals(200, output.framePrice,
                "frame price didnot match for frame steel . it should be 250 for frame= steel");
    }
    @Test
    @DisplayName("check frame price  price for steel")
    public void testframePrice2() {
        String price="{\n" +
                "    \"id\":1,\n" +
                "    \"date\":\"10-2016\",\n" +
                "    \"frame\":\"steel\",\n" +
                "    \"handlebar\":\"smooth\",\n" +
                "    \"wheels\":\"steel\",\n" +
                "    \"spokes\":400,\n" +
                "    \"rim\":200,\n" +
                "    \"tube\":300,\n" +
                "    \"seating\":1,\n" +
                "    \"chain\":2,\n" +
                "    \"tyre\":\"tubeless\"\n" +
                "  }";
        Gson gson = new Gson();
        cycle = gson.fromJson( price, Cycle.class );
        ToReturnValue output= cycle.calculatePrice();

        assertEquals(250, output.framePrice,
                "frame price did not match for frame steel . it should be 200");
    }

    @Test
    @DisplayName("check fchain price for chain = 2")
    public void testchainprice1() {
        String price="{\n" +
                "    \"id\":1,\n" +
                "    \"date\":\"10-2016\",\n" +
                "    \"frame\":\"steel\",\n" +
                "    \"handlebar\":\"smooth\",\n" +
                "    \"wheels\":\"steel\",\n" +
                "    \"spokes\":400,\n" +
                "    \"rim\":200,\n" +
                "    \"tube\":300,\n" +
                "    \"seating\":1,\n" +
                "    \"chain\":2,\n" +
                "    \"tyre\":\"tubeless\"\n" +
                "  }";
        Gson gson = new Gson();
        cycle = gson.fromJson( price, Cycle.class );
        ToReturnValue output= cycle.calculatePrice();

        assertEquals(200, output.chainprice,
                "chain price  match for chain=2");
    }
    @Test
    @DisplayName("check fchain price for chain = 2")
    public void testchainprice2() {
        String price="{\n" +
                "    \"id\":1,\n" +
                "    \"date\":\"10-2016\",\n" +
                "    \"frame\":\"steel\",\n" +
                "    \"handlebar\":\"smooth\",\n" +
                "    \"wheels\":\"steel\",\n" +
                "    \"spokes\":400,\n" +
                "    \"rim\":200,\n" +
                "    \"tube\":300,\n" +
                "    \"seating\":1,\n" +
                "    \"chain\":2,\n" +
                "    \"tyre\":\"tubeless\"\n" +
                "  }";
        Gson gson = new Gson();
        cycle = gson.fromJson( price, Cycle.class );
        ToReturnValue output= cycle.calculatePrice();

        assertEquals(250, output.chainprice,
                "chain price  didnot match for chain=2. it should be 200 for chain =2");
    }

}