package taxes.app;

import java.util.ArrayList;
import java.util.List;

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
