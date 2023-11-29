package Implementation_code;

public class Counter {
//Instance variables->name,count
	private final String name;
	private int count;
	// constructors
	public Counter(String id) {
		name = id;
	}
	//instance methods
	public void increment() {
		count++;
	}
	public int tally() {
		return count;
	}
	public String toString() {
		return count + " "+name;
	}
	
}
