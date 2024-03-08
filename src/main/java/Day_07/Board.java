
package Day_07;

import java.util.HashMap;

public class Board {
	HashMap<String, Wire> wiresList = new HashMap<String, Wire>();

	public HashMap<String, Wire> getWiresList() {
		return wiresList;
	}

	public void setWiresList(HashMap<String, Wire> wiresList) {
		this.wiresList = wiresList;
	}
	
	public void addWire(String wName){
		Wire w = new Wire();
		w.setName(wName);
		wiresList.put(wName, w);
	}
	
	public Wire getWire(String wName){
		Wire w = wiresList.get(wName);
		return w;
	}
	
	public boolean hasWire(String wName){
		boolean b = false;
		if(!(wiresList.get(wName) == null)){
			b = true;
		}
		return b;
	}
}
