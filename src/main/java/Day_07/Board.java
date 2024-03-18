
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
		addWire(wName, -1);
	}
	
	public void addWire(String wName, int value){
		addWire(wName, null, null, null, value, 0, -1, -1);
	}
	
	public void addWire(String wName, Wire left, String gate){
		addWire(wName, left, null, gate, -1, 0, -1, -1);
	}
	
	public void addWire(String wName, int val, Wire left, String gate){
		addWire(wName, left, null, gate, -1, 0, val, -1);
	}
	
	public void addWire(String wName, int val, Wire left, String gate){
		addWire(wName, left, null, gate, -1, 0, val, -1);
	}
	
	public void addWire(String wName, Wire left, Wire right, String gate){
		addWire(wName, left, right, gate, -1, 0, -1, -1);
	}
	
	public void addWire(String wName, Wire left, String gate, int shift){
		addWire(wName, left, null, gate, -1, shift, -1, -1);
	}
	
	public void addWire(String wName, Wire left, Wire right, String gate, int value, int shift, int leftVal, int rightVal){
		Wire w = new Wire();
		w.setName(wName);
		w.setLeftSide(left);
		w.setGate(gate);
		w.setShift(shift);
		w.setRightSide(right);
		w.setValue(value);
		w.setLeftVal(leftVal);
		w.setRightVal(rightVal);
		wiresList.put(wName, w);
	}
	
	public Wire getWire(String wName){
		Wire w = wiresList.get(wName);
		return w;
	}
	
	public Wire getCreateWire(String wName){
		if (!(hasWire(wName))) {
			addWire(wName);
		}
		Wire w = wiresList.get(wName);
		return w;
	}
	
	public int getWireValue(String wName){
		Wire w = wiresList.get(wName);
		return w.getValue();
	}
	
	public void setWireValue(String wName,int value){
		Wire w = wiresList.get(wName);
		w.setValue(value);
	}
	
	public String getWireGate(String wName){
		Wire w = wiresList.get(wName);
		return w.getGate();
	}
	
	public void setWireGate(String wName, String gate){
		Wire w = wiresList.get(wName);
		w.setGate(gate);
	}
	
	public Wire getWireLeftSide(String wName){
		Wire w = wiresList.get(wName);
		return w.getLeftSide();
	}
	
	public void setWireLeftSide(String wName, Wire left){
		Wire w = wiresList.get(wName);
		w.setLeftSide(left);
	}
	
	public Wire getWireRightSide(String wName){
		Wire w = wiresList.get(wName);
		return w.getRightSide();
	}
	
	public void setWireRightSide(String wName, Wire right){
		Wire w = wiresList.get(wName);
		w.setRightSide(right);
	}
	
	public boolean hasWire(String wName){
		boolean b = false;
		if(!(wiresList.get(wName) == null)){
			b = true;
		}
		return b;
	}
	public boolean emptyValue(String wName){
		boolean b = false;
		if(getWireValue(wName) == 0){
			b = true;
		}
		return b;
	}
}
