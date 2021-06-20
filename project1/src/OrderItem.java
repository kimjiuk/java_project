package pizza;

import java.util.Scanner;

public class OrderItem {
	String size;//피자의 크기를 할당해주는 변수입니다.
	String type;//피자의 유형을 할당해주는 변수입니다.
	double price=0;//피자의 수량에 따른 가격을 할당해주는 변수입니다.
	double total=0; //주문한 피자의 총액을 알려주는 변수입니다.
	double value = 0; //각 피자의 가격을 알려주는 변수입니다.
	int count=0; // 배열의 크기에 필요한 변수입니다.
	/* a1은 size,a2는 type,a3는 num3,a4는 price 를 할당하기 위한 배열을 선언해줍니다.*/
	String[] a1 = new String[10]; 
	String[] a2 = new String[10];
	int[] a3 = new int[10];
	double[] a4 = new double[10];
	/* while 반복문을 통해 메뉴나가기인 6번을 누를때까지 주문이 계속 이어질수 있도록 합니다.*/
	int num;//피자의 유형 번호
	int num2;//피자의 크기 입력
	
	public void displayPizzaMenu() {
		System.out.println("Speciality Pizza Menu");
		System.out.println();
		System.out.println("1) Meat Lovers");
		System.out.println("2) Vegetarian");
		System.out.println("3) Hawaiian");
		System.out.println("4) Philly Steak");
		System.out.println("5) BBQ Chicken");
		System.out.println("6) 메뉴나가기");
		System.out.print("Your choise(1-6)?");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();//피자의 유형을 입력해줍니다.
	}

	public int getPizzaChoice() {
		if(num==1) {
			type = "Meat Lovers";
		}else if(num==2) {
			type = "Vegetarian";
		}else if(num==3) {
			type = "Hawaiian";
		}else if(num==4) {
			type = "Philly Steak";
		}else if(num==5) {
			type = "BBQ Chicken";
		}
		else if(num==6) {
			System.out.println("******************************");
			System.out.println("order summary:");
		    System.out.printf("%-14s %-14s %-14s %-14s\n", "Type","Size","Quantity","Price");
			System.out.println("************************************************************");
			for(int i=0;i<count;i++) {         
				 System.out.printf("%-14s", a1[i]);
		         System.out.printf("%-14s", a2[i]);
		         System.out.printf("%-14d", a3[i]);
		         System.out.printf("%-14.2f", a4[i]);
		         
		         System.out.println();
		      }// 다음은 피자의 주문내역을 보여주는 코드입니다,
			System.out.println("Order Total : $ "+total);
	     	return 0;
	     	
		}
			System.out.println("***************************");
			System.out.println("Avaliable Sizes and Prices");
			System.out.println("1)10\"personal    -$10.0");
			System.out.println("2)14\"Medium      -$14.5");
			System.out.println("3)16\"Large       -$19.0");
			System.out.println("4)18\"Extra Large -$23.5");
			System.out.print("Your choise(1-4)?");
			Scanner sc = new Scanner(System.in);
			num2=sc.nextInt();//피자의 크기를 입력해줍니다.
			System.out.println("***************************");
			
			if(num2== 1) {
				value=10.0;	
				size = "personal";
			}else if(num2 ==2) {
				value=14.5;
				size = "Medium";
			}else if(num2==3) {
				size = "Large";
				value=19.0;
			}else if(num2==4) {
				size = "Extra size";
				value=23.5;
			}
				System.out.print("How many "+size+" pizza?");
				int num3 = sc.nextInt();//피자의 수량을 num3에 할당해줍니다.		
				System.out.println("***************************");	
				total += value*num3;
				price = value*num3;
				System.out.println("Your current order total is $ "+total);
				System.out.println("***************************");	
				Double.toString(price);//toString을 이용하여 price 값을 문자열로 만들고 배열에 모든값들이 문자열로 출력되도록 프로그래밍해보았다.
				Integer.toString(num3);//toString을 이용하여 num3 값을 문자열로 만들고 배열에 모든값들이 문자열로 출력되도록 프로그래밍해보았다.
				a1[count]=type;
				a2[count]=size;
				a3[count]=num3;
				a4[count]=price;// 피자의 유형,크기 수량,가격을 각 배열에 할당해줍니다.
				return count++;//다음 주문에 필요한 배열의 크기를 중가시키기 위해 count 를 증가시킵니다.
		
		}
	public void processCreditCardPayment(){
		System.out.println("How do you wish to pay for your order??");
		System.out.print("(Enter 1 for cash or 2 for credit.):");
		Scanner sc = new Scanner(System.in);
		int num4=sc.nextInt();//현금은 1번 카드는2번 선택하여 영수증을 출력합니다.
		if(num4==1) {
		System.out.println("Cash payent summary:");
		System.out.println("Payment amount: $ "+total);
		System.out.println("***************************");
		}else if(num4==2) {
			System.out.println("Please enter your payment information:");
			System.out.print("Card holder name:");
			String name=sc.next();
			System.out.print("Credit card type(e.g..MasterCard): ");
			String type=sc.next();
			System.out.print("Credit card number(e.g..11089772521): ");
			String number=sc.next();
			System.out.print("Expiration date(e.g..10/2016): ");
			String date = sc.next();
			System.out.println();
			System.out.println("***************************");
			System.out.println("Credit payment summary:");
			System.out.println("Thank you for visiting 지욱's Pizza of west Chester!");
			System.out.println("Come back soon!");
			System.out.println("***************************");
			System.out.println("Credit payment sumary:");
			System.out.println("Customer Name: "+name);
			System.out.println("Payment amount:$ "+total);
			System.out.println("Card number: *******"+number.substring(number.length()-4));//substring 메소드로 뒷자리 4자리 부분까지 보여주는 코드입니다.
			System.out.println("Exp date: "+date);
		}System.out.println("Thank you for visiting 지욱's Pizza of west Chester!");
		System.out.println("Come back soon!");
		System.out.println("***************************");
	}
}
