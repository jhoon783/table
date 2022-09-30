package chap01;

abstract class Test{ // 추상클래스
	void print() {
		System.out.println("Test.print()실행");
	}
	abstract void show(); //추상메소드;
}
public class Main {
	
	public static void main(String[] args) {
		//멤버필드 소개(java.lang.Object.toString()/오버라이딩)
		//클래스 배열
		/*
		 Data[] data = new Data[3]; // 참조변수 3개
		 data[0] = new Data(); // 참조변수에 생상자 연결이 필수!!!
		 data[1] = new Info();
		 data[2] = new Person();
		 */
		
		// 부모클래스 이름(참조변수) = new 객체는 자식클래스로 생성
		/*Object[] obj = new Object[3]; //배열 사이즈 3 (생략 불가능);
		//int arr[] = {1,2,3,4};
		obj[0] = new Data();
		obj[1] = new Info();
		obj[2] = new Person();
		
		Object[] obj2 = new Object[] {new Data(), new Info(), new Person()};
		
		//부모이름으로 자식클래스를 관리하는 중
		for (Object object : obj) {
			System.out.println(object);
		}*/
		
		/*System.out.println(new Data().toString());
		System.out.println(new Info().toString());
		System.out.println(new Person().toString());*/
		
		//부모클래스 이름으로 자식 객체 생성
		//부모클래스 이름으로 자식 객체들을 관리, 통솔
		Test[] test = new Test[] {new Data(), new Info(), new Person()};
		
		for (Test t : test) {
			t.show();
		}
	}
}

/*class Data{
	String name = "Data";
	int age = 29;
	
	@Override
	public String toString() {
		return "Data"; 
	}
}

class Info{
	String name = "Info";
	int age = 39;
	@Override
	public String toString() {
		return "Info"; 
	}
}

class Person{
	String name = "Person";
	int age = 49;
	@Override
	public String toString() {
		return "Person"; 
	}
}*/
class Data extends Test{
	String name = "Data";
	int age = 29;
	
	@Override
	public void show() {
		System.out.println("Data"); 
	}
}

class Info extends Test{
	String name = "Info";
	int age = 39;
	
	@Override
	public void show() {
		System.out.println("Info");
	}
}

class Person extends Test{
	String name = "Person";
	int age = 49;
	
	@Override
	public void show() {
		System.out.println("Person");
	}
}



