package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int [] numbers = { 2 , 5 , 7 };
		int medal = 50 ;
		while(medal > 2) {
			int reel1 = random.nextInt(numbers.length);
			int reel2 = random.nextInt(numbers.length);
			int reel3 = random.nextInt(numbers.length);
			System.out.println(numbers[reel1] + " " + numbers[reel2] + " " + numbers[reel3]);
//			�P��Ƀ��_���R���K�v
			medal -= 3 ;
			if (numbers[reel1] == numbers[reel2] && numbers[reel2] == numbers[reel3]) {
				if (reel1 == 0 || reel1 == 1) {
					medal *= 5 ;
					System.out.println("�I�I������I�I");	
				} else if (reel3 == 2) {
					medal *= 10 ;
					System.out.println("�I�I�I�哖����I�I�I");
				}
			} else {
				System.lineSeparator();
				System.out.println("�c�O");
			}
			System.out.println("�c��̃��_�������F" + medal + "��");
			System.out.println();
			int replay = scanner.nextInt();
			if (replay == 1) {
				System.out.println("���v���C");
			} else {
				System.out.println("�I�����܂�");
				break;
			}
		}

	}

}
