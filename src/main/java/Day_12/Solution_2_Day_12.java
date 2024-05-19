package Day_12;

import Shared.ReadFile;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

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
			int[] res = {0, 0};
			// Create Gson object
			Gson gson = new Gson();

			// Convert string to JSON
			Object jsonObject = gson.fromJson(line, Object.class);
			if (jsonObject instanceof List) {
				List jo = (List) jsonObject;
				for (Object object : jo) {
					res = count(object);
					if (res[1] != 1) {
						solution = solution + res[0];
					}
				}
			}
//			else if (jsonObject instanceof AbstractMap) {
//				p("mapiška/jakoby objektik in JSON | tak koukneme do mapišky:");
//				AbstractMap obj = (AbstractMap) jsonObject;
//				System.out.println(obj.values());
//				p("zandame mapišku");
//			}

		}

		return solution;
	}

	public int[] count(Object object) {
		// ifRedThenOne[1] == 1 if object contains red String;
		int[] ifRedThenOne = {0, 0};
//		System.out.println(object.getClass());   
		if (object instanceof AbstractMap) {
			AbstractMap map = (AbstractMap) object;
			int[] mapRes = {0, 0};

			p("mapiška/jakoby objektik in JSON | tak koukneme do mapišky:");
			System.out.println(map.entrySet());

			for (Object o : map.values()) {
				mapRes = count(o);
				if (mapRes[1] == 1) {
					ifRedThenOne[0] = 0;
//					ifRedThenOne[0] = 0;
					return ifRedThenOne;
				} else {
					ifRedThenOne[0] = ifRedThenOne[0] + mapRes[0];
				}
			}

			p("zandame mapišku");
		} else if (object instanceof List) {
			p("listík/jakoby array in JSON | tak si přečteme listik:");
			List l = (List) object;
			for (Object listitem : l) {
					res[] = count(listitem);
					if (res[1] != 1) {
						solution = solution + res[0];
					}
				}
			
			p("srolujeme listik");
		} else if (object instanceof Double) {
			Double doub = (Double) object;
			p("cisilko: " + doub.toString());
			int num = doub.intValue();
			p("cisilko intik: " + num);
			ifRedThenOne[0] = ifRedThenOne[0] + num;
		} else if (object instanceof String) {
			String s = (String) object;
			p("stringacek: " + s);
			if (s.equals("red")) {
				ifRedThenOne[1] = 1;
			}

		} else {
			p("neznam: " + object.getClass());
		}
		if (ifRedThenOne[1] == 1) {
			ifRedThenOne[0] = 0;
			return ifRedThenOne;
		} else {
			return ifRedThenOne;
		}

	}

	//prints content, System.out.println is way too long
	public void p(Object content) {
		System.out.println(content.toString());
	}

	// ----debug zone----
}
