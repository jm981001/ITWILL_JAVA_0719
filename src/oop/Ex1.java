package oop;

public class Ex1 {
	//
	//
	//
	public static void main(String[] args) {
		//
		//
		//
		
		//1. person 타입 변수 p선언
//		Person p ;
//		System.out.println(p); //초기화가 되어있지 않아 출력 불가능
		
		//2. Person클래스의 인스턴스(객체)를 생성하여 변수 p에 해당하는 인스턴스 주소 전달
//		p = new Person(); //Heap공간에 생성된 인스턴스 주소가 리턴되어 p에 저장됨
	
		//위 두 문장을 한문장으로 결합!
		Person p = new Person();
		
		//참조변수를 통해 인스턴스에 접근하여 멤버변수 값을 출력하고, 메서드 호출
		//1. 멤버변수값 출력
		System.out.println("이름(p.name): " + p.name);
		System.out.println("나이(p.age): " + p.age);
		System.out.println("배고픔(p.isHungry): " + p.isHungry);
		System.out.println("===============================");

		//2. 메서드 호출
		p.eat();
		p.talk();
		System.out.println("===============================");
		
		//인스턴스의 멤버변수 초기화(값 저장)
		//참조변수명.멤버변수명 = 값; (b1.width = 100;)
		p.name = "홍길동";
		p.age = 20;
		p.isHungry = true;
		System.out.println("이름(p.name): " + p.name);
		System.out.println("나이(p.age): " + p.age);
		System.out.println("배고픔(p.isHungry): " + p.isHungry);
		System.out.println("===============================");

		// 인스턴스 p2 생성
		//p2의 이름을 자신의 이름, 나이 ,배고픔 유무를 설정 후 출력
		Person p2 = new Person();
		p2.name = "손정민";
		p2.age = 25;
		p2.isHungry = true;
		System.out.println("이름(p2.name): " + p2.name);
		System.out.println("나이(p2.age): " + p2.age);
		System.out.println("배고픔(p2.isHungry): " + p2.isHungry);
		System.out.println("===============================");
		
	}

}
