package com.ifelse;
import java.util.*;

public class find_max_and_min_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		int num2 = sc.nextInt();
		
		if( num1 > num2 ) {
			System.out.println(num1+" is grater than "+num2);
		}
		else if( num1 == num2 ){
			System.out.println(num1+" is equal to "+num2);
		}
		else {
			System.out.println(num1+" is greater than "+num2);
		}

	}

}
