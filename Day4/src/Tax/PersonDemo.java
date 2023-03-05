package Tax;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the person name");
		String name = in.next();
		System.out.println("Enter the person Age");
		int age = in.nextInt();
		System.out.println("Enter the person gender");
		String gender = in.next();
		System.out.println("Enter the person Income");
		int income = in.nextInt();
		
		Person p1 = new Person();
		p1.setName(name);
		p1.setAge(age);
		p1.setGender(gender);
		p1.setIncome(income);
		
		System.out.println("Before Calculating tax : ");
		System.out.println(p1);
		TaxCalculation tax = new TaxCalculation();
		System.out.println("After Calculating tax : ");
		tax.calculateTax(p1);
		System.out.println(p1);
		
	}

}
