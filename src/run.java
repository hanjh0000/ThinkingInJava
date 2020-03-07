import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.tools.jaotc.Main;

import java.io.IOException;
import java.io.InputStream;

public class run {


    public static void main(String[] args) throws IOException {
        InputStream inputStream = Main.class.getResourceAsStream("c:/11.json");
        ObjectMapper mapper = new ObjectMapper();
        AppTO app = mapper.readValue(inputStream,AppTO.class);
        System.out.println(app);

    }

}
