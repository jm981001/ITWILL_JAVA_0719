package oop;
//하나의 소스파일(.java) 내의 복수개의 클래스 정의 가능
//단, 파일명과 동일한 클래스에만 public 접근제한자를 붙이고
//나머지 클래스에는 public을 붙이지 않도록 한다!

//Animal 클래스 정의
//- 멤버변수: 이름(name, 문자열), 나이(age, 정수)
//- 메서드: cry() - 파라미터와 리턴값은 없음. "동물 울음 소리!" 출력
class Animal {
	String name;
	int age;
	
	public void cry() {
		System.out.println("동물 울음 소리!");//메소드
	}
}


public class Ex2 {
	public static void main(String[] args) {
		//Animal 인스턴스 생성
		//이름 : 도토리, 나이: 8
		Animal a= new Animal();
		a.name = "도토리";
		a.age = 8;
		System.out.println("이름 : " + a.name + ", 나이 : "+a.age);
		a.cry();
		
		//Animal 인스턴스 생성
		//이름 : 백먼지, 나이: 3
		Animal b= new Animal();
		b.name = "백먼지";
		b.age = 3;
		System.out.println("이름 : " + b.name + ", 나이 : "+b.age);
		b.cry();
	
		System.out.println("=======================================");
		
		Student s1 = new Student();
		System.out.println("이름 : " + s1.name);
		System.out.println("학번 : " + s1.id);
		System.out.println("나이 : " + s1.age);
		//이 두개는 다른것
		Student s2 = new Student();
		System.out.println("이름 : " + s2.name);
		System.out.println("학번 : " + s2.id);
		System.out.println("나이 : " + s2.age);
		
		System.out.println("=======================================");
		
		s1.name = "손정민";
		s1.id = "sjm";
		s1.age = 25;
		s1.kor = 100;
		s1.eng = 100;
		s1.mat = 100;
		
//		System.out.println("이름 : " + s1.name);
//		System.out.println("아이디: " + s1.id);
//		System.out.println("나이 : " + s1.age);
//		System.out.println("국어점수 : " + s1.kor);
//		System.out.println("영어점수 : " + s1.eng);
//		System.out.println("수학점수 : " + s1.mat);
		//이거 대신
		s1.showStudentInfo(); //이렇게 사용해주면 됨
		s2.showStudentInfo();
		
		System.out.println("=======================================");
		System.out.println("s1 합계 : " + s1.getTotal()); //("합계 : " + 300)과 동일
		System.out.println("s2 합계 : " + s2.getTotal()); //("합계 : " + 0)과 동일
		
		System.out.println("s1 평균 : " + s1.getAvg());
	}

}

//Student 클래스 정의
// 멤버변수 : 이름(name, 문자열), 학번(id, 문자열), 나이(age, 정수),
// 국어점수(kor, 정수), 영어점수(eng, 정수), 수학점수(mat, 정수)

class Student {
	//멤버변수(인스턴스 변수)는 초기값을 지정해도 되고, 생략도 가능
	//=> 만약 초기값을 지정할 경우 인스턴스 생성할 때마다 해당 초기값으로 초기화
	// 초기값을 지정을 생략하는 경우 기본 값으로 초기화
	String name;
	String id;
	int age;
	int kor;
	int eng;
	int mat;
	
	// showStudentInfo() 메서드 정의
	// 파라미터, 리턴값 없음. 다음과 같이 출력
	// 이름: XXX
	// 학번: XXX
	// 나이: ...
	public void showStudentInfo() {
		// 자신의 클래스에서 선언된 멤버변수는 클래스 내의 모든 메서드에서 접근이 가능
		// => 이때, 별도의 주소 지정없이 변수명만으로 접근가능
		// => 각 인스턴스에서 동일한 메서드를 호출하더라도
		//    인스턴스마다 멤버변수가 다르므로 실행 시 실제 저장된 데이터들은 서로 다름
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("나이 : " + age);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
	}
	
	public int getTotal() {
//		int sum = kor + eng + mat ;
//		return sum;
		return kor + eng + mat; //위와 동일 
	}
	
	public double getAvg() {
//		double avg = (kor + eng +mat) /3.0;
//		return avg;
//		return (kor + eng +mat) /3.0; //위와 동일
		//메서드 내에서 자신의 클래스 내에 이쓴ㄴ 다른 메서드를 호출 할 경우
		//멤버변수 접근 방법과 동일하게 호출하면 됨
		return getTotal()/3.0;        //위와 동일
	}
}

