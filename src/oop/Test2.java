package oop;
/*
 * 은행계좌 (Account2) 클래스 정의
 * - 멤버변수
 * 		1) 계좌번호(accountNo, "xxx-xxxx-xxx" = 문자열)
 * 		2) 예금주명(ownerName, "XXX" = 문자열)
 * 		3) 현재잔고(balance, XXXX = 정수)
 * - 메서드
 * 		1) showAccountInfo(): 계좌정보를 출력
 * 			- 매개변수 X, 리턴값 X
 * 			< 출력 예시 >
 * 			계좌번호 : 111-1111-111
 * 			예금주명 : 홍길동
 * 			현재잔고 : 100000원
 * 		2) deposit() : 입금 기능
 * 			- 매개변수 : 입금금액(정수, amount), 리턴값 X
 * 			- 입금할 금액(amount)을 전달받아 현재잔고(balance)에 누적
 * 			- 입금할 금액과 입금 후의 잔고를 다음과 같이 출력
 * 				입금금액 : XXX원
 * 				현재잔고 : XXX원
 * 		3) withdraw() : 출금 기능
 * 			- 매개변수 : 출금할 금액(정수, amount), 리턴값: 출금 성공 시 출금된 금액
 * 			- 출금할 금액(amount)을 전달받아 다음 조건에 따라 출금 수행
 * 				a. 출금할 금액보다 현재잔고가 작을 경우 (출금이 불가능할 경우)
 * 					출력) 출금할 금액: XXX원
 * 						 잔액이 부족하여 출금 불가! (현재잔고: XXX원)
 * 				b. 출금할 금액보다 현재잔고가 크거나 같을 경우 (출금이 가능할 경우)
 * 					출금할 금액만큼 현재잔고에서 차감 후 다음과 같이 출력
 * 					출력) 출금할 금액: XXX원
 * 						 현재잔고 : XXXX원 -> 출금하고 남은 금액만큼 출력
 * 						 출금할 금액만큼 리턴
 * */

class Account2{
	String accountNo;
	String ownerName;
	int balance;
	
	void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	void deposit(int amount) {//입금기능
		balance+=amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance+ "원");
	}
	int withdraw(int amount) {//출금기능
		if(balance>=amount) {
			balance-=amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("현재 잔고 : " + balance + "원");
			
		}else { 
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("잔액이 부족하여 출금 불가 (현재잔고 : " +balance +"원)" );
			amount=0;
		}
		return amount;
	}
	
	//계좌이체
	void transfer(int amount, Account2 other) { //Account2 other 계좌 자체를 전달받음
		balance -= amount; //내꺼
		other.balance += amount; //홍길동꺼
	}
}


public class Test2 {
	public static void main(String[] args) {
		Account2 a = new Account2();
		a.accountNo = "1111-1111-1111";
		a.ownerName = "손정민";
		a.balance= 100000;
		
		Account2 b = new Account2();
		b.accountNo = "2222-2222-2222";
		b.ownerName = "홍길동";
		b.balance= 100000;
		
		
		a.showAccountInfo();
		System.out.println("============================");
		
		a.deposit(100000);
		System.out.println("============================");
		
		System.out.println("출금금액 : "+ a.withdraw(100000)); //return amount 값이 전달됨
		System.out.println("============================");

		//계좌이체
		a.transfer(50000, b); //나 -> 홍길동
		a.showAccountInfo();
		b.showAccountInfo();
	}

}
