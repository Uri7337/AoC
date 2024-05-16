package Day_12;

import Shared.ReadFile;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.AbstractMap;
import java.util.List;

/*
1. GetClass
2. instance of - if (jsonObject instanceof List l) {
3. Přetypování (primitivní typy jsou něco jiného) 
4. rekurze počítání - count
 */
public class Solution_2_Day_12 {

	int solution = 0;

	public int getSolution() {
		ReadFile rf = new ReadFile();
		ArrayList<String> file = new ArrayList<String>();
		String filepath = "./src/main/resources/Day_12_test_2015.txt";
//		String filepath = "./src/main/resources/Day_12_2015.txt";
		file = rf.getInput(filepath);

		//Insert Solution Here:
		for (int i = 0; i < file.size(); i++) {
			String line = file.get(i);
			ArrayList<Integer> numbers = new ArrayList<Integer>();

			// Create Gson object
			Gson gson = new Gson();

			// Convert string to JSON
			Object jsonObject = gson.fromJson(line, Object.class);
			if (jsonObject instanceof List) {
				List jo = (List) jsonObject;
				for (Object object : jo) {
					count(object);
				}
			}else if (jsonObject instanceof AbstractMap) {
				p("mapiška/jakoby objektik in JSON | tak koukneme do mapišky:");
				AbstractMap obj = (AbstractMap) jsonObject;
				System.out.println(obj.values());
				p("zandame mapišku");
			}

		}

		return solution;
	}

	public void count(Object object) {
//		System.out.println(object.getClass());   
		if (object instanceof AbstractMap) {
			p("mapiška/jakoby objektik in JSON | tak koukneme do mapišky:");
			AbstractMap obj = (AbstractMap) object;
			System.out.println(obj.entrySet());
			p("zandame mapišku");
		} else if (object instanceof List) {
			p("listík/jakoby array in JSON | tak si přečteme listik:");
			count(object);
			p("srolujeme listik");
		} else if (object instanceof Double) {
			p("cisilko");
		} else {
			p("neznam: " + object.getClass());
		}

	}

	//prints content, System.out.println is way too long
	public void p(Object content) {
		System.out.println(content.toString());
	}

	// ----debug zone----
}
