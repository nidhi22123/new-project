package demo1;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 1, c, i, count = 10;
		// To print 0 and 1
		System.out.print(a + " " + b);
		// loop starts from 2. We have already printed 0 and 1 in the previous step
		for (i = 2; i < count; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
	}

}}
