package javastudy;

import java.util.Random;

public class Study12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1-1���݂����Q�[��
		  Random r = new Random();
		  String [] lottery = {"��g","�g","���g","���g","���g","��"};
		  int number = r.nextInt(lottery.length);
		  System.out.println(lottery[number]);		 
	}

}
