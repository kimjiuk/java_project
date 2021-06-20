package pizza;
/*  Author: jiuk Kim  
 * E-mail: kims2521@naver.com  
 * Course: Java Programming 
 * Assignment: Programming Assignment 1 
 * Due date: 05/18/2020  
 * File: PizzaDriver.java  
 * Purpose: Java application that implements an online specialty pizza shop  
 * Compiler/eclipse: Java SE Development Kit 8u181/IntelliJ IDEA 
 * Operating system: MS Windows 10  
 * Reference(s): Java 8 API - Oracle Documentation (http://docs.oracle.com/javase/8/docs/api/);  (Include ALL additional references (Web page, etc.) here.) 
 */ 
public class PizzaDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("2016250010 김지욱");
		System.out.println("Welcome to 지욱's Pizza of West Chester!");
		System.out.println("***************************************");
		OrderItem order = new OrderItem();//OrderItem메소드를 호출합니다.
		boolean a = true;
		while(a) {
		order.displayPizzaMenu();// 이 메소드는 피자메뉴를 보여주는 메소드입니다.
		order.getPizzaChoice();// 이 메소드는 피자의 유형,사이즈를 선택하는 메소드입니다.
			if(order.num==6) {
				a=false;
			}// order.num ==6 는 피자나가기 메뉴를 선택시에 반복문을 종료합니다.
		}
		order.processCreditCardPayment();// 이 메소드는 현금 결제할 경우과 카드 결제할 경우를 나타내어 계산해주는 메소드입니다.
	}
}
