package taxes.app;

import taxes.app.view.MainView;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new MainView(new DataModel() {

            @Override
            public List<String> getStates() {
                return Arrays.asList("state1", "state2");
            }
        }));
    }
}
