package javastudy;

import java.util.Random;
import java.util.Scanner;


public class Study11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0�F�n�C�A���h���[�Q�[��
		  Scanner s = new Scanner(System.in);
		  Random a = new Random();
//		  Random b = new Random();
		  int select = s.nextInt(); 
		  int x = a.nextInt(10)+1;
		  int y = a.nextInt(10)+1;
		  int total = x + y ;
		  if (select == 1 && total >= 11) {
			  System.out.println("������");
		  } else if (select == 1 && total < 11) {
			  System.out.println("�͂���");
		  } else if (select == 2 && total < 11) {
			  System.out.println("������");
		  } else if (select == 2 && total >= 11) {
			  System.out.println("�͂���");
		  }
		  	  System.out.println(total);
		  

	}

}
