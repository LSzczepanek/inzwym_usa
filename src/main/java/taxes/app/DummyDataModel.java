package taxes.app;

import java.util.ArrayList;
import java.util.List;

public class DummyDataModel implements DataModel{

	public List<String> getStates(){
		List<String> myList = new ArrayList<String>();
		myList.add("Alaska");
		myList.add("Alaska2");
		myList.add("Alaska3");
		myList.add("Alaska4");
		myList.add("Alaska5");
		return myList;
	}
}
