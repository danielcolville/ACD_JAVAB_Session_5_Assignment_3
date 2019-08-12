package session5;

public class TemporaryEmp extends Employee {
	TemporaryEmp(int empId,String empName,double total_salary) {
		this.empId=empId;
		this.empName=empName;
		total_leaves=0;
		this.total_salary=total_salary;
	}
	@Override
	void calculate_balance_leaves() {
		System.out.println("Total leave number is "+total_leaves);
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		return false;
	}

	@Override
	void calculate_salary() {
		System.out.println("Total salary is "+total_salary);
	}

}
