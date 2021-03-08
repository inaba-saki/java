package javastudy;

import java.util.Random;

public class Study13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1-2,1-3
		Random r = new Random();
		int count = 0;
		while(true) {
			int number = r.nextInt(6)+1;
			if(number == 1) {
				System.out.println("‘å‹g");
				count++;
				break;
			} else if (number == 2) {
				System.out.println("‹g");
				count++;
			} else if (number == 3) {
				System.out.println("’†‹g");
				count++;
			} else if (number == 4) {
				System.out.println("¬‹g");
				count++;
			} else if (number == 5) {
				System.out.println("––‹g");
				count++;
			} else if (number == 6) {
				System.out.println("‹¥");
				count++;
			}
		}
		System.out.println(count);
	}
}
