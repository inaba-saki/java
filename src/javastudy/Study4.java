package javastudy;

public class Study4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-1
		int i = 20 ;
		switch(i % 2) {
		case 0 :
			System.out.println("‹ô”");
			break;
		case 1 :
			System.out.println("Šï”");
			break;
	
		}
		
		//4-2
		if((i % 2) == 0) {
			if(i >= 0) {
				System.out.println("³‚Ì‹ô”");
			} else {
				System.out.println("•‰‚Ì‹ô”");
			}
		} else {
			if(i >= 0) {
				System.out.println("³‚ÌŠï”");
			} else {
				System.out.println("•‰‚ÌŠï”");
			}
		}
		
		
		
	}

}
