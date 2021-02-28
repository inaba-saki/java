package javastudy;

import java.util.Random;
import java.util.Scanner;


public class Study11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0：ハイアンドローゲーム
		  Scanner s = new Scanner(System.in);
		  Random a = new Random();
		  Random b = new Random();
		  int select = s.nextInt(); 
		  int x = a.nextInt(11);
		  int y = b.nextInt(11);
		  int total = x + y ;
		  if (select == 1 && total > 11) {
			  System.out.println("あたり");
		  } else if (select == 1 && total < 11) {
			  System.out.println("はずれ");
		  } else if (select == 2 && total < 11) {
			  System.out.println("あたり");
		  } else if (select == 2 && total > 11) {
			  System.out.println("はずれ");
		  }
		  	  System.out.println(total);
		  

	}

}
