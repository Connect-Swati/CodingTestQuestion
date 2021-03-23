import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Price {
    public static void main(String args[]) throws FileNotFoundException {
       // System.out.println( "Provide the location to your JSON file:" );
        Gson gson = new Gson();
        Reader reader = new FileReader( "src/main/resources/example.json" );
        Cycle[] data = gson.fromJson( reader, Cycle[].class );
        System.out.println(  );
        System.out.println( "Number of records found in json file : " + data.length);
        System.out.println( "below are record values : " );
        System.out.println(  );

        for(int i=0;i<data.length;i++)
        {
            System.out.println( "showing the value of record no : "+ (i+1 ));
            ToReturnValue output= data[i].calculatePrice();
            System.out.println( "Date Of purchasing of tyre : " + output.dateOfPurchasingOfTyre);
            System.out.println( "Tyre price is: " + output.tyrePrice);
            System.out.println( "Frame price :   " + output.framePrice);
            System.out.println("handlebar price :" + output.handlebarPrice);
            System.out.println("Wheel price :" +output.wheelerPrice);
            System.out.println("Wheel price : " +output.seatingPrice);
            System.out.println("Wheel price : " +output.chainprice);
            System.out.println("total price of cycle is : " + output.totalcyclePrice);
            System.out.println(  );
            System.out.println( "------------------------------------" );
        }

    }


}



