package Day_05;



import java.util.ArrayList;

import shared.EasyPrint;
import shared.ReadFile;

public class Solution_1_Day_05 {
	EasyPrint ep = new EasyPrint();
	
	ArrayList<String> file;

	long res;

	class Range{
		long left;
		long right;

		Range(long left,  long right){
			this.left = left;
			this.right = right;
		}
	}

	class Ingredient{
		long ID;
		boolean fresh;

		Ingredient(long ID){
			this.ID = ID;
			fresh = false;
		}
	}

	public void isIngredientFresh(Ingredient i, Range ra){
		if(ra.left <= i.ID && i.ID <= ra.right){
			i.fresh = true;
		}
	}

	public Object getSolution(String filepath) {

		ArrayList<Range> ranges = new ArrayList<>();
		ArrayList<Ingredient> ingredients = new ArrayList<>();

		res = 0;
		ReadFile rf = new ReadFile();
		file = new ArrayList<String>();
		file = rf.getInput(filepath);

		for (int y = 0; y < file.size(); y++) {
			String line = file.get(y);
			
			if(!line.equals("")){
				if(line.contains("-")){
					//ep.p(line);
					String[] linesplit = line.split("-");
					long l = Long.parseLong(linesplit[0]);
					long r = Long.parseLong(linesplit[1]);
					Range rang = new Range(l,r);
					ranges.add(rang);
				}else{
					long ing = Long.parseLong(line);
					Ingredient ingredient = new Ingredient(ing);
					ingredients.add(ingredient);
				}
			}
			
		}

		

		for (int i = 0; i < ingredients.size(); i++) {
			//ep.p(ingredients.get(i).ID);
			
			for (int j = 0; j < ranges.size(); j++) {
				//ep.p(ranges.get(i).left +"-"+ranges.get(i).right);
				isIngredientFresh(ingredients.get(i),ranges.get(j));
			}
			
		}

		for (int i = 0; i < ingredients.size(); i++) {
			if(ingredients.get(i).fresh){
				res++;
			}
			
		}

		//ep.p(ingredients);
		//ep.p(ranges);
		
        return res;
    }
	
}
