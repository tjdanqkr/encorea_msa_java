
public class Test2 {

	public static void main(String[] args) {
		int[][] arr = {
				{4,7,9,10}, // 16
				{2,7,3,4}, // 23
				{9,2,8,5},
				{8,4,2,1}
		};
		int sum = 0;
		// arr 탐색을 하는데
		// 만약 짝수면 그 수를 출력을 하고
		// 홀수이면 더 하고
		// 더한 값이 20이 넘으면 끝내고 
		// 더한 값을 출력하라
		// 15분 
//		is_break  snake case
//		isBreak camel case
		for(int i =0; i < arr.length; i++) {
			boolean isBreak = sum > 20;
			for(int j =0; j < arr[i].length; j++) {
				int now = arr[i][j];
				if(now % 2 == 0)
					System.out.println(now);
				else {
					sum += now; 
					isBreak = sum > 20;
					if(isBreak) break;
				}
			}
			if(isBreak) break;
		}
		System.out.println(sum);
		
		
	}

}
