package taxes.app.view;

import taxes.app.DataModel;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

	private DataModel dataModel;
	private JComboBox<String> states = new JComboBox<>();
	private JComboBox<String> categories = new JComboBox<>();

	public MainView(DataModel dataModel) {
		super("Hello World");
		this.dataModel = dataModel;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(50,50);
		setLayout(new GridBagLayout());
		add(categories);
		dataModel.getCategories().forEach(state -> categories.addItem(state));
		add(states);
		dataModel.getStates().forEach(state -> states.addItem(state));
		setVisible(true);
	}


}
