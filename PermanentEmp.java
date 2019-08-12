package session5;

public class PermanentEmp extends Employee {
	int paid_leave,sick_leave,casual_leave;
	double basic,hra,pf;
	PermanentEmp(int empId,String empName,int paid_leave,int sick_leave,int casual_leave,double basic) {
		this.empId=empId;
		this.empName=empName;
		this.paid_leave=paid_leave;
		this.sick_leave=sick_leave;
		this.casual_leave=casual_leave;
		this.basic=basic;
		
	}
	void print_leave_details() {
		System.out.println("Paid leave is "+paid_leave+" days");
		System.out.println("Sick leave is "+sick_leave+" days");
		System.out.println("Casual leave is "+casual_leave+" days");
	}
	@Override
	void calculate_balance_leaves() {
		System.out.println("Total leave is: "+(paid_leave+sick_leave+casual_leave));
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if(no_of_leaves==0) {
			System.out.println("Are you sure you meant to ask if you had 0 days leave?");
			return false;
		}
		switch(type_of_leave) {
		case 'S':
			return sick_leave>=no_of_leaves;
		case 'P':
			return paid_leave>=no_of_leaves;
		case 'C':
			return casual_leave>=no_of_leaves;
		
		default:
			System.out.println("Invalid type of leave.  Must be S-Sick,P-paid, or C-casual");
			return false;
		}
	}

	@Override
	void calculate_salary() {
		pf=0.12*basic;
		hra=0.50*basic;
		total_salary=basic+hra-pf;
		System.out.println("Total salary is "+total_salary);
	}

}
