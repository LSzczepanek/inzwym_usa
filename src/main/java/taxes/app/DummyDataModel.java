package taxes.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyDataModel implements DataModel{

	public List<String> getStates(){
		List<String> myList = new ArrayList<String>();
		myList.add("Alabama");
		myList.add("Alaska");
		myList.add("Arizona");
		myList.add("Arkansnas");
		myList.add("California");
		return myList;
	}

	@Override
	public List<String> getProducts(String category) {
		Map<String, List<String>> categories = new HashMap<>();
		List<String> groceries = new ArrayList<>();
		groceries.add("Maslo");
		groceries.add("Kaszanka");
		groceries.add("Twarog");
		groceries.add("Ser");
		groceries.add("Czekolada");
		categories.put("Groceries", groceries);


		List<String> preparedFood = new ArrayList<>();
		preparedFood.add("zuupa pomidorowa");
		preparedFood.add("czarnina");

		categories.put("Prepared food", preparedFood);
		return categories.getOrDefault(category, new ArrayList<>());
	}

	@Override
	public List<String> getCategories() {
		List<String> myList = new ArrayList<String>();
		myList.add("Groceries");
		myList.add("Prepared food");
		myList.add("Prescription drug");
		myList.add("Non-prescription drug");
		myList.add("Clothing drug");
		myList.add("Intangibles");
		return myList;
	}

}
