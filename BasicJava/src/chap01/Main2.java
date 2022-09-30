package chap01;

public class Main2 {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>(); //사과박스
		Box<Orange> oBox = new Box<>(); //오렌지박스, <>생략가능
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		aBox.set(new MiniApple());
		oBox.set(new MiniApple());
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
		
		
		/* 3. //에러발생
		Box<Apple> aBox = new Box<Apple>(); //사과박스
		Box<Orange> oBox = new Box<Orange>(); //오렌지박스
		
		aBox.set("Apple");
		oBox.set("Orange");
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());*/
		
		
		
		/* 2.
		Box aBox = new Box(); //사과박스
		Box oBox = new Box(); //오렌지박스
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		//우리엄마한테 받은 김치 박스 예시
		//우리엄마 김치상자니까 돌려줘야해
		//그래서 우리집 김치상자에다가 옮겨 담아요
		
		//Apple ap = (Apple) aBox; 에러발생
		//여기서 멤버필드를 private로 만들었기 때문에 get을 이용하여 박스에 담겨 있는 멤버필드를 ap에 넣어줘야한다.
		Apple ap = (Apple) aBox.get();
		Orange or = (Orange) oBox.get();
		
		System.out.println(ap); //우리집 김치상자에서 꺼내 먹는거
		System.out.println(or);*/
		
		
		/* 1.
		Box oBox = new Box(); //오렌지박스
		
		oBox.set(new Orange());
		System.out.println(oBox.get());
		
		//박스를 재사용
		oBox.set(new Apple());
		System.out.println(oBox.get());*/
	}
}

class MiniApple extends Apple{
	public String toString() {
		return "I am an MiniApple.";
	}
}

class Apple extends Orange{
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

/* 1,2.
 * class Box{
 */

	/*private Apple ap;
	public void set(Apple ap) {
		this.ap = ap;
	}
	
	public Apple get() {
		return this.ap;
	} 
	
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return this.obj;
	}
}*/
//제네릭
class Box <T>{

	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return this.obj;
	}
}


