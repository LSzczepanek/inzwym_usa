package taxes.app.view;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MainView extends JFrame {
	

	private JComboBox<String> states = new JComboBox<>();

	public MainView() {
		super("Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(50,50);
		setLayout(new GridBagLayout());
		add(states);
		states.addItem("Empty");
		setVisible(true);
	}

}
