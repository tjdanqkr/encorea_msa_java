
public class Study4 {

	public static void main(String[] args) {
		String[] names = {"�Ƹ޸�ī��","��", "���ڶ�"};
		int[] prices = {1400,2500, 3000};
//		for(int i =0; i< names.length; i++)
//			System.out.println(names[i]+ " "+prices[i]);
		Coffee �Ƹ޸�ī�� = new Coffee();
		�Ƹ޸�ī��.name = "�Ƹ޸�ī��";
		�Ƹ޸�ī��.price = 1400;
		Coffee �Ƹ޸�ī��1 = new Coffee();
		�Ƹ޸�ī��1.name = "��";
		�Ƹ޸�ī��1.price = 3000;
		Coffee[] coffees = {�Ƹ޸�ī��,�Ƹ޸�ī��1};
		for(int i =0; i< coffees.length; i++)
			System.out.println(
					coffees[i].name+ " "+coffees[i].price);
	}

}
// ��ü
class Coffee {
	// field
	String name;
	int price;
}