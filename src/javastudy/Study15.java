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
//		  �O�F�O�[�A�P�F�`���L�A�Q�F�p�[
		  String [] number = {"�O�[","�`���L","�p�["};
		  int n = random.nextInt(number.length);
		  int win = 0;
		  int lose = 0;
		  while(win < 3 || lose < 3) {
		  int x = scanner.nextInt();
		  if (x == n) {
			  System.out.println(number[n]);
			  System.out.println("������");
		  } else if((x == 0 && n == 1) || (x == 1 && n == 2) || (x == 2 && n == 0) ) {
			  System.out.println(number[n]);
			  System.out.println("���Ȃ��̏���");
			  win++;
		  } else if((x == 0 && n == 2) || (x == 1 && n == 0) || (x == 2 && n == 1)) {
			  System.out.println(number[n]);
			  System.out.println("�R���s���[�^�̏���");
			  lose++;
		  }
		  }
		  Random r = new Random(); 
		  String [] lottery = {"��g","�g","���g","���g","���g","��"};
		  int fortune = r.nextInt(lottery.length);
		  System.out.println(lottery[fortune]);	
	}

}
