package taxes.app.view;

import taxes.app.DataModel;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

	private DataModel dataModel;
	private JComboBox<String> states = new JComboBox<>();
	private JComboBox<String> products = new JComboBox<>();
	private JComboBox<String> category = new JComboBox<>();

	public MainView(DataModel dataModel) {
		super("Hello World");
		this.dataModel = dataModel;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(50,50);
		setLayout(new GridLayout(3, 3));
		add(states);
		add(products);
		add(category);

		dataModel.getStates().forEach(state -> states.addItem(state));
		dataModel.getProducts().forEach(product -> products.addItem(product));
		category.addItem("cat1");
		category.addItem("cat2");
		setVisible(true);
	}


}
