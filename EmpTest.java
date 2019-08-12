package session5;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee ID:");
		int empId=sc.nextInt();
		System.out.print("Enter employee name:");
		String empName=sc.next();
		System.out.print("Enter employee salary:");
		int empSal=sc.nextInt();
		
		TemporaryEmp a=new TemporaryEmp(empId,empName,empSal);
		a.calculate_balance_leaves();
		a.calculate_salary();
		System.out.println("Whether employee has 1 paid leave is "+a.avail_leave(1, 'P'));
		
		
		
		System.out.print("Enter employee ID:");
		empId=sc.nextInt();
		System.out.print("Enter employee name:");
		empName=sc.next();
		System.out.print("Enter employee basic salary:");
		empSal=sc.nextInt();
		System.out.print("Enter employee paid leave days:");
		int paidL=sc.nextInt();
		System.out.print("Enter employee sick leave days:");
		int sickL=sc.nextInt();
		System.out.print("Enter employee casual leave days:");
		int casualL=sc.nextInt();
		PermanentEmp b=new PermanentEmp(empId,empName,paidL,sickL,casualL,empSal);
		
		b.calculate_balance_leaves();
		b.calculate_salary();
		System.out.println("Whether employee has 2 paid leave days is "+b.avail_leave(2, 'P'));
		sc.close();
	}

}
