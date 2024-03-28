package Day_07;

public class Wire {

	private Integer value;
	private Integer leftVal; // value with gate
	private Integer rightVal; // value with gate

	public Integer getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(Integer leftVal) {
		this.leftVal = leftVal;
	}

	public Integer getRightVal() {
		return rightVal;
	}

	public void setRightVal(Integer rightVal) {
		this.rightVal = rightVal;
	}
	private String gate;
	private String name;
	private Wire leftSide;
	private Wire rightSide;
	private Integer shift;

	public Integer getShift() {
		return shift;
	}

	public void setShift(Integer shift) {
		this.shift = shift;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
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
