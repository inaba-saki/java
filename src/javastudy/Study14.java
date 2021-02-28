package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2-1,2-2
		  Scanner scanner = new Scanner(System.in);
		  Scanner s = new Scanner(System.in);
		  Random r = new Random();
//		  ０：グー、１：チョキ、２：パー
		  String [] number = {"グー","チョキ","パー"};
		  int n = r.nextInt(number.length);
		  int count = 0;
		  while(count < 1) {
		  int x = scanner.nextInt();
		  if (x == n) {
			  System.out.println(number[n]);
			  System.out.println("あいこ");
  		  } else if((x == 0 && n == 1) || (x == 1 && n == 2) || (x == 2 && n == 0) ) {
			  System.out.println(number[n]);
			  System.out.println("あなたの勝ち");
			  count++;
		  } else if((x == 0 && n == 2) || (x == 1 && n == 0) || (x == 2 && n == 1)) {
			  System.out.println(number[n]);
			  System.out.println("あなたの負け");
			  count++;
		  }
		  }
	  }

}
