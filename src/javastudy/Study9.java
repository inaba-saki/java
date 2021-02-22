package javastudy;

public class Study9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1 ; i <= 5 ; i++) {
			for(int n = 0 ; n < 5 - i ; n++) {
				System.out.print(" " + " ");
			}
			for (int n = 0 ; n < i ; n++) {
				System.out.print("¡" + " ");
			}
			for(int a = 1 ; a < i ; a++) {
				System.out.print("¡" + " ");
			}
			for(int a = 0 ; a < 5 - i ; a++) {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
		for (int i = 1 ; i <= 4 ; i++) {
			for (int n = 0 ; n < i ; n++) {
				System.out.print(" " + " ");
			}
			for(int n = 0 ; n < 5 - i ; n++) {
				System.out.print("¡" + " ");
			}
			for(int a = 0 ; a < 4 - i ; a++) {
				System.out.print("¡" + " ");
			}
			for(int a = 0 ; a < i ; a++) {
				System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

}
