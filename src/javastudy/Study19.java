package javastudy;

public class Study19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello("‚³‚«");
		number(3);
		System.out.println(number(5));
		
		num(2 , 3);
		System.out.println(num(2,3));
	}
	public static void hello(String name) {
		System.out.println(name + "‚³‚ñ‚±‚ñ‚É‚¿‚Í");
	}
	
	public static int number(int a) {
		int b = a * a * a ;
		return b ;
	}
	
	public static int num(int x , int y) {
		int i = x * y ;
		return i ;
	}
}
