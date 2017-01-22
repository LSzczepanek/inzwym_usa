package taxes.app;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import taxes.app.view.MainView;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> new MainView(new DummyDataModel()));

		try {
		     CSVReader csvReader = new CSVReader(new FileReader("StanyZPodatkami.csv"));

		      CsvToBean csv = new CsvToBean();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
