

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
    public void testCalculatePrice() {
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
                "tyre price mismatch");
    }


    @Test
    @DisplayName("check cycle price before 2016")
    public void testCalculatePrice2() {
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

        assertEquals(2200, output.tyrePrice,
                "tyre price mismatch");
    }


}