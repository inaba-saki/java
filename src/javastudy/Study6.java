package javastudy;

public class Study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6-1
		double height = 1.5 ;
		int weight = 40 ;
		double bmi = weight / height / height ;
		System.out.println(bmi);
		
		//6-2
		if (bmi >= 0 && bmi <= 18.5) {
			System.out.println("’á‘Ìd");
		} else if (bmi <= 25) {
			System.out.println("•W€");
		} else if (bmi <= 30) {
			System.out.println("”ì–");
		}
	}

}
