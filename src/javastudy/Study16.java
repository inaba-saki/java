package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String [] flower = {"�l���t�B��" , "�A�U���A" , "�A�U�~" , "�E�C���^�[�R�X���X" , "�K�[�x��" , "�N���X�}�X���[�Y" , "�R�X���X" , "�V�N������" , "�X�C�[�g�s�[" , "�`���[���b�v" , "�q�A�V���X"};
		int correct = 0 ;
		int a = 0 ;
		long start = System.currentTimeMillis();
		
		while(correct < 5) {
			int num = random.nextInt(flower.length);
			System.out.println(flower[num]);
			String x = scanner.next();
			if(flower[num].equals(x)) {
				System.out.println("�����ł�");
				correct++ ;
			} else {
				System.out.println("�Ԉ���Ă��܂�"); 
			}
			a += x.getBytes().length;
			System.out.println();
		}
		long end = System.currentTimeMillis();
		double time = (double)(end - start) / 1000 ;
		
		System.out.println("���͎��ԁF" + time + "�b");
		System.out.println("���͕������F" + a + "����");
		System.out.println("�P�b������̓��͕������F" + String.format("%.1f" , a / time)  + "����");
	}
}
