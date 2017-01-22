package taxes.app;

import taxes.app.view.MainView;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new MainView(new DummyDataModel()));
    }
}
