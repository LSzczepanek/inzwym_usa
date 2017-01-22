package taxes.app.view;

import taxes.app.DataModel;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

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
        add(category);
		add(products);
        add(states);
		add(priceBase);
        add(priceWithTax);

		priceWithTax.setEnabled(false);
		priceWithTax.setText("Price with tax");
		priceBase.setEnabled(false);
		priceBase.setText("price");
        dataModel.getCategories().forEach(state -> category.addItem(state));
        dataModel.getProducts(category.getSelectedItem().toString()).forEach(product -> products.addItem(product));
		category.addActionListener(a -> {
			System.out.println("selected category item:"+category.getSelectedItem().toString());
			products.removeAllItems();
            states.removeAllItems();
			dataModel.getProducts(category.getSelectedItem().toString()).forEach(product -> products.addItem(product));
		});

        products.addActionListener(a->{
            final String product = Optional.ofNullable(products.getSelectedItem()).map(Object::toString).orElse("");
            System.out.println("selected product item:"+ product);
            if(product != null && product != ""){
                dataModel.getStates().forEach(state -> states.addItem(state));
            }
        });
		setVisible(true);
	}


}
