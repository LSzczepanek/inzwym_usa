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
	public List<String> getProducts() {

		List<String> myList = new ArrayList<String>();
		myList.add("Maslo");
		myList.add("Kaszanka");
		myList.add("Twarog");
		myList.add("Ser");
		myList.add("Czekolada");
		return myList;
	}
}
