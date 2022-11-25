package POM;

import com.deque.axe.AXE;
import drivers.Helper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import java.net.URL;

import static drivers.Helper.driver;

public class AccesscibityTest {

    private static final URL scriptURL = AccesscibityTest.class.getResource("/axe.min.js");

    public static void openHomePage(String Url) {
        Helper.get(Url);
    }

    public static void accesbility(){

        JSONObject response = new AXE.Builder(driver, scriptURL).analyze();

        JSONArray violations = response.getJSONArray("violations");

        if (violations.length()==0){
            System.out.println("No violations");
        }else{
            System.out.println("response : "+response);
            AXE.writeResults("sarcastic", response);
        }
    }
}
