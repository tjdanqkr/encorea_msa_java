
public class Study1 {

	public static void main(String[] args) {
//		String , byte ,short, int , 
//		long ,float, double, boolean
		int a = 9; // 1 2 3 6
		// 6
//		for (int i = a; i > 0; i--) { 
//			// i = 6 5 4 3 2 1 / 0 
//			if (a % i == 0)
//				System.out.print(i);
//		}
//		// a+1 = 7
//		// 6 * 6 = 36
//		for (int i=1; i<a+1; i++) {
//			// 6
//			for (int j=1; j<a+1; j++) {
//				// 6
//				if (i*j == a) { 
//					// i = 1 j = 6
//					System.out.println(i);
//				}
//			}
//		}
		a = 9;
		
		// && : and 둘다 만족 
		// || : or 둘중 하나 만족
		if(a % 2 == 0 || a % 3 ==0) {
			System.out.println("6");
		}else if(a % 2 == 0) {
			System.out.println("2");
		} else if(a % 3 ==0) {
			System.out.println("3");
		} 
		
		
	}

}
