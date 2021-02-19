package javastudy;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int language = 50 ;
		int math = 30 ;
		int score = language + math ;
		if (score >= 160) {
			System.out.println("—D");
		} else if (score >= 140 && score <= 159) {
			System.out.println("—Ç");
		} else if (score >= 100 && score <= 139) {
			System.out.println("‰Â");
		} else if (score < 100 || language <= 40 || math <= 40) {
			System.out.println("’ÇŽŽ"); 
			
		}
	}

}
