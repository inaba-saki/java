package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2-2,2-3
		Scanner scanner = new Scanner(System.in);
		  Scanner s = new Scanner(System.in);
		  Random random = new Random();
//		  ０：グー、１：チョキ、２：パー
		  String [] number = {"グー","チョキ","パー"};
		  int n = random.nextInt(number.length);
		  int win = 0;
		  int lose = 0;
		  while(win < 3 || lose < 3) {
		  int x = scanner.nextInt();
		  if (x == n) {
			  System.out.println(number[n]);
			  System.out.println("あいこ");
		  } else if((x == 0 && n == 1) || (x == 1 && n == 2) || (x == 2 && n == 0) ) {
			  System.out.println(number[n]);
			  System.out.println("あなたの勝ち");
			  win++;
		  } else if((x == 0 && n == 2) || (x == 1 && n == 0) || (x == 2 && n == 1)) {
			  System.out.println(number[n]);
			  System.out.println("コンピュータの勝ち");
			  lose++;
		  }
		  }
		  Random r = new Random(); 
		  String [] lottery = {"大吉","吉","中吉","小吉","末吉","凶"};
		  int fortune = r.nextInt(lottery.length);
		  System.out.println(lottery[fortune]);	
	}

}
