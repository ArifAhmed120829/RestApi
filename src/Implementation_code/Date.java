package Implementation_code;

public class Date implements Comparable<Date> {
	//Instance variables
	private final int day;
	private final int month;
	private final int year;
	
	//Constructors
	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	//Instance methods
	int month() {
		return month;
	}
	int day() {
		return day;
	}
	int year() {
		return year;
	}
	
	public int compareTo(Date that) {
		if(this.month>that.month) return +1;
		if(this.month<that.month) return -1;
		if(this.day>that.day) return +1;
		if(this.day<that.day) return -1;
		if(this.year>that.year) return +1;
		if(this.year<that.year) return -1;
		return 0;
		
	}
	
	public String toString() {
		return month()+"/"+day()+"/"+year();
	}
	
	
}
