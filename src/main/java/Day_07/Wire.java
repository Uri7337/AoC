package Day_07;

public class Wire {

	private int value;
	private int leftVal; // value with gate
	private int rightVal; // value with gate

	public int getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(int leftVal) {
		this.leftVal = leftVal;
	}

	public int getRightVal() {
		return rightVal;
	}

	public void setRightVal(int rightVal) {
		this.rightVal = rightVal;
	}
	private String gate;
	private String name;
	private Wire leftSide;
	private Wire rightSide;
	private int shift;

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getGate() {
		return gate;
	}

	public void setGate(String gate) {
		this.gate = gate;
	}

	public Wire getLeftSide() {
		return leftSide;
	}

	public void setLeftSide(Wire leftSide) {
		this.leftSide = leftSide;
	}

	public Wire getRightSide() {
		return rightSide;
	}

	public void setRightSide(Wire rightSide) {
		this.rightSide = rightSide;
	}

	
}
