
public class Study4 {

	public static void main(String[] args) {
		String[] names = {"아메리카노","라떄", "초코라떄"};
		int[] prices = {1400,2500, 3000};
//		for(int i =0; i< names.length; i++)
//			System.out.println(names[i]+ " "+prices[i]);
		Coffee 아메리카노 = new Coffee();
		아메리카노.name = "아메리카노";
		아메리카노.price = 1400;
		Coffee 아메리카노1 = new Coffee();
		아메리카노1.name = "라떄";
		아메리카노1.price = 3000;
		Coffee[] coffees = {아메리카노,아메리카노1};
		for(int i =0; i< coffees.length; i++)
			System.out.println(
					coffees[i].name+ " "+coffees[i].price);
	}

}
// 객체
class Coffee {
	// field
	String name;
	int price;
}
