package taxes.app;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import java.awt.EventQueue;

import taxes.app.view.MainView;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> new MainView());
		try {
		     CSVReader csvReader = new CSVReader(new FileReader("StanyZPodatkami.csv"));

		      CsvToBean csv = new CsvToBean();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}