package taxes.app.view;

import taxes.app.DataModel;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

	private DataModel dataModel;
	private JComboBox<String> states = new JComboBox<>();
	private JComboBox<String> products = new JComboBox<>();
	private JComboBox<String> category = new JComboBox<>();
	private JTextField priceWithTax = new JTextField();
	private JTextField priceBase = new JTextField();

	public MainView(DataModel dataModel) {
		super("Hello World");
		this.dataModel = dataModel;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(50,50);
		setLayout(new GridLayout(3, 2));
		add(states);
		add(priceWithTax);
        add(category);
		add(products);
		add(priceBase);

		priceWithTax.setEnabled(false);
		priceWithTax.setText("Price with tax");
		priceBase.setEnabled(false);
		priceBase.setText("price");
		dataModel.getStates().forEach(state -> states.addItem(state));
        dataModel.getCategories().forEach(state -> category.addItem(state));
		category.addActionListener(a -> {
			System.out.println("selected category item:"+category.getSelectedItem().toString());
			products.removeAllItems();
			dataModel.getProducts(category.getSelectedItem().toString()).forEach(product -> products.addItem(product));
		});
		setVisible(true);
	}


}
