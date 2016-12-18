package taxes.app;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

public class CsvDataModel implements DataModel {

	private static ColumnPositionMappingStrategy setColumMapping() {
		ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
		strategy.setType(String.class);
		String[] columns = new String[] { "State","Base Tax","Groceries","Prepared food","Prescritpion drug","Non-prescription drug","Clothing" };
		strategy.setColumnMapping(columns);
		return strategy;
	}

	public List<String> getStates() {
		try {
			CSVReader csvReader = new CSVReader(new FileReader("StanyZPodatkami.csv"));

			CsvToBean csv = new CsvToBean();
			List list = csv.parse(setColumMapping(), csvReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
