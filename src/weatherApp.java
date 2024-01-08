import org.json.simple.JSONObject;

import javax.swing.*;

public class weatherApp extends JFrame {

    private JSONObject WeatherData;
    public weatherApp(){
        super("weather");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(450,650);
        
    }

}
