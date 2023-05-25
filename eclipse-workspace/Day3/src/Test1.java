
public class Test1 {

	public static void main(String[] args) {
		// ��ü �������� ���Ƿ� ���� �����ϴ� ���� ���Ѵ�
		// Ŭ���� ���ø� 
		// ������
		// ��� 
		// ĸ��ȭ
		// ���� : �ڵ� ���뼺, ��⼺ , �������� ����
		// ���� : ������  
//		Person newFace = new Person();
//		newFace.name = "����ȣ";
//		newFace.age = 29;
//		Person oldFace = new Person();
//		oldFace.name = "������";
//		oldFace.age = 21;
		String[] names = {"����ȣ", "������"};
		int[] ages = {29, 21};
		Person[] persons = new Person[2];
	
		for(int i=0; i < persons.length; i++) {
			Person person = new Person(names[0], ages[i]);
//			person.name = names[i];
//			person.age = ages[i];
			persons[i] = person;
//			if(i==4) {break;}
		}
		System.out.println(persons[0].equals(persons[1]));
		// foreach
		for(Person person:persons) {
			System.out.println(person.age + " "+ person.name);
			System.out.println(person);
			System.out.println(person.sound());
		}
		Animal cat = new Animal("������");
		System.out.println(cat.sound());
	}
}

class Person extends Sound{
	// field
	String name;
	int age;
	String address;
	// ���� �ҋ� ���δ� : ������ constructor
	// method
	// overload ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(int age) {
		this.age = age;
	}
	// method
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public int getAge(){
		return age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	public boolean equals(Person obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (age != obj.age)
			return false;
		if (name == null) {
			if (obj.name != null)
				return false;
		} else if (!name.equals(obj.name))
			return false;
		return true;
	}
	@Override
	public String sound() {
		return "�ȳ��ϼ���";
	}
	
}
class Animal extends Sound{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	@Override
	public String sound() {
		return name + " "+ name;
	}

	
}

abstract class Sound {
	abstract public String sound();
	public String sound2() {
		return "sound2";
	}
}

