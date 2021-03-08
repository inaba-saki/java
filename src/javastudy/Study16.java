package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String [] flower = {"ネモフィラ" , "アザレア" , "アザミ" , "ウインターコスモス" , "ガーベラ" , "クリスマスローズ" , "コスモス" , "シクラメン" , "スイートピー" , "チューリップ" , "ヒアシンス"};
		int correct = 0 ;
		int a = 0 ;
		long start = System.currentTimeMillis();
		
		while(correct < 5) {
			int num = random.nextInt(flower.length);
			System.out.println(flower[num]);
			String x = scanner.next();
			if(flower[num].equals(x)) {
				System.out.println("正解です");
				correct++ ;
			} else {
				System.out.println("間違っています"); 
			}
			a += x.getBytes().length;
			System.out.println();
		}
		long end = System.currentTimeMillis();
		double time = (double)(end - start) / 1000 ;
		
		System.out.println("入力時間：" + time + "秒");
		System.out.println("入力文字数：" + a + "文字");
		System.out.println("１秒あたりの入力文字数：" + String.format("%.1f" , a / time)  + "文字");
	}
}
