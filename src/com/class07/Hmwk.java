package com.class07;

public class Hmwk {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(“please enter 2 numbers”);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println(“please enter an operator”);
		char oper = sc.next().charAt(0);
		double res;
		
		switch(oper) {
		case ‘+’:
			res = num1 + num2;
			break;
		case ‘-’:
			res = num1 - num2;
			break;
		case ‘/’:
			res = num1 / num2;
			break;
		case ‘*’:
			res = num1 * num2;
			break;
			
			default:
				res = 0;
				System.out.println(“You entered invalid operator”);
		
		}
		System.out.println(num1+ ” ” + oper+ ” ” +num2+” = “+res );
		
		
	}
}

	}

}
