package pizza;

import java.util.Scanner;

public class OrderItem {
	String size;//������ ũ�⸦ �Ҵ����ִ� �����Դϴ�.
	String type;//������ ������ �Ҵ����ִ� �����Դϴ�.
	double price=0;//������ ������ ���� ������ �Ҵ����ִ� �����Դϴ�.
	double total=0; //�ֹ��� ������ �Ѿ��� �˷��ִ� �����Դϴ�.
	double value = 0; //�� ������ ������ �˷��ִ� �����Դϴ�.
	int count=0; // �迭�� ũ�⿡ �ʿ��� �����Դϴ�.
	/* a1�� size,a2�� type,a3�� num3,a4�� price �� �Ҵ��ϱ� ���� �迭�� �������ݴϴ�.*/
	String[] a1 = new String[10]; 
	String[] a2 = new String[10];
	int[] a3 = new int[10];
	double[] a4 = new double[10];
	/* while �ݺ����� ���� �޴��������� 6���� ���������� �ֹ��� ��� �̾����� �ֵ��� �մϴ�.*/
	int num;//������ ���� ��ȣ
	int num2;//������ ũ�� �Է�
	
	public void displayPizzaMenu() {
		System.out.println("Speciality Pizza Menu");
		System.out.println();
		System.out.println("1) Meat Lovers");
		System.out.println("2) Vegetarian");
		System.out.println("3) Hawaiian");
		System.out.println("4) Philly Steak");
		System.out.println("5) BBQ Chicken");
		System.out.println("6) �޴�������");
		System.out.print("Your choise(1-6)?");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();//������ ������ �Է����ݴϴ�.
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
		      }// ������ ������ �ֹ������� �����ִ� �ڵ��Դϴ�,
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
			num2=sc.nextInt();//������ ũ�⸦ �Է����ݴϴ�.
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
				int num3 = sc.nextInt();//������ ������ num3�� �Ҵ����ݴϴ�.		
				System.out.println("***************************");	
				total += value*num3;
				price = value*num3;
				System.out.println("Your current order total is $ "+total);
				System.out.println("***************************");	
				Double.toString(price);//toString�� �̿��Ͽ� price ���� ���ڿ��� ����� �迭�� ��簪���� ���ڿ��� ��µǵ��� ���α׷����غ��Ҵ�.
				Integer.toString(num3);//toString�� �̿��Ͽ� num3 ���� ���ڿ��� ����� �迭�� ��簪���� ���ڿ��� ��µǵ��� ���α׷����غ��Ҵ�.
				a1[count]=type;
				a2[count]=size;
				a3[count]=num3;
				a4[count]=price;// ������ ����,ũ�� ����,������ �� �迭�� �Ҵ����ݴϴ�.
				return count++;//���� �ֹ��� �ʿ��� �迭�� ũ�⸦ �߰���Ű�� ���� count �� ������ŵ�ϴ�.
		
		}
	public void processCreditCardPayment(){
		System.out.println("How do you wish to pay for your order??");
		System.out.print("(Enter 1 for cash or 2 for credit.):");
		Scanner sc = new Scanner(System.in);
		int num4=sc.nextInt();//������ 1�� ī���2�� �����Ͽ� �������� ����մϴ�.
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
			System.out.println("Thank you for visiting ����'s Pizza of west Chester!");
			System.out.println("Come back soon!");
			System.out.println("***************************");
			System.out.println("Credit payment sumary:");
			System.out.println("Customer Name: "+name);
			System.out.println("Payment amount:$ "+total);
			System.out.println("Card number: *******"+number.substring(number.length()-4));//substring �޼ҵ�� ���ڸ� 4�ڸ� �κб��� �����ִ� �ڵ��Դϴ�.
			System.out.println("Exp date: "+date);
		}System.out.println("Thank you for visiting ����'s Pizza of west Chester!");
		System.out.println("Come back soon!");
		System.out.println("***************************");
	}
}
