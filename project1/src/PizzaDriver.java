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
		System.out.println("2016250010 ������");
		System.out.println("Welcome to ����'s Pizza of West Chester!");
		System.out.println("***************************************");
		OrderItem order = new OrderItem();//OrderItem�޼ҵ带 ȣ���մϴ�.
		boolean a = true;
		while(a) {
		order.displayPizzaMenu();// �� �޼ҵ�� ���ڸ޴��� �����ִ� �޼ҵ��Դϴ�.
		order.getPizzaChoice();// �� �޼ҵ�� ������ ����,����� �����ϴ� �޼ҵ��Դϴ�.
			if(order.num==6) {
				a=false;
			}// order.num ==6 �� ���ڳ����� �޴��� ���ýÿ� �ݺ����� �����մϴ�.
		}
		order.processCreditCardPayment();// �� �޼ҵ�� ���� ������ ���� ī�� ������ ��츦 ��Ÿ���� ������ִ� �޼ҵ��Դϴ�.
	}
}
