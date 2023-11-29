package Client_code;



import Implementation_code.Counter;

public class Flips {

	public static void main(String[] args) {
		int  n = 10000;
		Counter heads = new Counter("headsss");
		Counter tails = new Counter("tailssss");
		for(int i =0; i<n; i++) {
			heads.increment();
			tails.increment();
		}
		System.out.println(heads);
		System.out.println(tails);
		int d = heads.tally() - tails.tally();
		System.out.println(d);

	}

}
