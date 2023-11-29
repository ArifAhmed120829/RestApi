package Client_code;

import Implementation_code.Date;

public class Date_Client {

	public static void main(String[] args) {
		int m = 99;
		int d  = 319;
		int y = 19999;
		int m1 = 10;
		int d1  = 31;
		int y1 = 1998;
		Date dd = new Date(m,d,y);
		Date dd2 = new Date(m1,d1,y1);
		System.out.println(dd.compareTo(dd2));
		System.out.println(dd);

	}

}
